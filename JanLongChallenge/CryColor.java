import java.util.*;

public class CryColor {
    private static int T;
    private static int[][] matrix; //row=box, column=contents
    private static int solve(){
        int cost=0;
        // for common balls
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int common= matrix[i][j] < matrix[j][i] ? matrix[i][j] : matrix[j][i];
                matrix[i][j] -= common;
                matrix[j][j] += common;
                matrix[j][i] -= common;
                matrix[i][i] += common;
                cost += common;
            }
        }

        // For uncommon balls
        int temp = matrix[0][1] + matrix[0][2];
        //return 1*common + 2*uncommon;
        return (1*cost + 2*temp);

    }

    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        T=stdin.nextInt();

        for(int t=0;t<T;t++){
            //Each test case

            int N=stdin.nextInt();
            matrix=new int[3][3];
            //Taking input into deposits
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    matrix[i][j]=stdin.nextInt();
                }
                
            }
            int ret = solve();
            System.out.println(ret);
        }
        stdin.close();
    }
    
}
