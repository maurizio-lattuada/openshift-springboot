package software.catering.training.hello;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

public class HelloResponse {

    private final String message;
    private final String ip;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ip == null) ? 0 : ip.hashCode());
        result = prime * result + ((message == null) ? 0 : message.hashCode());
        result = prime * result + ((timeStamp == null) ? 0 : timeStamp.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HelloResponse other = (HelloResponse) obj;
        if (ip == null) {
            if (other.ip != null)
                return false;
        } else if (!ip.equals(other.ip))
            return false;
        if (message == null) {
            if (other.message != null)
                return false;
        } else if (!message.equals(other.message))
            return false;
        if (timeStamp == null) {
            if (other.timeStamp != null)
                return false;
        } else if (!timeStamp.equals(other.timeStamp))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "HelloResponse [message=" + message + ", ip=" + ip + ", timeStamp=" + timeStamp + "]";
    }

}