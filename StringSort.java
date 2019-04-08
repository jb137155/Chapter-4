import java.util.Arrays;
public class StringSort {

    public static void main(String[]args) {
        String[] values = {"mouse", "dog", "cat", "horse", "cow",
                "moose", "tiger", "lion", "elephant", "bird", "hamster",
                "guina pig", "leopard", "aardvark", "hummingbird",
                "rat", "pig", "sheep", "bumble bee", "dolphin"};
        for (int i = 0; i < values.length; ++i) {
            System.out.println(values[i]);
        }
        orderValues(values);
    }
    public static void orderValues(String[] values){
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
    }
}
