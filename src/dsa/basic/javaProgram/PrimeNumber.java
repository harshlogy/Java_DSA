package dsa.basic.javaProgram;

import java.util.Arrays;
import java.util.List;

public class PrimeNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 7, 10, 11, 17, 18, 15);
        list.stream().filter(n -> !isPrime(n)).forEach(System.out::println);

    }

    public static boolean isPrime(int k){
        for (int i=2; i<=k/2 ; i++){
            if(k%i==0){
                return false;
            }
        }
        return true;
    }
}
