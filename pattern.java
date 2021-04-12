import java.util.Scanner;
public class pattern{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i, j, n;
        System.out.println("enter the range of row......");
        n = obj.nextInt();
        System.out.println("your pattern is this ok......");
        for (i=1;i<=n;i++)
        {
            for (j = 1; j <= i; j++)
            {
                  System.out.print(i+" ");
            }
            System.out.println();
        }
        obj.close();
    }
    }