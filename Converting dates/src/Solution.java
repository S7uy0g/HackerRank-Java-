import java.util.Calendar;
import java.text.*;
class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public String findDay(int month, int day, int year) {
        Calendar date = Calendar.getInstance();
        date.set(year, month-1, day);//in Java's Calendar class, the month value is zero-indexed
        DateFormat f = new SimpleDateFormat("EEEE");//format is set to "EEEE", which represents the full day name in the week, like "Monday" or "Tuesday".
        return f.format(date.getTime()).toUpperCase();
    }

}
