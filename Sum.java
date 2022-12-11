import java.util.Scanner;
// Replace Sum with your class name
public class Sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of First number"+"\t"+"=");
        int a=sc.nextInt();
        System.out.print("Enter Value Of Second number"+"\t"+"=");
        int b=sc.nextInt();
        System.out.println("Sum of given number"+"\t"+"="+(a+b));
    }
}