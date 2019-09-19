import java.util.Scanner;

public class Resolution {

    public static void main (String[] args){

        //Declaration des variables
        double a, b, c, x1, x2, discriminant;
        Scanner sc = new Scanner(System.in);

        //Question a l'utilisateur
        System.out.println("Entree des valeurs...");
        System.out.print("a > ");
        a = sc.nextDouble();
        System.out.print("b > ");
        b = sc.nextDouble();
        System.out.print("c > ");
        c = sc.nextDouble();
        System.out.println("Equation : " + a + "x2+" + b + "x+" + c + "=0");

        //Calcul discrimant
        discriminant = Math.pow(b, 2)-(4 * c * a);
        System.out.println("Discriminant : " + discriminant);

        //Calcul x1
        x1 = (-b + Math.sqrt(discriminant)) / (2*a);
        System.out.println("X1 : " + x1);

        //Calcul x2
        x2 = (-b - Math.sqrt(discriminant)) / (2*a);
        System.out.println("X2 : " + x2);

        sc.close();
    }
}

