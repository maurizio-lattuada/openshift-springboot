package software.catering.training.hello;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

public class HelloResponse {

    private final String       message;
    private final String       ip;
    private final String timeStamp = new Date().toString();

    public HelloResponse(String message) throws UnknownHostException {
            ip = InetAddress.getLocalHost().getHostAddress();
            this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getIp() {
        return ip;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

}