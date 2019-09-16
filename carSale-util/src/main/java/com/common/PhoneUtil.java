package com.common;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;

import javax.swing.text.html.FormSubmitEvent;

public class PhoneUtil {

    public boolean sandMassage(String yanZhengMa, String telphone) {
        DefaultProfile profile = DefaultProfile.getProfile("default", "LTAIHsLVzSBm2G8a", "99CL6YJY260YF07Vu6JLr8J7qxq1IV");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
//        request.setMethod(FormSubmitEvent.MethodType.POST);
        request.setMethod(com.aliyuncs.http.MethodType.POST);

        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("PhoneNumbers", telphone);
        request.putQueryParameter("SignName", "合众商城");
        request.putQueryParameter("TemplateCode", "SMS_169904124"); //# SMS_169899226   SMS_169904124 SMS_170156047
        request.putQueryParameter("TemplateParam", "{\"code\":" + yanZhengMa + "}");
        try {

            // client.getAcsResponse(request);
            //client.getAcsResponse(request)
            CommonResponse response = client.getCommonResponse(request);
            String data = response.getData();
            System.out.println(data);
            if (data.contains("OK")) {
                return true;
            }
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return false;
    }
}
