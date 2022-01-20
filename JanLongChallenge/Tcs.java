import java.util.*;

public class Tcs {
    private static int T;
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        T=stdin.nextInt();

        for(int t=0;t<T;t++){
            int[] sloth=new int[4];
            int[] dragon =new int[4];
            int index=0;

            for(int i=1;i<4;i++){
                dragon[i]=stdin.nextInt();
                dragon[0]+=dragon[i];
            }

            for(int i=1;i<4;i++){
                sloth[i]=stdin.nextInt();
                sloth[0]+=sloth[i];
            }
            for(index=0;index<4 && sloth[index]==dragon[index];index++){
                //Just keep checking for equality
            }
            if(index==4){
                System.out.println("TIE");
            }
            else if(sloth[index]>dragon[index]){
                System.out.println("SLOTH");
            }
            else{
                System.out.println("DRAGON");
            }


           
        }
        
        stdin.close();
    }
    
}
