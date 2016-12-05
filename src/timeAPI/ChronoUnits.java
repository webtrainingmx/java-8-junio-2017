package timeAPI;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/time/temporal/ChronoUnit.html">chrono units</a>
 */
public class ChronoUnits {
    public static void main(String args[]){
        ChronoUnits chronoUnits = new ChronoUnits();
        chronoUnits.init();
    }

    public void init(){

        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);


        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next week: " + nextWeek);


        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + nextMonth);


        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("Next year: " + nextYear);


        LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
        System.out.println("Date after ten years: " + nextDecade);
    }
}
