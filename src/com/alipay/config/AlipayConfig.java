package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016091900547684";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEwAIBADANBgkqhkiG9w0BAQEFAASCBKowggSmAgEAAoIBAQCcH0bzR5t++NuHBuul//eX4XbdTJuPUT84bad3nOo8PVns/hhKQMLark1PaZKOF5nvyzkfh77BBC7Yw2LU0UMI3o49r+y9BNwgqYPE0dWqoDsfQRz85eVchRZNzNLHASHSI726IzavEVPVlgSDW9jjYtRe3pvocC64LmEFrMH3NFxYOsrilO+TapdU93cv/tM0W7bMmPGxWzLAElhXg7dfzac3JA3XkJYH0Vz8Yc1vW8i/JlwG+iKdvl4bgavArSQVly9YikkfWSJB3YP8or4Yw9nLFeOTvUMxagTHfSDC1XpcIa1y7KNauJQTo4jeHcHS7UpRNYl7xaNsSDOlBL5rAgMBAAECggEBAJeeEGtnGW3gBGJHqEaYJT3M6oDUSyaOAtWsOD0DmL9T3ac4xSInbpStPctnfbqc1RR5ykoCrJAKnexJJAwGBhHxATaLSV/v/k+CEMPt/JEt9vzNYXeBVJPbc+OujOxS/yNzLmg8lnjCXSZKAKwJYMLDUfeoPMUpXVXlRLgcJGsLVrIfUYYjdo53Wo/UcjykvHPrKEQCGpNcRC/FbavIEtqAFRZYmzYc3P3nqY/YuIa2dtcsq4RgUKhv4NZ3osrpHRncxu/e04exZGJEFfdbaqQp4K5ToORHYiFj8pGjZx9EkSRqP1cI0CKZfMy4Hxs+EqJM0VVnthljkfLzgmZTaXECgYEA7VagqAlFdCMHWVh7OyCTVka+9J5zhj8UWshILI4M+80B5Dw0MAaJ+GtbzS0MGu/pvPlsvXvVRyp1ANjzRmPDombmlVjOoRIV93X8HilDy4st6MccEakVfrclVpuTQy5uTXTzK0/HrP8SkJ6rLG5J/riyRbW76A4ZrsQZGHr2aLcCgYEAqGXaQI8zWxemMT0w8Bd377yRDZOeMoqySakfyGaAXhHnPDmjE1Nau4aLG2hz2sVXExgklY26GDUXqQeasN/aT3sVu9bsnBA8MTmvmfTMWkW/C6JKUPzkH6q6XxqV92hqvtmzmPRRFvkGRLBb5XYW0EDzbnbFnOMKz542BNl5m+0CgYEAsiOBNl6vGLpp+6+j3v9WVz2Gekir4Slbd8A4G+kK6bw4HTzq1tkxmZnLL7cODPHh+IsmCRr3PBEr/NTZ1A1xe2XM0G/1t4PBpRmTgHfsgMwYS02XTdIhZhjFF7pxz8z70XtkQTACaWCSaKYPSKwHMf8jH5uGTGi48ioRxAQXCwUCgYEAn3yfYSd+1xYl01qF384KTGaF5prZaDrNsk/YBx91EiLYosRfu2zlcNdzJgkeOKNP3YivFWk+R7D48KCAFGZeR4pmQhnCy+fgaiqdMi2T4SdPUgBpbBynHYq/qlTulXwyJQDgRMuXhS9ijWmOD1txLdll9EfOztCFK69Gr/8cWt0CgYEAma4D/QOTTZBa5sixtdABsLHV/UpfZ/xUmC1XDV274V80yPSuNIm+qkkZScFwVY8jbLYFOn9Uba7BSWtvjvyPTGdKi44cFpGYb1HI6fsc6dxsmfa/MDcuGaoAvpMQKDplzv8leD6pvsbecTfA3HqCePvdPjv0LIpPydsWbWeDywM=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoX0/NzMKKMUUN/PAWHJqtQNm77Jo0BS4NN/3CcLXMmCaU/J9SogKcLpVjQXP/YDp/XITUtBQHuBulvGD9TExD+gVCHKcCzFp41oKsSoCqX82fu3gi1K7iUrNKpq+nkeUALZEvMb9Bc+DsfbspySXuweQZd+5xs5CWczLZDEsPBg19qkpjySEu8BcvZulZ9kDwH85kOeDS8UlpCEuuVZ9o4qUaHT4W88MRidIwxEX1GkW8Vm05sasmP/RlA6P7MSW7j8SwXwzGmQoR4MBwcm8YjUEeErEgQiCfpkhXymYa4+lYMSsdKfYX71K+hcGuCaNZ5Qmff1rCFBWUSmS6dmeGQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

