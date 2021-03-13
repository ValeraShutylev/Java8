package DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateAndTime {

    public static void main(String[] args) {

        // Clock - Текущее время в миллисекундах считается от 1970-01-01T00:00Z (UTC)
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.millis());


        // ZoneId - Часовые пояса
        System.out.println(ZoneId.getAvailableZoneIds());

        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Brazil/East");
        System.out.println(zone1.getRules());
        System.out.println(zone2.getRules());


        // LocalTime - Время с учетом часового пояса
        System.out.println(LocalTime.now(zone1));
        System.out.println(LocalTime.now(zone2));


        // LocalDate - Конкретная дата
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        LocalDate yesterday = tomorrow.minusDays(2);

        System.out.println(today);
        System.out.println(tomorrow);
        System.out.println(yesterday);

        LocalDate womansDay = LocalDate.of(2021, Month.MARCH, 8);
        DayOfWeek dayOfWeek = womansDay.getDayOfWeek();
        System.out.println(dayOfWeek);


        // LocalDateTime
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm:ss");
        String text = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(text);

    }

}
