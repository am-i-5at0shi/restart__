import java.util.*;

public class SumAndOr {
    private static Scanner stdin;

    public static boolean possible(int x, int s, int m){
        //domain validation for function
        if(s<0 || x<0 || m<0){
            return false;
        }

        for(int i=30;i>=0 && s>0;i--){
            if(((x>>i)&1) == 1){
                //System.out.println(">>> true");
                int temp=s/(1<<i);
                temp = temp<m ? temp:m;
                s-=temp*(1<<i);
            }
        }
        return (s==0);
    }
    
    static public void solve(){ 
        int x,s;
        x=stdin.nextInt();
        s=stdin.nextInt();
        int foul=s+1;
        int left=0, right=s+1, m;
        s=s-x;
        while(left<right){
            m = (left+ (right-left)/2);
            boolean val=possible(x, s, m-1);
            if(val){
                right=m;
            }
            else{
                left=m+1;
            }
        }
        int ret= left < foul ? left :-1;
        System.out.println(ret);

    }
    public static void main(String[] args){
        stdin = new Scanner(System.in);
        int T = stdin.nextInt();
        while(T-- > 0){
            solve();
        }
        stdin.close();
    }
}
