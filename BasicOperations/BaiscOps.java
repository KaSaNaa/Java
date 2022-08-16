package BasicOperations;

public class BaiscOps {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        double z = 4;
        double d = Math.pow(z, y); // = x**y
        double f = Math.pow(x, y);
        double sum = y / x; // we want decimal value here. so we can do typecasting.
        double sum2 = y / (double) x; // Type Casting

        double dec = y / z; // if one of the values is a double, the answer automatically becomes a double

        System.out.println(d);
        System.out.println(f);
        System.out.println(dec);
        System.out.println(x);
        System.out.println(sum);
        System.out.println(sum2);
    }
}
