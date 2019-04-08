import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        String input;
        System.out.println("Enter 5 names to show");
        for(int x = 0; x < 5; ++x){
            System.out.println("Enter" + x + "name: ");
            input = keyboard.next();
            names.add(input);
        }
        names.add(0,"Tom");
        names.remove(3);
        display(names);


    }
    public static void display(ArrayList<String> names){

        System.out.println("The size of the list is " + names.size());
        for(int i = 0; i < names.size(); ++i){
            System.out.println("Position " + i + "Name: " + names.get(i));
        }
    }
}
