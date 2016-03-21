import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ArrayReverseExample {
    public static void main(String[] args) {
        System.out.print("Enter some numbers separated by commas: ");

        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        input.close();

        List<Integer> l = new LinkedList<Integer>();

        Scanner ns = new Scanner(line);
        Pattern pat = Pattern.compile("\\s*,\\s*");
        ns.useDelimiter(pat);

        try {
            while (ns.hasNextInt()) {
                l.add(ns.nextInt());
            }
        }
        finally {
            ns.close();
        }

        int length = l.size();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = l.remove(0);
        }

        int[] reversed = new int[length];
        for (int index = 0; index < length; index++) {
            reversed[length- index -1] = array[index];
        }
        System.out.println(Arrays.toString(reversed));
    }
}
