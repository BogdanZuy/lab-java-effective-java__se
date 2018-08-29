package name.zuy.lab.java.item4;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Person {
    private final Date birthDate;

    // make Date constants to reuse it in methods
    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        // Create Calendar object
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0,0,0);
        BOOM_START = gmtCal.getTime();

        // reuse Calendar object
        gmtCal.set(1965,Calendar.JANUARY,1,0,0,0);
        BOOM_END = gmtCal.getTime();
    }

    public Person(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isBabyBoomer() {
        return birthDate.compareTo(BOOM_START) >= 0 &&
                birthDate.compareTo(BOOM_END) <0;
    }


}
