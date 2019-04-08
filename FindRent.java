import javax.swing.*;

public class FindRent {

    public static void main(String[] args){

        int [] [] rents = {{400, 450, 510},
                            {500, 560, 630},
                            {625, 676, 740},
                            {1000, 1250, 1600},
                            {1800, 2000, 2150},
                            {2350, 2650, 2800},
                            {3000, 3200, 3400}};

        String entry;
        int floor;
        int bedrooms;

        entry = JOptionPane.showInputDialog(null, "Enter a floor number ");
        floor = Integer.parseInt(entry);
        entry = JOptionPane.showInputDialog(null, "Enter number of bedrooms. ");
        bedrooms = Integer.parseInt(entry);



        if (floor >= 7){
            System.out.println("Enter number of number floors + bedrooms");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The rent for a " +
                    bedrooms + " bedrooms apartment floor " + floor + " is $" + rents[floor][bedrooms]);
        }
    }
}
