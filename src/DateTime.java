import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.now();
//        System.out.println(date);
//       // --------------------------------
//        LocalTime time = LocalTime.now();
//        System.out.println(time);
//        //---------------------------------
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);
//        //----------------
//        //UTC Timestamp
//        Instant instant = Instant.now();
//        System.out.println(instant);
//        // Custom Format
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss ");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

    }
}
