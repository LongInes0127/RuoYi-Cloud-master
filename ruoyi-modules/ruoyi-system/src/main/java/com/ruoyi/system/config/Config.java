package com.ruoyi.system.config;

public class Config {
    // 支付宝网关地址
    public static final String gatewayUrl = "https://openapi.alipay.com/gateway.do";

    // 应用ID，在支付宝开放平台创建应用后获取
    public static final String app_id = "2021004156690975";

    // 请求使用的字符集
    public static final String charset = "UTF-8";

    // 签名类型，推荐使用 RSA2
    public static final String sign_type = "RSA2";

    // 返回格式，通常为 JSON
    public static final String format = "JSON";

    // 商户的私钥 (商户生成的 RSA2 密钥)
    public static final String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCCbqOzsJVpNtqrriLTB7adtZWKa6ZfWQdVGM/gX2uMZ7YW0dXIvlBCt3O3sRi3CU58nvdfeMWPlKypHVNYjL8IXqu0yBVizhFFEdzgymv/J+pX3zJrhH1oB1OdRaqqEBlkRZrDUIhNPe5MxxzxGDo4IOXPrzNRR6R9uj9Owg+dZih6+w+fISTPMwkykRpBCG7N9aKqAZjVUO5I3E2v3OICTwqf8cQ3BCC47hGOWmD+CwmGk/Sz+hlhcmigMm1BF2m8voc1AOjuow0noJF1PD9Tbbr3+rUOrXSFAhDRL3vaXJxWOwQGwKaOB9dTIa/PmoRSQvDOLS0zpwPne0xveBv1AgMBAAECggEACH8GgNT21pSxJ8+/CvoMpjdG125ttvZIqP1lxRrSGaJD1Taz81CaT849ZnDNyFZ921ZLjNeEHvczTAzR+gmpA/WOv8bsxbPgohwoxCfLYyKJfFHYqfJGbPlVNABuvocv8D0seJ6NUmK/XBb4RqgqWq+h6KZj9F5zU5FHQG0ZsUn3bvoWJUBDO3bgR9E+BCA32ugdvIIbJ2okqtDSwH1XNuGSvjkXByUSSjXU0Qbmmu+SIEfO9yBJn5p9mDXtP5dLY/Oopf6mDixsrAG2DPkyh5FmTpExc4OnccuVh3a4n7ucgvpgle7ZYpdj3R1S6EWiChFwA0Ain0nAtsNEbWC/4QKBgQDBWp+ESrpO57MsmL4jfpIdml0mN72CCAaS5rqi4FoGXCQrBy/26gCJp6gkTM4tMkNEzzia72muvW487FXqNahTjAARMaq4VQWiSaYFVp9BHcIARke+UEq8Lmw+SKn04jBomhK7h9cJTGZC/1JdnX/FqdMEUshTP9VMkYf4puKhyQKBgQCssRZVsuKy5lqEd6vgEeeYrMqFKgPTEVXdonJotT1vCQGUHDcVL/vjY4p3upQUgMA1dqf5WDAvKOWTWAUzvKoYdFL2uTMLynWbxkTIhoWEArPzyO+1owjFkGRUerbQpFML0kq7A7a+NkA5r8nNgzUr76ZPJZJvIBzLg4bV0E8ezQKBgQC++R048v4VVTBZSfvy3t6+smpyhvd8aSTlD1Mj8Ge6hGOMxCqRvAoP7DJcuCej6FMcsXd9QB6n4p3xOpSZIapB6rNeSCoQqplH82oxN59QF244CzJtPKy0NT3gPrDvGEEr75G0+7RekMEoRzo5EIjU2Kl9Sa5m21N3rv4Xj+2kUQKBgCpiaF3uQs+v0+WRTaD4JASH3Ejkr/2c0ptMJJJocUSQTE/iwO41UbhUlQafx3pkw0gb8Ew1hdX9TqNkRhqVopXP7xDZEZtCPK1X80fYJGrrEumxlovZEO0UbFuDptz8h9lt6qON3MtAm3DNIVWMb39yGTpxuUgG9KpKhMxzjQe9AoGBAK6vGGt3ysCAU9WWEzEZUHi4vqidT4lXc6XV5IHsGZJ061yQgonR9hNQvW3wGzPJQg4+oMHI0L63mzGSWfM1QDGjSJ04FhZHYT+brhSexmD9qRtsxaoVOE04Rnt/5rElXkl8OWEd264n9mErsZKs0/kxCrSqS4OEJcC9hBYihFbJ";

    // 应用证书路径（商户应用证书）
    public static final String app_cert_path = "/Users/apple/Downloads/支付宝/优选易推/appCertPublicKey_2021004156690975.crt"; // 本地测试路径
    //public static final String app_cert_path = "/opt/alipay/优选易推/appCertPublicKey_2021004156690975.crt";     // 服务器路径

    // 支付宝公钥证书路径（支付宝公钥证书）
    public static final String alipay_cert_path = "/Users/apple/Downloads/支付宝/优选易推/alipayCertPublicKey_RSA2.crt"; // 本地测试路径
    //public static final String alipay_cert_path = "/opt/alipay/优选易推/alipayCertPublicKey_RSA2.crt";      // 服务器路径

    // 支付宝根证书路径（支付宝根证书）
    public static final String alipay_root_cert_path = "/Users/apple/Downloads/支付宝/优选易推/alipayRootCert.crt";  // 本地测试路径
    //public static final String alipay_root_cert_path = "/opt/alipay/优选易推/alipayRootCert.crt";       // 服务器路径
}
