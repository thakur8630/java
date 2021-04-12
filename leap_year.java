import javax.swing.*;
import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the year");
        int year=obj.nextInt();
        if ((year%4==0)|(year%100==0)|(year%400==0)){
            System.out.println("this year is the leap year"+year);
        }
        else {
            System.out.println("this is year is not leap year"+year);
        }
    }
}