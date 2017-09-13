package software.catering.training.hello;

import java.util.Date;

public class HelloResponse {

    private final String message;
    private final String senderIp  = ServiceIdentificationUtil.getServiceIdentification();
    private final String timeStamp = new Date().toString();

    public HelloResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getSenderIp() {
        return senderIp;
    }

    public String getTimeStamp() {
        return timeStamp;
    }
}
