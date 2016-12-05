package timeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *  @see <a href=https://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html#format-java.time.format.DateTimeFormatter-">ZonedDateTime</a>
 */
public class ZonedDateTimeAPI {
    public static void main(String args[]){
        ZonedDateTimeAPI zonedDateTimeAPI = new ZonedDateTimeAPI();
    }

    public void init(){
        ZonedDateTime date1 = ZonedDateTime.now();
        System.out.println("date1: " + date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone: " + currentZone);
    }
}
