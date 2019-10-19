package socks;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Udp {
    
    
    {
        try {
            DatagramSocket socket = new DatagramSocket();
            byte[] buf = new byte[1];
            buf[0] = 02;
            //将数据打包
            
            DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.0.49"), 30000);
            socket.send(packet);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
    
    /**
     * 接收数据的方法
     *
     * @throws Exception
     */
    
    
    public static void main(String[] args) {
        //send();
        Rescevice();
        
    }
    
    /**
     * 接收数据的方法
     */
    public static void Rescevice() {
        try {
            System.out.println("开始执行");
            DatagramSocket socket = new DatagramSocket(12459);
            while (true) {
                byte[] buf = new byte[1024];
                // 解析数据包
                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                socket.receive(packet);
                String ip = packet.getAddress().getHostAddress();
                buf = packet.getData();
                String data = new String(buf, 0, packet.getLength());
                System.out.println("收到 " + ip + " 发来的消息：" + data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}