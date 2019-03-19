import java.util.Scanner;
public class TestMonthHandling {
    public static void main (String[]args){

        Scanner reader = new Scanner(System.in);
        System.out.println("January 31 and December31");
        int addedmonths = reader.nextInt();
        int pickedmonths = reader.nextInt();

        if (pickedmonths == 1){
            System.out.println("How many months would like to add to January? (up to 3)");
            addedmonths = reader.nextInt();

        }

    }
}
