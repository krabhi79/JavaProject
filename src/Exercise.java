import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total marks 500");
        System.out.println("Maths");
        int subA = sc.nextInt();
        System.out.println("Science");
        int subB = sc.nextInt();
        System.out.println("social science");
        int subC = sc.nextInt();
        System.out.println("English");
        int subD = sc.nextInt();
        System.out.println("hindi");
        int subE = sc.nextInt();
        System.out.println("Total marks obtained");
        int sum = (subA + subB + subC + subD + subE)/5;
        System.out.println(sum);

    }

}
