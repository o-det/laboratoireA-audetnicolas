import java.text.DecimalFormat;
import java.util.Scanner;

public class Convertisseur2 {

    public static void main(String[] args){

        //Declaration des variables
        float nbRad;
        int nbDeg;
        Scanner sc = new Scanner(System.in);

        //Question a l'utilisateur
        System.out.print("Quel est l'angle en degrés?");
        nbDeg = sc.nextInt();

        //Operations
        nbRad = (float) (nbDeg*(Math.PI/180));
        sc.close();

        //Deux decimales
        DecimalFormat df = new DecimalFormat("#.##");

        //Resultat
        System.out.print("Valeur en radians integree : " + df.format(nbRad));

    }

}
