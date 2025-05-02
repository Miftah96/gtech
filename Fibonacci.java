public class Fibonacci {
    public static int[] generateFibonacci(int n) {
        if (n <= 0) {
            return new int[0];
        }

        int[] fibonacciSeries = new int[n];

        fibonacciSeries[0] = 0;
        if (n > 1) {
            fibonacciSeries[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }

        return fibonacciSeries;
    }

    public static void main(String[] args) {
        int jumlah = 17;
        int[] hasil = generateFibonacci(jumlah);

        for (int value : hasil) {
            System.out.print(value + ", ");
        }
    }
}
