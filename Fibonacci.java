import java.util.Scanner;

class Fibonacci{
    public static int fibonacci(int n){
        int a0=0, a1=1;
        if(n==0){
            return a0;
        }
        else if(n==1){
            return a1;
        }
        else if(n>1){
            int last=a1, last2=0, curr=-1;
            for(int i=0;i<n-1;i++){
                curr=last+last2;
                last2=last;
                last=curr;
            }
            return curr;
        }
        else{
            return -1;
        }


    }
    public static void main(String[] args){
        Scanner stdin=new Scanner(System.in);
        while(true){
            System.out.print("Enter Tn (0 based index) for Fibonacci series: ");
            int n = stdin.nextInt();
            System.out.println("Value of term "+n+" is: "+Fibonacci.fibonacci(n));
        }
    }
}