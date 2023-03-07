package Advance_java.Network;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkingDemo {
    public static void main(String[] args) throws UnknownHostException {
        String url="www.simplilearn.com";

        InetAddress inetAddress= Inet4Address.getByName(url);

        System.out.println("Address:"+ Arrays.toString(inetAddress.getAddress()));    // ip address

        System.out.println("host "+inetAddress.getHostAddress());

        System.out.println("LoopBackAddress " +inetAddress.isLoopbackAddress());

    }
}
