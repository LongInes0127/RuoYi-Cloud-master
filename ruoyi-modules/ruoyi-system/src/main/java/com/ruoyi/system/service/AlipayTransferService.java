package com.ruoyi.system.service;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.CertAlipayRequest;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayFundTransUniTransferModel;
import com.alipay.api.domain.Participant;
import com.alipay.api.request.AlipayFundTransUniTransferRequest;
import com.alipay.api.response.AlipayFundTransUniTransferResponse;
import com.ruoyi.system.config.Config;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * 服务类，用于处理支付宝转账操作
 */
@Service
public class AlipayTransferService {

    private AlipayClient alipayClient;

    /**
     * 构造方法，初始化AlipayClient
     */
    public AlipayTransferService() {
        CertAlipayRequest alipayConfig = new CertAlipayRequest();
        alipayConfig.setServerUrl(Config.gatewayUrl);
        alipayConfig.setAppId(Config.app_id);
        alipayConfig.setCharset(Config.charset);
        alipayConfig.setSignType(Config.sign_type);
        alipayConfig.setFormat(Config.format);
        alipayConfig.setPrivateKey(Config.merchant_private_key);
        alipayConfig.setCertPath(Config.app_cert_path);
        alipayConfig.setAlipayPublicCertPath(Config.alipay_cert_path);
        alipayConfig.setRootCertPath(Config.alipay_root_cert_path);
		try {
			this.alipayClient = new DefaultAlipayClient(alipayConfig);
		} catch (AlipayApiException e) {
			throw new RuntimeException(e);
		}
	}

    /**
     * 执行支付宝转账
     *
     * @param transAmount      转账金额（如："50.00"）
     * @param orderTitle       订单标题（如："提现订单"）
     * @param payeeIdentityType 收款方身份类型（如："ALIPAY_LOGON_ID"）
     * @param payeeIdentity    收款方身份标识（如："18398363336"）
     * @param payeeName        收款方真实姓名（如："殷小强"）
     * @param remark           转账备注（如："提现备注"）
     * @return AlipayFundTransUniTransferResponse 转账响应
     * @throws AlipayApiException 转账过程中发生的异常
     */
    public AlipayFundTransUniTransferResponse transferFunds(
            String transAmount,
            String orderTitle,
            String payeeIdentityType,
            String payeeIdentity,
            String payeeName,
            String remark
    ) throws AlipayApiException {

        // 创建转账请求
        AlipayFundTransUniTransferRequest request = new AlipayFundTransUniTransferRequest();

        AlipayFundTransUniTransferModel model = new AlipayFundTransUniTransferModel();

        // 动态生成唯一订单号
        String outBizNo = "TXN" + UUID.randomUUID().toString().replace("-", "");
        model.setOutBizNo(outBizNo); // 确保唯一

        // 设置必传参数
        model.setTransAmount(transAmount); // 转账金额
        model.setProductCode("TRANS_ACCOUNT_NO_PWD");
        model.setBizScene("DIRECT_TRANSFER");
        model.setOrderTitle(orderTitle);

        // 收款方信息
        Participant payeeInfo = new Participant();
        payeeInfo.setIdentityType(payeeIdentityType); // 身份类型
        payeeInfo.setIdentity(payeeIdentity); // 身份标识
        payeeInfo.setName(payeeName); // 真实姓名
        model.setPayeeInfo(payeeInfo);

        // 可选参数
        model.setRemark(remark);
        model.setBusinessParams("{\"payer_show_name_use_alias\":\"true\"}");

        request.setBizModel(model);

        // 发送请求
        AlipayFundTransUniTransferResponse response = alipayClient.certificateExecute(request);

        return response;
    }
}
