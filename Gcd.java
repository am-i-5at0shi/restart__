import java.util.Scanner;

class Gcd{
    public static int gcd(int a, int b){
        int min=a<b? a:b;
        int curr=1;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                curr=i;
            }
        }
        return curr;
    }

    public static void main(String[] args){
        Scanner stdin=new Scanner(System.in);
        while(true){
            System.out.print("Enter a and b for GCD: ");
            int a = stdin.nextInt();
            int b = stdin.nextInt();
            System.out.println("gcd("+a+", "+b+") is: "+Gcd.gcd(a, b));
        }
    }
}