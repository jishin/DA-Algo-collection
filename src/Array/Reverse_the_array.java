package Array;
import java.util.Scanner;

public class Reverse_the_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);

        System.out.println("Enter the number of elements in the array");
        int n = scn.nextInt();
        int ar[] = new int[n];
        int rar[] = new int[n];
        for(int i =0; i<n ; i++){
            ar[i]=scn.nextInt();
        }
        System.out.println("The elements in the array are");
        for(int i =0; i<n ; i++){
            System.out.print(ar[i] + " ");
        }
        for(int i =0,j=n-1; i<n ;i++ ,j--){
            rar[i]=ar[j];
        }
        System.out.println("The elements in the reverse array are");
        for(int i =0; i<n ; i++){
            System.out.print(rar[i] + " ");
        }
    }
}
