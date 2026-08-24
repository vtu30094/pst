class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(daysFromStart(date1) - daysFromStart(date2));
    }

    private int daysFromStart(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int days = 0;

        // Add days for all previous years
        for (int y = 1971; y < year; y++) {
            if (isLeapYear(y)) {
                days += 366;
            } else {
                days += 365;
            }
        }

        // Days in each month
        int[] monthDays = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Add days for previous months
        for (int m = 1; m < month; m++) {
            days += monthDays[m - 1];

            // Add leap day for February
            if (m == 2 && isLeapYear(year)) {
                days++;
            }
        }

        // Add days in current month
        days += day;

        return days;
    }

    private boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }
}