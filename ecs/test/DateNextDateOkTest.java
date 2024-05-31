import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class DateNextDateOkTest {

    @ParameterizedTest
    @CsvSource({
            "2020, 5, 23, 2020, 5, 24",
            "2021, 2, 14, 2021, 2, 15",
            "2023, 2, 28, 2023, 3, 1",
            "2022, 7, 5, 2022, 7, 6",
            "2023, 10, 21, 2023, 10, 22",
            "2017, 8, 12, 2017, 8, 13"
    })
    void testNextDates(int year, int month, int day, int nyear, int nmonth, int nday){
        Date d = new Date(year,month,day);
        assertEquals(new Date(nyear,nmonth,nday), d.nextDate());
    }


}