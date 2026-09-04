import java.util.Calendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    // No-arg constructor
    public MyDate() {
    Calendar calendar = Calendar.getInstance();
    year = calendar.get(Calendar.YEAR);
    month = calendar.get(Calendar.MONTH);
    day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    // Constructor using elapsed time
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // Constructor using specified
    public myDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Getter for month
    public int getMonth() {
        return month;
    }

    // Getter for day
    public int getDay() {
        return day;
    }

    // Set the date using elapsed time
    public void setDate(long elapsedTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(elapsedTime);

        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
    }
}
