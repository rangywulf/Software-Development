import java.util.Calendar;
import java.util.GregorianCalendar;

public class DisplayCalendars {
    public static void main(String[] args) {
        // Create a GregorianCalendar for today
        GregorianCalendar today = new GregorianCalendar();
        
        // Create variable for month and year
        int month;
        int year;

        // Check how many words were typed on the command line
        if (args.length == 0) {
            month = today.get(Calendar.MONTH) + 1; // Set month to the calendar's month
            year = today.get(Calendar.YEAR); // set the year to the calendar's YEAR value
        }
        else if (args.length == 1) {
            month = Integer.parseInt(args[0]); // Set month to the first argument converted to an int
            year = today.get(Calendar.YEAR); // Set year to today's year
        }
        else {
            month = Integer.parseInt(args[0]); // Set month to the first argument, converted to an int
            year = Integer.parseInt(args[1]); // Set year to the second argument, converted to an int
        }
        // Print the calendar for the month of the year
        printMonth(year, month);
    }

    /** Print the calendar for a month in a year */
    public static void printMonth(int year, int month) {
        // Print the headings of the calendar
        printMonthTitle(year, month);

        // Print the body of the calendar
        printMonthBody(year, month);
    }

    /** Print the month title */
    public static void printMonthTitle(int year, int month) {
        System.out.println("         " + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    /** Get name of the month */
    public static String getMonthName(int month) {
        String monthName = "";

        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }
        return monthName;
    }

    /** Print month body */
    public static void printMonthBody(int year, int month) {
        // Create a GregorianCalendar set to the 1st of the month and year
        GregorianCalendar cal = new GregorianCalendar(year, month - 1, 1);
        // Get the start day from the day of week
        int startDay = cal.get(Calendar.DAY_OF_WEEK) - 1;
        // Get the number of days in the month from the calendar's actual maximum day
        int numberOfDaysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        // Print a blank cell for each day before the start day
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        // Loop from day through the last day of the month
        for (int i = 1; i <= numberOfDaysInMonth; i++) {
                // Print the day with a width of 4
                System.out.printf("%4d", i);
                // if (day + start day) is divisble by 7
                if ((i + startDay) % 7 == 0) {
                    // print a new line
                    System.out.println();
            }
        }
        // Print a final new line
        System.out.println();
    }
}
