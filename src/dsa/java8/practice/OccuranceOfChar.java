package dsa.java8.practice;

public class OccuranceOfChar {

    public static void main(String[] args) {
         String input = "Harshal";
         char targetChar = 'a';

         long numberOfOccurance = input.chars().filter(c -> c== targetChar).count();
         System.out.println("count "+ numberOfOccurance);

    }
}
