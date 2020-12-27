package org.LeDurga.zzz;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class YouNullify {

    private final Clock clock;

    public YouNullify(final Clock clock) {
        this.clock = clock;
    }

    public static void main(String[] args) {
        //System.out.println(getCurrentUTCTime());
        YouNullify obj = new YouNullify(Clock.systemUTC());
        System.out.println(obj.getCurrentUTCTime());
    }

    private OffsetDateTime getCurrentUTCTime() {
        return LocalDateTime
                .now(clock)
                .atOffset(ZoneOffset.UTC);
    }
}
