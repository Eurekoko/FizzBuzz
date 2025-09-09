package lab1;

public class Reduce {
    public static int reduce(int n) {
        int total = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
                total++;
            } else if (n % 2 != 0) {
                n -= 1;
                total++;
            }
        }
        return total;
    }

}
