package dsa.basic.javaProgram;

public class Fibonnacci_tillRange {

    public static void main(String[] args) {
        int n = 10;
            System.out.println(Fibbonnaci(n));


    }

    static int Fibbonnaci(int n) {


        int a = 0;
        int b = 1;
        while (b <=n) {
            System.out.println(b);
            int next=a+b;
            a=b;
            b=next;
        }
        return b;
    }
}
