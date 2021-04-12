import java.util.Scanner;

class fact {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int fact=1;

        System.out.println("enter any number");
        int num=obj.nextInt();
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("the factorial of given number is"+fact);

    }
}