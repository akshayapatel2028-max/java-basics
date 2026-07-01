import java.util.Scanner;
public class input {
    static void print(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("number=" + num);
        sc.close();
    }
}
