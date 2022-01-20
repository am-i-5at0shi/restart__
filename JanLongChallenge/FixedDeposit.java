import java.util.*;

public class FixedDeposit {
    private static int T;
    private static int[] deposits;
    private static boolean[] visited;
    private static int solve(int x){
        if(x>0){
            int max=-1;
            for(int i=0,prev=-1;i<deposits.length;i++){
                if((! visited[i]) && deposits[i]>max){
                    max=deposits[i];
                    visited[i]=true;
                    if(prev!=-1){
                        visited[prev]=false;
                    }
                    prev=i;
                }
            }
            int ret = max==-1? -(deposits.length+1) : (1+solve(x-max));
            return ret;

        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        T=stdin.nextInt();

        for(int t=0;t<T;t++){
            //Each test case

            int N=stdin.nextInt();
            int X=stdin.nextInt();
            deposits=new int[N];
            visited=new boolean[N];
            for(int i=0;i<N;i++){
                //Taking input into deposits
                deposits[i]=stdin.nextInt();
            }
            int ret = solve(X);
            System.out.println(ret);
        }
        stdin.close();
    }
    
}
