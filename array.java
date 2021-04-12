import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n;
        System.out.println("enter the size of the array...");
        n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the element in the array....");
        for (int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        System.out.print("your elements in the array is....");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
