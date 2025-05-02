public class PrimeGenerator {

    /**
     * Mengecek apakah sebuah bilangan adalah bilangan prima.
     *
     * @param number bilangan yang akan dicek
     * @return true jika bilangan prima, false jika tidak
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 dan 1 bukan bilangan prima
        }

        // Cek faktor dari 2 hingga akar dari number
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false; // Ada pembagi selain 1 dan dirinya sendiri
            }
        }

        return true;
    }

    /**
     * Menghasilkan N bilangan prima pertama.
     *
     * @param n jumlah bilangan prima yang diinginkan
     * @return array berisi bilangan prima
     */
    public static int[] generatePrimes(int n) {
        int[] primes = new int[n];
        int count = 0;
        int number = 2;

        while (count < n) {
            if (isPrime(number)) {
                primes[count] = number;
                count++;
            }
            number++;
        }

        return primes;
    }

    public static void main(String[] args) {
        int jumlah = 10;
        int[] hasil = generatePrimes(jumlah);

        for (int value : hasil) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
