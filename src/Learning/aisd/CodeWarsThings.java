package Learning.aisd;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CodeWarsThings {
    public static void main(String[] args) {
        System.out.println(dg(225));

    }

    public static int dg(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        if (sum > 10) {
            sum = dg(sum);
        }

        return sum;
    }
}
