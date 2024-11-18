import java.util.*;

public class be1071 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int in=0,out=0;
        
        for(int i=0; i<N; i++){
            int X = sc.nextInt();
            if(X>=10 && X<=20){
                in++;
            }
            else{
                out++;
            }
        }
        System.out.println(in+" In");
        System.out.println(out+" out");
     }
}
