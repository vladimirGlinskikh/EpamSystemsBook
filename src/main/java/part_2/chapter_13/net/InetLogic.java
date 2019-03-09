package part_2.chapter_13.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetLogic {
    public static void main(String[] args) {
        InetAddress currentIP = null;
        InetAddress bsuIP = null;
        try {
            currentIP = InetAddress.getLocalHost();
            System.out.println("Мой IP -> " + currentIP.getHostAddress());
            bsuIP = InetAddress.getByName("www.bsu.by");
            System.out.println("BSU -> " + bsuIP.getHostAddress());
        } catch (UnknownHostException e) {
            System.err.println("Адрес недоступен " + e);
        }
    }
}
