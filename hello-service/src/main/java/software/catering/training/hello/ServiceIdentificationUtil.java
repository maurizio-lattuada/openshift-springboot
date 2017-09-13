package software.catering.training.hello;

import java.net.InetAddress;
import java.net.UnknownHostException;

public final class ServiceIdentificationUtil {

    private ServiceIdentificationUtil() {
    }

    public static String getServiceIdentification() {
        String result;

        try {
            result = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            result = e.getMessage();
        }
        return result;
    }
}