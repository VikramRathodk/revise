package Arrays;
public class PrimeNumber{
    public static void main(String[] args) {
        int n = 36;


        //printing all the prime numbers from 1 to 13 using isPrime method
            // for(int i = 1 ;i<n ;i++){
            //     if(isPrime(i)){
            //         System.out.println(i);
            //     }
            // }

        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n){


        if(n == 1 || n == 0){
            return false;
        }

        for (int i = 2; i * i< n; i++) {
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}