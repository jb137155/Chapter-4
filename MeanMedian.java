import java.util.ArrayList;
import java.util.Scanner;

public class MeanMedian {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<String>();
        String input;
        System.out.println("Enter 5 numbers to show");
        for (int x = 0; x < 5; ++x)
        {
            System.out.println("Enter" + x + "number: ");
            input = keyboard.next();
            numbers.add(input);
        }
        display(numbers);
    }
        public static void display(ArrayList<String>numbers)
        {


            System.out.println(" " + numbers);
            for (int i = 0; i < numbers.size(); ++i)
            {
                System.out.println("Position" + i + "Number: " + numbers.get(i));
            }
        }

}
