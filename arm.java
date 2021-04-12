import java.util.Scanner;
public class arm{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int c=0,a,temp;
        System.out.println("enter the number to be check armstrong");
        int num=obj.nextInt();
        temp=num;
        while (num>0){
            a=num%10;
            num=num/10;
            c=c+(a*a*a);
        }
        if (temp==c){
            System.out.println("this is the armstrong number");
        }
        else{
            System.out.println("this is not armstrong number");
        }

    }
}