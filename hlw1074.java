import java.util.Scanner;

public class hlw1074 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            int X = sc.nextInt();
            if(X==0){
                System.out.println("NULL");
            } else{
                if(X%2==0){
                    System.out.print("Even");
                }else{
                    System.out.print("Odd");
                } if(X>0){
                    System.out.println("Positive");
                } else{
                    System.out.println("Negative");
                }
            }
        }
      }
}
