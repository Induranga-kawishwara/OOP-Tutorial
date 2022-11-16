public class CalcManager {
    public static boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }
    public static int cube(int n) {
        return n*n*n;
    }
    public static double add(double...x) {
        double sum = 0.0;
        for (double e : x)
            sum = sum + e;
        return sum;
    }

}
