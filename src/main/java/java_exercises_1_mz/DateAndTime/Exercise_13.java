package java_exercises_1_mz.DateAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Exercise_13 {
    LocalTime localTime1;
    LocalTime localTime2;

    public Exercise_13() {
        this.localTime1 = LocalTime.of(14,11,00);
        this.localTime2 = LocalTime.of(18,41,00);
    }

    public void periodOfTime() {
        Duration duration = Duration.between(localTime2,localTime1);
        System.out.println("Period of time is: " + duration);
    }
}
