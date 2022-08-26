package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Dates {

    // LocalDate - Represents a date (year, month, day (yyyy-MM-dd))
    public void printLocalDate(){
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate:" + localDate);
    }

    // LocalTime - Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
    public void printLocalTime(){
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime: " + localTime);
    }

    // LocalDateTime - Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
    public void printLocalDateTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: " + localDateTime);
    }
}
