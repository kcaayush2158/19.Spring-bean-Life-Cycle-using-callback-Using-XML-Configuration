package application.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message  {
    public Integer messageId;
    public String message;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public void afterPropertiesSet()throws Exception{
        System.out.println("Bean is in init process");
    }


    public void destroy()throws Exception{
        System.out.println("Bean is destroyed");
    }
}
