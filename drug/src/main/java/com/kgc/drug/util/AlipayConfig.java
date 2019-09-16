package com.kgc.drug.util;

import org.springframework.stereotype.Component;


@Component
public class AlipayConfig {

//    public static String app_id;
//
//    public static String merchant_private_key;
//
//    public static String alipay_public_key;
//
//    public static String notify_url;
//
//    public static String return_url;
//
//    public static String sign_type;
//
//    public static String charset;
//
//    public static String gatewayUrl;

    public static String app_id ="2016101100664432";
    public static String merchant_private_key ="MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCsg/4YHphGy7TtyXMPvxsMPhRdWdESknIXQp6IOV15dOtv+TNNs9UtebNr6c0yHZevzT9jqBl4s0QKSKOEXCn3kdVRf5LFRQDtVssG2QUuBua0uCceK5GX4tCtZLdAWuvuTLHpuv0lNNI+LXdFVcxe+Cc/ZUFX19lFpWrgt3mxYzHVEowKRmEks3gxYq03BPpWPYJzypNQZNyYnWPw7dt4pw8TzeLFh1mzgjUtkivTN8oG0ccbXgR8hYLFwxzoGUUqPNMf5WTJI0fNQ+yqndiTVp5iYTjOBA1uxcjoPkduj3LoVxJ9TvFY60HqOAV3jGSpkvlSzCZ1nb+e/OPGn1txAgMBAAECggEAWZza0baazTOl0VsyfLx9lVduBqvQMcCGqVR+uy5pQt0cK3ccUkGW+99a9zRk1aKPl8+bHO5GBO/B6UGgRvIFDsffMk19dSGKAL90CSOUUDtffgKmt0JUh7xXP6qwkipoocmPJWVvd/M/PvMpIIgX+EEZShIT5kiGYWoy4XYNLboJuRyQs6M6maaWoV4OIgkXCTC75T4QOCutErZwpEZbBNfShbospOMxCUprKDD2BOjUYUOqeGqhBSEaXbiGPr3Av54E3uAt9pbEFyoXXyU8YlFIvP1tmuPJB3R22cyPCy58epULXfn7HwN3Q8v9oXb1WtuvevHX1eTU6bMf0FAXzQKBgQDar0gWBDbuKpYU6U1cUlA5UfTk3W2/fVuPKVDkdeMvYpfw2xdfgdDFNS/6or721tRmOaYRCCHcRUByR3mh+oJQLcWhiMJ861+jT5+UrTle9gz9xjA0IoFblwb5Csl5ueqrrL2P4qmX7FL2uLiIbrvwc/9OKJY4SMT29XE6DdUE9wKBgQDJ8+yaUC1Q/tfoykzcmt3R0lSnf67SKxCpoiMTYG3Ea0iFsPVcfc5A1qOXNJfrIkg7uij7xseHFM4eUPNLe6fZuzWrTP9M2k6eyKEJ11otI+8WXLjl/IMQVBknXVoGvvywPnQJ9GLChbrBXdshV0HodfgtVGMqCwhGAe061m1Q1wKBgBf6dDsFx0giH0a3tiXTWLyQQfv+U5RVmH6AF0CVtI1zkBl2zH9KaqvVAyfGRI4oTC3RUGY5sAzJAyIEuE+MelF0U2E876Zm4Ju1lVfmDo5dCFujKZHt3qU+UCNqjWDtg8/DJx3pypK/9PDcnE9JZQ4eifX1+VK+l+pES2AEOEFNAoGAe/NapNvQ9IV1v0trIXtr6fxOOQAFLLmB4JvDK4Fj3cp7GJMkBUCx9tnGTmfZVlgUPZRk0yOOEzqRx8mnigy7WMeuiRUZHPJgjtRVAtVKY6pKdE80rPPu/XageaiyOLHAJewvDG0SsJGjrksM08naifLd//RraMKcsVs9X398WMECgYBg34JWeSFWVSXBGfThBj6nCKcrQMDLv4Z2d9GolNPjlma06fY6cxYJXVeSGm4QvoZqWAl8oSq0j0GaVTY8cjpnmZJ4QGuMYD6tU4TEAL2nSX8bFuxJ0l+Aon2FZkQyfOhCyLYJEr5AMQ4Zi/Nut05xaWcacltORhu/gzGJHTio7w==";
    public static String alipay_public_key ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApOKPf0SNaWeabP/vHou3P1T8zCSH9qoc1FOwfChQKOvnb+Dgvmz94B6jCPIoLHkidocfA5ngSX97YUnP9didwOm0etYTngF6QdVkVUCDVdY9K4tFNyN5qr6yMnaiGysr8X/+BvU5QSOcK4RecZ/8pznDKhgHs/rmQM8xrd9OCc37xZ7MLK4TbgCGmnvzKRFadTp3PeaX7J3zE5gQGcmobcsE3omov429yKNuXLpt5Ux2H4bqb8w7cPZ3aqRGCQTW8EN+x+pz+HKlbnO39lEHBxq1+tg+goFFw/3VpMyISMKm+bEyGu39XmXVnzPK5MY23ucApx7hNA77V264RV2JQwIDAQAB";
    public static String notify_url ="http://www.baidu.com";
    public static String return_url ="http://106.13.132.04:8080/Drug/zhifu1.action";
    public static String sign_type = "RSA2";
    public static String charset = "utf-8";
    public static String gatewayUrl="https://openapi.alipaydev.com/gateway.do";
}

