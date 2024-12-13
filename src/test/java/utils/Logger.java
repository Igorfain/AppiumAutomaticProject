package utils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static void log(String message) {
        String currentTime = LocalTime.now().format(TIME_FORMATTER);
        System.out.println(currentTime + " " + message);
    }
}
