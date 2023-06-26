import java.util.Scanner;

public class add {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Number 1 :");
        int n1=sc.nextInt();
        System.out.print("Number 2 :");

        int n2=sc.nextInt();

        System.out.print("Sum :");
        System.out.print(n1+n2);

        sc.close(); 
    }
}
