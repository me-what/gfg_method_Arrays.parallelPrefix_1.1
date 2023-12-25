import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class Main {
    static int compute(int x, int y)
    {
        return x + y;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 7, 8, 4, 5, 6, 9, 8, 7, 1, 2, 3, 6, 5, 4, 7, 5 };

        Arrays.parallelPrefix(arr, (x,y) -> compute(x,y));
        Arrays.stream(arr).forEach(e -> System.out.print(e + "   "));

        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}