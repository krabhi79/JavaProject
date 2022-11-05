import java.util.Scanner;
public class Areaofsquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length, area;
        System.out.println("Enter the length of the square :");
        length = sc.nextInt();
        area = length*length;
        System.out.println("area of square : " + area);
    }
}
