import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int input;
        System.out.println("Please enter 5 numbers");
        int sum = 0;
        for (int x = 0; x < 5; ++x) {
            System.out.println("Enter" + x + "numbers: ");
            input = in.nextInt();
            numbers.add(input);
            sum += input;
        }
        double average = sum / 5;
        System.out.println("The sum of the numbers are" + sum + "The average of the numbers" + average);





        }
       // display(numbers);

    }

    //public static void display(ArrayList<String>numbers) {

       // for (int i = 0; i < numbers.size(); ++i) {
           // System.out.println("Your numbers are: " + numbers.get(i));


