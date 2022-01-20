import java.util.*;

public class PowerSum{
    public static int log2(int n){
        int curr=2, ret=0;
        while(curr<=n){
            ret++;
            curr=curr*2;
        }
        return ret;
    }

    public static void main(String[] args){
        Scanner stdin=new Scanner(System.in);
        int T = stdin.nextInt();
        while(--T >= 0){
            int N = stdin.nextInt();
            int sum=0, min=Integer.MAX_VALUE, index=-1;
            for(int i=0;i<N;i++){
                int temp=stdin.nextInt();
                sum+=temp;
                if(temp<min){
                    index=i;
                    min=temp;
                }
            }
            int sumLog=log2(sum);
            if(Math.pow(2, sumLog)==sum){
                System.out.println(0);
            }
            else{
                int multiplier = ((int)Math.pow(2, sumLog+1)-sum)/(min);
                System.out.println(1);
                System.out.println("1 "+(multiplier+1));
                System.out.println(index+1);
            }

            
        }
        stdin.close();
    }
}