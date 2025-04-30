package dsa.basic.javaProgram;

public class Fibonnacci_usingI_Iteration {

    public static void main(String[] args) {
        int n= 10;
        for(int i=0 ; i<=n ; i++){
           System.out.println(fibonnacci(i));
        }

    }

    static int fibonnacci(int n){

        if(n<=1){
            return n;
        }
        int a=0; int b=1;
        for(int i=2; i<=n;i++){
            int next=a+b;
            a=b;
            b=next;
        }
        return b;
    }
}
