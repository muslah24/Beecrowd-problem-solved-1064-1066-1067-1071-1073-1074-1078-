import java.util.*;

public class bc1070 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if(X%2==0){
            X++;
        }
        for(int i=0; i<6; i++){
            System.out.println(X);
            X+=2;
        }
    }

}
