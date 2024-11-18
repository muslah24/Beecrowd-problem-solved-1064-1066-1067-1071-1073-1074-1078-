import java.util.*;
public class example1066 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int counteven=0,countodd=0, countpos=0, countneg=0;
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2==0){
                counteven++;
            }
            else if(arr[i]%2!=0){
                countodd++;
            }
        }
        for(int number : arr){
            if(number>0){
                countpos++;
            }
            else if(number<0){
                countneg++;
            }
        }    
        System.out.println(counteven+" Even");
        System.out.println(countodd+" odd");
        System.out.println(countpos+" positive");
        System.out.println(countneg+" negative");
    }

}
