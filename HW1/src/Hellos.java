import java.util.Scanner;
public class Hellos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=1; i<=n; i++) {
            if ((i%100)/10 == 1) System.out.println(i + "th Hello");
            else {
                if (i % 10 == 1) System.out.println(i + "st Hello");
                else if (i % 10 == 2) System.out.println(i + "nd Hello");
                else if (i % 10 == 3) System.out.println(i + "rd Hello");
                else System.out.println(i + "th Hello");
            }
        }
    }
}