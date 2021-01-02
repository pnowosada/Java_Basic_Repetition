package java_exercises_1_mz.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Exercise_12 {
    LocalDate localDate1;
    LocalDate localDate2;

    public Exercise_12() {
        this.localDate1 = LocalDate.of(2017, 01, 01);
        this.localDate2 = LocalDate.of(2017, 05, 05);
    }

    public void periodOfTime() {
        Period period = Period.between(localDate1, localDate2);
        System.out.println("Period of time is: " + period);
    }
}
