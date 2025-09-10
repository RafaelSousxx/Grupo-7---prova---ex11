import java.util.Scanner;
public class EX11_Delta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("O valor de A é: ");
        double a = sc.nextDouble();

        System.out.println("O valor de B é: ");
        double b = sc.nextDouble();

        System.out.println("O valor de C é: ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;
        System.out.println("O valor de delta é" + delta);

        sc.close();


    }
}