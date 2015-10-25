public class P19{

  public static enum Day{
    MONDAY, TUESDAY, WEDNESDAY,
                            THURSDAY, FRIDAY, SATURDAY, SUNDAY;
 
  }

  //don't forget leap years!!
  public static int[] monthLen = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

  public static class Date{
    public int year;
    public int month;
    public int date;
    public Day day;
    //note the below mwthod increments only the day, not the date
    public void incDay(){
      switch (day){
        case MONDAY: day = Day.TUESDAY; break;
        case TUESDAY: day = Day.WEDNESDAY; break;
        case WEDNESDAY: day = Day.THURSDAY; break;
        case THURSDAY: day = Day.FRIDAY; break;
        case FRIDAY: day = Day.SATURDAY; break;
        case SATURDAY: day = Day.SUNDAY; break;
        case SUNDAY: day = Day.MONDAY; break;
      }//switch
    }//incDay
  }

  public static void main(String[] args){
    Date d = new Date();
    d.year = 1901;
    d.month = 1;
    d.date = 1;
    d.day = Day.TUESDAY;

    int noSundays = 0;
    while (true){
      if (d.year == 2001) break;
      if (d.date == 1 && d.day == Day.SUNDAY){
        noSundays++;
      }
      //then increment the date by a day
      d.incDay();

      //if leap year, do special shit
      if (d.year % 4 == 0 && d.month == 2 && d.year % 100 != 0 
          || d.year % 400 == 0 && d.month == 2){
        if (d.date < 29) {
          d.date++;
        } else {
          d.month = 3;
          d.date = 1;
        }
      } else if (d.date < monthLen[d.month -1]){
        d.date++;
      } else if (d.month < 12){
        d.date = 1;
        d.month++;
      } else {
        d.year++;
        d.month = 1;
        d.date = 1;
      }
      //print out some useful debugging information
      System.out.println("year:" + d.year + "month:" + d.month + "date:"
                                 + d.date + "day:" + d.day);

    }//while
    System.out.println("No of Sundays on the first of the month:" + noSundays);
  }
}
