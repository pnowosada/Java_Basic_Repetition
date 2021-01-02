package java_exercises_1_mz.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Exercise_14 {
    ZoneId zoneId=ZoneId.of("Asia/Tokyo");
    LocalDateTime localDateTime =LocalDateTime.now(zoneId);
    public void showDateTime(){
        System.out.println("Current date and time in Tokyo: "+localDateTime);
    }
}
