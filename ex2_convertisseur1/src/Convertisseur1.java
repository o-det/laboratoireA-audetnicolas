import java.util.Scanner;

public class Convertisseur1 {

    public static void main(String[] args){

        //Declaration des variables
        float nbRad;
        int nbDeg;
        Scanner sc = new Scanner(System.in);

        //Question a l'utilisateur
        System.out.print("Quel est l'angle en radians?");
        nbRad = sc.nextFloat();

        //Operations
        nbDeg = (int) (nbRad*(180/Math.PI));
        sc.close();

        //Resultat
        System.out.print("Valeur en degrés : " + nbDeg);

    }

}
