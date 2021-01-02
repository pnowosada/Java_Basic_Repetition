package java_exercises_1_mz.DateAndTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exercise_15 {
    ZoneId zoneId=ZoneId.of("Europe/Warsaw");
    LocalDateTime localDateTime =LocalDateTime.now(zoneId);
    public void showDateTime(){
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern(", dd MMMM yyyy 'roku,' EEEE hh:mm:ss ",
                new Locale("pl"));
        String BydgoszczDataAndTime=localDateTime.format(dateTimeFormatter);
        System.out.println("Current date and time in Bydgoszcz: "+BydgoszczDataAndTime);
    }
}
