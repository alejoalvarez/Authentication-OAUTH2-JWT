package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates {

    // LocalDate - Represents a date (year, month, day (yyyy-MM-dd))
    public void printLocalDate(){
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate:" + localDate); // Display the current date - yyyy-mm-dd
    }

    // LocalTime - Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
    public void printLocalTime(){
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime: " + localTime);
    }

    // LocalDateTime - Represents both a date and a time (yyyy-MM-ddTHH-mm-ss-ns)
    public void printLocalDateTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: " + localDateTime);
    }

    // DateTimeFormatter
    public void printDateFormatter(){
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj); // (yyyy-MM-ddTHH-mm-ss-ns)
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate); // dd-MM-yyyy HH:mm:ss
    }
}
