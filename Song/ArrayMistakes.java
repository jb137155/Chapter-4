
/**
 * Write a description of class ArrayMistakes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMistakes
{
        public static void main()
        {
            int [] nums;
            int numsArray[] = {6, 9, 14, 19};
            
            
            System.out.println("\nForward");
            for (int i = 1; i <= numsArray.length; i++) {
                System.out.println(":" + numsArray[i]);
            }
            
            System.out.println("\nBackword");
            for (int i = numsArray.length; i > 0; i--) {
                System.out.println( ": " + numsArray[i]);
            }
        }
    
}
