package com.mmall.common;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

    public static String app_id = "2018070360524249";

    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDO71C2oMvFYTB8yo0VhSZv6O0o6jAHzzmlOeeya7sp26HqS8nD8vgZo8GpRmgsZRWRSqCbW1eP3I0Uq58YI16gP8Xk5nYybyI/aiLck7PD/LnwAxh5HdsyqB+KoLLYBDQh81d9HZU3EhwDf7bd43Yo1qhpIuz+tG3teYWQCjiFkeCt6VuGHYnrcfZJxIJGhW6ZL1o5WOKGGPDlacrk0ICXuT24fJYZY0PAwZp75WqIoEPuUFsxXo69+3pNnT+IoAvDeWfZ/bbEAD6yDjUV2pdQ2ris+xRa+rihub9IqFXF/XQoDjW0TyV8qGDTMmYPWtSXmeNhAnorqgDXlRhBYf1RAgMBAAECggEAJAlvH+7OrbfoLsNDYI0IjZKdwnNOG/4NhuWXoO278WUrRFcgcvxcEnL/JdB6EckkwWGiqIt2qzn4Y7IjiZuXPgb9Goi76rqJ10tPeORL+QSJCPAxEd6OLrsyivzDSHUq8wKiqMo/ExEXSdCy8t9K03/WYkDPzudzAVkZVmVBRJk7n8xcoGZpaoAfdogGASOaoGITcETn8qlAaSXvnjpDMUyJCuI6Ujbj+wRdifUx6NBm+Do9rN8KvEYDOhBeBQWabmQVlU92IO21qKcV5TWx2vAkaA/FhEL/tYHKzJUV7HPKom2uG+4IuGRoXb1vdLNOkPwtWLjgdrGivF39L27aMQKBgQDz3I8SzNcmfOxnGP1fy8Vkk1pSDjb+HSzXbCllCQ7EvWaLUUAlqTJXU2T11nbZ8HGkvEYfLK0IzhqWLW0Dci7MsRbEC6Hup4OWMYByIHDSuVeErJVNXW28toB/Clwm5VeetfOXA8ggsCLaaJBZrjBI7ZOFkgZGMdb5ZJKZHgRCRQKBgQDZPDZRf9oTSg9Z4X9Si2cEe5OsWjqVWhGaDx/yM+lb8xesptIXYQX28v7TeVbhkY7gUdd/qpiiU7j51ji2KyG+B2e7cGVZhRWTnHaOWjPu4bZ+fScA7YYTe2VjLogPtZwkTn/nfEiOtwH/Z1cUvjxk8UUkY3hxFhtnI1H0qjIFnQKBgHqnjeLT2sdGABWe8Rn0wPTkVIJ/GdPYUsyLX4qs8pur897Q4CXRIzve+yHXW/IkSNSlydM2QlXybFbqxDD+hmF4FM5IV4tVAA9UGJnOjVC/3jAiKfo+qspHNPww9sathdOTCtEDGu6uCOm3vBsPTMPxksiU+MjnmovXtRCEk3nNAoGAS8EJmCYjoDJlZAyU3+4pAJEvkBzu7QI5vSWlGEsuB5igGt8ZyHlXISTf5FMeDw85adRgd+6/x2u2x7kCkdQ8sg3XCLBLR4p3WcBoP4AJODaR804leddauBSB6LJjVEcaqjaNt+XJT6tWEQCyh1NHsFPKrsPZTmZNLAxPGij3xKkCgYA54mWxUm8ASLXgkHpbgVDbjL39rXlxNQ5ZHUFCttuOasTD5k2qpkdhhv7BElO0VURDjp8qBKlmExzrnf3PZmFaLL8+0gI5KlQlQ09cmk+Rs0fz2z5rKwyAx7mWNP9st5GiCcSnR5iULEhl1oYlL5cR9mqeLn1mPC6SEYPlHiQhZg==";

    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwTBLGo4+YYADjATOkLuGZqlz8CWeOEMVIZ/ne6zpRojCP8O/urOhilGYigpFKzcYkY7q2qD/xacGCvM165CNIpqTTqL28ZKqJhS9OU06pGjczGmmP52VtNjZsN//5ss1j0KqPXToMqegRqUcyOc+i3jxBn3XGfZKBYG903LZroV2Y6kQpq4MlyxOL2YhDRbvRIAF60FzQgbItyGzYpupF2aDATV2PO9aSom5ZG4Li6neeq/YGZ/h6R8tZqCFyYKjrPbdArH+priR7zw+gM+v7UuCpkbqpmzfewLDQJB6r2k/UBl/vx/D/ji6BT+AUuIwuNsQX1OXiJHwiNd88pJdtwIDAQAB";

    public static String sign_type = "RSA2";

    public static String charset = "utf-8";

    public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";

    public static String log_path = "C:\\";

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
