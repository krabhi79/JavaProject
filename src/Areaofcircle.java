import java.util.Scanner;
public class Areaofcircle {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int r;
    double pi = 3.14, area;
    System.out.println("Radius of circle");
    r = s.nextInt();
    area = pi * r * r;
    System.out.println("Area of circle: " + area);

    }
}
