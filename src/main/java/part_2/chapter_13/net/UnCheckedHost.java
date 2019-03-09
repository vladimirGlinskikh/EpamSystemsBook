package part_2.chapter_13.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UnCheckedHost {
    public static void main(String[] args) {
        byte ip[] = {(byte) 217, (byte) 21, (byte) 43, (byte) 3};
        try {
            InetAddress addr = InetAddress.getByAddress("University", ip);
            System.out.println(addr.getHostName()
                    + "-> соединение: " + addr.isReachable(1000));
        } catch (UnknownHostException e) {
            System.err.println("адрес недоступен " + e);
        } catch (IOException e) {
            System.err.println("ошибка потока " + e);
        }
    }
}
