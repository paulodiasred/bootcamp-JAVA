import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int A, B, PROD;

        // A = sc.nextInt();
        // B = sc.nextInt();
        // PROD = A * B;

        // System.out.println("PROD = " + PROD);

        // int C, D, soma;

        // C = sc.nextInt();
        // D = sc.nextInt();
        // soma = C + D;

        // System.out.println("SOMA = " + soma);

        double A, B, media;

        A = sc.nextDouble();
        B = sc.nextDouble();

        media = (A * 3.5 + B * 7.5)/11; 

        System.out.printf("MEDIA = %.5f",  media );
        System.out.println();

        sc.close();
    }
}
