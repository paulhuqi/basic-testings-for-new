package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date {
    
    public static void main(String[] args) {
//        System.out.println(new java.util.Date("yyyyMMddhhmmss").toString());
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
        System.out.println(now.getHour());
        System.out.println((now.getMinute()/5)*5);
        System.out.println(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
        System.out.println(LocalDateTime.parse("2019-08-21 15:35:33", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
                                   .atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() / 1000);
    }
}
