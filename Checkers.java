public class Checkers {
    public static void main(String [] args){
        String [] [] board = new String[8][8];

        for (int i = 0; i < board.length; i++) {
            int countWhite = 0;
            int count = 0;
            for (int j = 0; j < board.length; j++) {
                count++;
                if ((j % 2) == (i % 2)) {
                    if (countWhite >= 5) {
                        System.out.print(" WC ");
                    } else
                        System.out.print(" W ");
                }
                else if((j % 2) != (i % 2))
                    if (countWhite <=1) {
                        System.out.print(" BC ");
                    } else
                        System.out.print(" B ");
            }
            countWhite++;


        if (count == 8);
            {
                System.out.println(" ");
            }


            }
        }
}





