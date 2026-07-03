package util;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {

    public static String getCurrentDate() {
        DateTimeFormatter dateFormat =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return LocalDate.now().format(dateFormat);
    }

    public static String getCurrentTime() {
        DateTimeFormatter timeFormat =
                DateTimeFormatter.ofPattern("hh:mm:ss a");

        return LocalTime.now().format(timeFormat);
    }
}