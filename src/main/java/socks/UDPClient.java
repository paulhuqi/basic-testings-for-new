package socks;

import java.io.IOException;
import java.net.DatagramPacket; 
import java.net.DatagramSocket; 
import java.net.InetSocketAddress; 
import java.net.SocketException; 
  
public class UDPClient { 
  
  public static void main(String[] args) throws IOException { 
//    byte[] buf = new String("Hello 你好~~").getBytes();
    String test = "Aug 21 15:35:30 172.16.0.147 Aug 21 15:35:33 sunyaos INSANT_MESSAGE: SerialNum=100QR-0O570-11005-80BT6-73VC1 GenTime=\"2019-08-21 15:35:33\" UserID=2 UserName=172.16.0.143 SrcIP=172.16.0.143 DstIP=182.254.50.114 Protocol=HTTP SrcPort=65072 DstPort=80 SrcMac=68:f7:28:67:4e:40 DstMac=68:ed:a4:09:fc:d5 AppName=QQ AppNameEn=qq AppCateName=中兴 AppAction=登录 Account=\"2408728024\" Content=\"\"";
    byte[] buf = new String(test).getBytes();
    //UDP是无连接的，所以要在发送的数据包裹中指定要发送到的ip：port
    DatagramPacket dp = new DatagramPacket(buf, buf.length, new InetSocketAddress("127.0.0.1", 5678)); 
    DatagramSocket ds = new DatagramSocket(9999); //指明发送端的端口号 
    while (true) {
      try {
        ds.send(dp);
        System.out.println("data send.");
        Thread.sleep(2000);
      } catch (Exception e){
        e.printStackTrace();
        ds.close();
      }
    }
  }
  
} 