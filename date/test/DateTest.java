import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_tc01() {
    Date today = new Date(1700, 6, 20);
    Date expectedTomorrow = new Date(1700, 6, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc02() {
    Date today = new Date(2005, 4, 15);
    Date expectedTomorrow = new Date(2005, 4, 16);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc03() {
    Date today = new Date(1901, 7, 20);
    Date expectedTomorrow = new Date(1901, 7, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc04() {
    Date today = new Date(3456, 3, 27);
    Date expectedTomorrow = new Date(3456, 3, 28);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc05() {
    Date today = new Date(1500, 2, 17);
    Date expectedTomorrow = new Date(1500, 2, 18);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc06() {
    Date today = new Date(1700, 6, 29);
    Date expectedTomorrow = new Date(1700, 6, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc07() {
    Date today = new Date(1800, 11, 29);
    Date expectedTomorrow = new Date(1800, 11, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc08() {
    Date today = new Date(3453, 1, 29);
    Date expectedTomorrow = new Date(3453, 1, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc09() {
    Date today = new Date(444, 2, 29);
    Date expectedTomorrow = new Date(444, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc10() {
    Date today = new Date(2005, 4, 30);
    Date expectedTomorrow = new Date(2005, 5, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc11() {
    Date today = new Date(3453, 1, 30);
    Date expectedTomorrow = new Date(3453, 1, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc12() {
    Date today = new Date(3456, 3, 30);
    Date expectedTomorrow = new Date(3456, 3, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc13() {
    Date today = new Date(1901, 7, 31);
    Date expectedTomorrow = new Date(1901, 8, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc14() {
    Date today = new Date(3453, 1, 31);
    Date expectedTomorrow = new Date(3453, 2, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc15() {
    Date today = new Date(3456, 12, 31);
    Date expectedTomorrow = new Date(3457, 1, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }


  @Test
  void nextDate_invalid_tc16() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 31)
    );
  }

  @Test
  void nextDate_invalid_tc17() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 29)
    );
  }

  @Test
  void nextDate_invalid_tc18() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(-1, 10, 20)
    );
  }

  @Test
  void nextDate_invalid_tc19() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1458, 15, 12)
    );
  }

  @Test
  void nextDate_invalid_tc20() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, 6, -50)
    );
  }

  @Test
  void nextDate_invalid_tc21() {
    assertThrows(
            IllegalArgumentException.class,
            () -> new Date(2024, 5, 35)
    );
  }

  @Test
  void nextDate_invalid_tc22() {
    assertThrows(
            IllegalArgumentException.class,
            () -> new Date(1875, 6, 31)
    );
  }

  @Test
  void nextDate_invalid_tc23() {
    assertThrows(
            IllegalArgumentException.class,
            () -> new Date(2024, 2, 30)
    );
  }

  @Test
  void nextDate_toString_tc24(){
    Date today = new Date(1966, 9, 17);
    Object dateString = today.toString();
    assertTrue(dateString instanceof String);
  }

  @Test
  void nextDate_invalid_tc25() {
    assertThrows(
            IllegalArgumentException.class,
            () -> new Date(1458, -2, 12)
    );
  }


  @Test
  void DateEquals_tc28() {
    Date d1 = new Date(1954, 7, 14);
    Date d2 = new Date(1954, 7, 14);
    assertTrue(d1.equals(d2));
  }

  @Test
  void DateEquals_tc29() {
    Date d1 = new Date(1954, 7, 14);
    Date d2 = new Date(1954, 4, 10);
    assertFalse(d1.equals(d2));
  }

  @Test
  void DateEquals_tc30() {
    Date d1 = new Date(1954, 7, 14);
    Date d2 = new Date(1945, 7, 14);
    assertFalse(d1.equals(d2));
  }

  @Test
  void DateEquals_tc31() {
    Date d1 = new Date(1954, 7, 14);
    String d2 = "hello";
    assertFalse(d1.equals(d2));
  }

  @Test
  void DateEquals_tc32() {
    Date d1 = new Date(1954, 7, 14);
    Date d2 = new Date(1945, 8, 14);
    assertFalse(d1.equals(d2));
  }

  @Test
  void DateLeapYear_tc33() {
    Date d1 = new Date(1600, 7, 14);
    assertTrue(d1.isLeapYear());
  }

  @Test
  void DateLeapYear_tc34() {
    Date d1 = new Date(2024, 7, 14);
    assertTrue(d1.isLeapYear());
  }

  @Test
  void DateLeapYear_tc35() {
    Date d1 = new Date(2022, 7, 14);
    assertFalse(d1.isLeapYear());
  }

  @Test
  void DateLeapYear_tc36() {
    Date d1 = new Date(1800, 7, 14);
    assertFalse(d1.isLeapYear());
  }

  @Test
  void DateEquals_tc37() {
    Date d1 = new Date(1954, 7, 14);
    Date d2 = new Date(1945, 8, 12);
    assertFalse(d1.equals(d2));
  }

  @Test
  void nextDate_tc38() {
    Date today = new Date(2023, 2, 28);
    Date expectedTomorrow = new Date(2023, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

}