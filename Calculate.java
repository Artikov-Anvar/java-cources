public class Calculate {
    public static void main(final String[] args) {
        System.out.println("Calculate...");
        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);
        int summ = first + second;
        System.out.println("SUM: " + summ);
    }
}