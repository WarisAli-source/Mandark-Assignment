public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void main(String[] args) {
        int input = 8;
        if (isPerfectNumber(input)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
