import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        double dist = Math.sqrt(x*x + y*y);
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }
}
