import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Taking Input From the User");
        System.out.println("Taking int input");
        int a = sc.nextInt();
        System.out.println("Taking float input");
        float A = sc.nextFloat();
       // String C = sc.nextLine();
        float sum = A + a;
        System.out.println(sum);
       // System.out.println(C);

    }
}
