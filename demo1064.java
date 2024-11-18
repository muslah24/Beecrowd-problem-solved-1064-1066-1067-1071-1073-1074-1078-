import java.util.Scanner;

public class demo1064 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int[] arr = new int[6];
            int counteven=0;

            for(int i=0; i<5; i++){
                arr[i] = sc.nextInt();
                if(arr[i]%2==0){
                    counteven++;
                }
            }
            System.out.println(counteven+" valores pares");
        }
}
