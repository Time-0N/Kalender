import java.util.Scanner;

public class Kalender {

    private static void printCalendarForMonth(String month) {
        System.out.println(month);
    }
    private static void printDays(String[] day,int[] daysInMonth, int offsetDays, int daycorrect) {
        for (int i = 0; i < day.length; i++) {
            System.out.print(day[i]);
        }
        System.out.println("");
        for (int i = 0; i < offsetDays; i++) {
            System.out.print("   ");
        }
        for (int i = 0; i < (31-daycorrect); i++) {
            if (daysInMonth[i] >= 10) {
                System.out.print(daysInMonth[i] + " ");
            } else if (i == 11) {
                System.out.print(daysInMonth[i]);
            } else {
                System.out.print(daysInMonth[i] + "  ");
            }

            if (i == (6-offsetDays)) {
                System.out.println("");
            } else if (i == (13-offsetDays)) {
                System.out.println("");
            } else if (i == (20-offsetDays)) {
                System.out.println("");
            } else if (i == (27-offsetDays)) {
                System.out.println("");
            } else if (i == (34-offsetDays)) {
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        String[] month = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        String[] day = {"Mo ", "Di ", "Mi ", "Do ", "Fr ", "Sa ", "So"};
        int[] daysInMonth = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        int offsetDays = 0;
        int daycorrect = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day on which to start (Mo,Di,Mi,Do,Fr,Sa,So)");
        String startDay = sc.next();

        switch (startDay) {
            case "Mo":
                offsetDays = offsetDays+0;
                break;
            case "Di":
                offsetDays = offsetDays+1;
                break;
            case "Mi":
                offsetDays = offsetDays+2;
                break;
            case "Do":
                offsetDays = offsetDays+3;
                break;
            case "Fr":
                offsetDays = offsetDays+4;
                break;
            case "Sa":
                offsetDays = offsetDays+5;
                break;
            case "So":
                offsetDays = offsetDays+6;
                break;
            default:
                System.out.println("Invalid input");
        }

        if (offsetDays <= 6 && offsetDays >= -1) {
            System.out.println("Enter the number of the month you want to display");
            int user_input = sc.nextInt();
            user_input = user_input - 1;
            printCalendarForMonth(month[user_input]);

            switch (user_input) {
                case 0:
                    printDays(day, daysInMonth, offsetDays, daycorrect);
                    break;
                case 1:
                    daycorrect = daycorrect+3;
                    printDays(day, daysInMonth, offsetDays, daycorrect);
                    break;
                case 2:
                    printDays(day, daysInMonth, offsetDays, daycorrect);
                    break;
                case 3:
                    daycorrect++;
                    printDays(day, daysInMonth, offsetDays, daycorrect);
                    break;
                case 4:
                    printDays(day, daysInMonth, offsetDays, daycorrect);
                    break;
                case 5:
                    daycorrect++;
                    printDays(day, daysInMonth, offsetDays, daycorrect);
                    break;
                case 6:
                    printDays(day, daysInMonth, offsetDays, daycorrect);
                    break;
                case 7:
                    daycorrect++;
                    printDays(day, daysInMonth, offsetDays, daycorrect);
                    break;
                case 8:
                    printDays(day, daysInMonth, offsetDays, daycorrect);
                    break;
                case 9:
                    daycorrect++;
                    printDays(day, daysInMonth, offsetDays, daycorrect);
                    break;
                case 10:
                    printDays(day, daysInMonth, offsetDays, daycorrect);
                    break;
                case 11:
                    daycorrect++;
                    printDays(day, daysInMonth, offsetDays, daycorrect);
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
