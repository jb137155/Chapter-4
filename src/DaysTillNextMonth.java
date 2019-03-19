import java.util.Scanner;
public class DaysTillNextMonth {
    public static void main(String[]args){



        Scanner reader = new Scanner (System.in);
        System.out.println("Enter the current day");
        int dayTill = 31 - reader.nextInt();
        System.out.println("Enter the month you would like to know in number form");
        int month = reader.nextInt();
        if (month ==1)
        System.out.println("Enter the current month");
        if (month == 1){
            System.out.println("the month is january");
            System.out.println("the amount of days till january are:" + (31 - dayTill));
        }
        else if (month == 2){
            System.out.println("the month is February");
            System.out.println("the amount of days till february are:" + (28 - dayTill));
        }
        else if (month == 3) {
            System.out.println("the month is March");
            System.out.println("the amount of days till march are:" + (31 - dayTill));
        }
            else if (month == 4){
                System.out.println("the month is April");
            System.out.println("the amount of days till april are:" + (30 - dayTill));
            }
            else if (month == 5) {
                System.out.println("the month is May");
            System.out.println("the amount of days till may are" + (31 - dayTill));
            }
                else if (month == 6){
                    System.out.println("the month is June");
            System.out.println("the amount of days till june are" + (30 - dayTill));
                }
                else if (month == 7) {
                    System.out.println("the month is July");
            System.out.println("the amount of days till july are" + (31 - dayTill));
                }
            else if (month == 8){
                        System.out.println("the month is August");
            System.out.println("the amount of days till august are:" + (31 - dayTill));
                    }
                    else if (month == 9) {
                System.out.println("the month is September");
            System.out.println("the amount of days till september are:" + (30 - dayTill));
            }
                        else if (month == 10){
                            System.out.println("the month is October");
            System.out.println("the amount of days till october are:" + (31 - dayTill));
                        }
                        else if (month == 11){
                            System.out.println("the month is November");
            System.out.println("the amount of days till november are:" + (30 - dayTill));
                            }
                            else if (month == 12){
                            System.out.println("the month is December");}
        System.out.println("the amount of days till december are:" + (31 - dayTill));
                }
}