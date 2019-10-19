package socks;

import java.io.IOException;
import java.net.DatagramPacket; 
import java.net.DatagramSocket; 
import java.net.SocketException; 
  
public class UDPServer { 
  
    
  public static void main(String[] args) throws IOException { 
    byte[] buf = new byte[1024]; 
    DatagramPacket dp = new DatagramPacket(buf, buf.length);//声明一个用来接收数据的“包裹” 
    DatagramSocket ds = new DatagramSocket(5678);//指定的是UDP中的端口号5678，在TCP中，还有另外一个端口号为5678的端口 
    while(true){ 
      ds.receive(dp); //阻塞式的 
      System.out.println(new String(buf,0,dp.getLength()));//dp中获取的数据的长度 
    } 
  
  } 
  
} 