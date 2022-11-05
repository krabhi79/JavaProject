import java.util.Scanner;
public class areaCircumference {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r;
        double pi = 3.14, area, circumference;
        System.out.println("Radius of circle");
        r = s.nextInt();
        area = pi * r * r;
        circumference = 2 * pi * r * r;
        System.out.println("Area of circle: " + area);
        System.out.println("circumference of circle:" + circumference);
    }
}

