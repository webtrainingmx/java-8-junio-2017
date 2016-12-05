package timeAPI;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html"></a>duration</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/time/Period.html">period</a>
 */
public class PeriodAndDuration {
    public static void main(String args[]){
        PeriodAndDuration periodAndDuration = new PeriodAndDuration();
        periodAndDuration.init();
    }

    public void init(){
        testPeriod();
        testDuration();
    }

    //A date-based amount of time in the ISO-8601 calendar system
    public void testPeriod(){
        LocalDate date1 = LocalDate.now();
        System.out.println("Current date: " + date1);

        LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
        date2 = date2.plus(1, ChronoUnit.DAYS);
        System.out.println("Next month: " + date2);

        Period period = Period.between(date2, date1);
        System.out.println("Period: " + period);
    }

    //A time-based amount of time.
    public void testDuration(){
        LocalTime time1 = LocalTime.now();
        Duration twoHours = Duration.ofHours(2);

        LocalTime time2 = time1.plus(twoHours);
        Duration duration = Duration.between(time1, time2);

        System.out.println("Duration: " + duration);
    }
}
