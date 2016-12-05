package timeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 *  @see <a href="https://docs.oracle.com/javase/8/docs/api/java/time/temporal/TemporalAdjusters.html">TemporalAdjusters</a>
 */
public class TemporalAdjustersExample {
    public static void main(String args[]){
        TemporalAdjustersExample temporalAdjustersExample = new TemporalAdjustersExample();
        temporalAdjustersExample.init();
    }

    public void init(){

        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);


        LocalDate nextTuesday = today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next Tuesday on : " + nextTuesday);


        LocalDate firstInYear = LocalDate.of(today.getYear(),today.getMonth(), 1);
        LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Second Saturday on : " + secondSaturday);
    }

}
