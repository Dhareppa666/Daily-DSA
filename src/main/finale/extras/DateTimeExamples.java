package main.finale.extras;

import java.time.*;

public class DateTimeExamples {

    private final Clock clock;

    public DateTimeExamples(final Clock clock) {
        this.clock = clock;
    }

    public static void main(String[] args) {
       // System.out.println(getCurrentUTCTime());
        DateTimeExamples obj = new DateTimeExamples(Clock.systemUTC());
        OffsetDateTime time = obj.getCurrentUTCTime();
        System.out.println(time);
        System.out.println(obj.getCurrentUTCTime2(time));
    }

    private OffsetDateTime getCurrentUTCTime() {
        return LocalDateTime
                .now(clock)
                .atZone(ZoneId.of("Asia/Kolkata"))
                .toOffsetDateTime();
    }

    private ZonedDateTime getCurrentUTCTime2(OffsetDateTime offsetDateTime) {
        //System.out.println(TimeZone.getTimeZone("Australia/Sydney"));
        return offsetDateTime.atZoneSameInstant(ZoneId.of("Australia/Sydney"));
                /*
                LocalDateTime
                .now(clock)
                .atZone(ZoneId.of("Australia/Sydney"));*/
    }
}
