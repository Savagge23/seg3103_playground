import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DateNextDateExceptionTest
{
    @ParameterizedTest
    @CsvSource({
            "2020, 2, 30, day must less than 29 for month February on a leap year.",
            "2021, 2, 30, day must less than 28 for month February on a non leap year.",
            "-1, 2, 3, year must be greater or equal to 0.",
            "2022, 3, 50, day must less or equal to 31.",
            "2024, -10, 21, month must be between 1 and 12."
    })
    void testNextDates(int year, int month, int day, String expectedMessage){

        Throwable exception = Assert.assertThrows(IllegalArgumentException.class, () -> {new Date(year,month,day); });
        assertEquals(expectedMessage , exception.getMessage());
    }

}