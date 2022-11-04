import java.util.Scanner;
class Areaoftraingle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("height of traingle");
        int A=s.nextInt();
        System.out.println("width of traingle");
        int B=s.nextInt();
        int area=(A*B)/2;
        System.out.println("Area of traingle " + area);
    }
}