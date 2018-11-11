package com.dyy.utils;

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
	public static String app_id = "2016091300504420";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCcupN9UbKB5Qey/eZGh+qfAUsCsPmWTX9NJpQBwl9rxNSLQctdFAIbCIKNe0aRAHhPw9PYTG74bmnX64tKGlE2nGBzmILZDc4mKCK7G4lAzwS5tGyLYO3YegcLBv5CROuzOhpf+WMZzuPJJj55VdYGCQVkaMrMHAHR4WMoxa64VDETZ073s55jq9RCndNYFVdA5BzakiM0EuvAvbHREf3V47ivE42EyRLkAyIXvcAnRPN/li1CHwvcURC6tXtn8D0YNxYZJVjvYqhatHc1w4LXgdiP+wo6GjTKXYYA/gxTeCNs/kQdTZh/xiNdmRaRye+YeJTyIYhbdE5qVSB6loY5AgMBAAECggEAfGpcFNqa4ySl9QA7IfhZVvoWyr8kkp1Yli0uxyq+xvVMaHPFdVEhzsX1pUycGxWNbHyfGhCq8wnred1hCGVV3Q1MP9ds39Nmt8GauH/GeC0eqjDBDe/XP8a2+pkFlCPUG8XfFBsMAXvMNWznoThzmvzkS+4oNtlw1GSga8hpx6bFGiBUhwdE/KNTfzTeGS/v0wmbHQn/MmQwoCOqI20Y8Pzo+8/BusmQBtSvgCMw7vXpj0XsyoR2Zy6tp7waahLzKaXsTT43Zcgi9YygqfmJv7044qDDtNee7mjPLTXWKjBjrrA1jOqv7HuA5SugXjExA1EwWyIAlkLwa9WoNSBWxQKBgQDlLBlGsmeI7CUG2rRmvOE+MnOO1ztuqClbQfr0MNfcXRfhBpS7MMsUSJh+YatfyyPTfgh9HeaY8isDULV+631sr4ruVHvt8t3Z9BjCS4soQfZv6v0nl0kE8v/8mDVp20zEINplhiMspc8HIiU2MtPw/Ay0eH3KVper6WptIPSs6wKBgQCvE3iS1MvFdOM1Llt9YDL3T29q1OqJeoLFTDV0tdj27pB6pfUkcTb/Ouc0ptGwOimYjsK/bY66oX5y6Bgn9G7uNKzGjcdO3pVdn+RrQ4AiNMnsX2eesVisw2I2pdR7XAZwIr4h8xGT0Q1AanPku0kUbAo7W+54NSLotV8Gp2bAawKBgDfzDDi2VZCYFnIV8vUiJ9uHda7p3Rim9XHSKfJz+j9SewH1GVqaDvpkvtYcAjrg3V5E5s2k/ydX+ChXC/hwha6DLOgCuD7fjEopzeGhj9fEQuYP+L4xsSIEMXr5rhCp+ZPocWlX1j6QPHsBWxRgVF4BKxjkUdGUUnMmCVWbNiEBAoGACQTHwUiU9qb+zU6GB/9coMDGzIoLSum0stUqK8jyVEYVyzuhVS8/1gYCwwOU6a8VVXaFMbdDEvoeuWybUfOVg0/TVqcXDUkKCLij26KuhxSREkwX2mToXH30ITyJpZEoA77GbJlI3oR2WkshjTbYnOSz4jrqHece1T4ClyUodeECgYEAujQkK4dD5bgIZPxP/MN8S85knxlK4dp4y/7Bc1Z4wnRstUObGjBv8/2yZKvLGOqAUpbXOyHHtBwRPSdztXoAckZrR18oOToPUdHvcb30QEzpVSYOrKyqZzlDIDtsIhFsl2KIPtJiwEsVGn1mDmtQfx0eQ4L4kU1q8sm1HsuYNOU=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvtTutf7ElDZTuDye+76DhJwkRg0yZNI+Pm5vxeWIHiBJjFMAOPp+9ix7RoJYzoSGEqZQvbOb5nFv5QYoqoJvCM/Sc40u+NJD7yzHevDwFCwO9Qb+evILDLFxN+OY4vl9Jc6Dj0T3jTyx+RerYoJi9UaIdpinKHNa01j3qakZsL+t+6clvjym7T6o6DZmV6YNrP0Rt3ACpaLSXRis3LtFBVidKx63FBxt/LqoaSfC7THfLpmwf5ANYj4dYcI5Y2F8hSaU1PR208VnWWF9R0Kq8JMVJcyLfL/JVfH7oL+Lit8Z1cXBvqLvZ2JY1hP0wlbcRHqwtdA20vT/feNWUyxHBQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	//public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";
    public static String notify_url = "http://localhost:8080/alipay/alipayNotifyNotice.action";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	//public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";
    public static String return_url = "http://localhost:8080/alipay/alipayReturnNotice.action";
	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "F:\\";


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

