import java.util.Scanner;
class Areaoftriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("height of triangle");
        int A=s.nextInt();
        System.out.println("width of triangle");
        int B=s.nextInt();
        int area=(A*B)/2;
        System.out.println("Area of triangle " + area);
    }
}