public class date {
    int day, month, year;

    date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        if (day < 10 && month > 10) {
            return "Date: 0" + day + "/" + month + "/" + year;
        } else if (month < 10 && day > 10) {
            return "Date: " + day + "/0" + month + "/" + year;
        } else if (month < 10 && day < 10) {
            return "Date: 0" + day + "/0" + month + "/" + year;
        } else {
            return "Date: " + day + "/" + month + "/" + year;
        }
    }

    public static void main(String[] args) {
        date date1 = new date(3,8,2005);
        System.out.println(date1.toString());

        date1.setDay(5);
        System.out.println(date1.toString());

    }
}
