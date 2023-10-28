import java.util.Scanner;
import java.lang.Math;
public class ShapeAreas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        float rad = sc.nextFloat();
        float circleArea = 3.16f*rad*rad;
        System.out.println(circleArea);
        System.out.print("Enter traingle sides: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float s = (a+b+c)/2;
        System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        System.out.println("Enter rectangle sides: ");
        float len = sc.nextFloat();
        float wid = sc.nextFloat();
        System.out.println(len*wid);

    }
}