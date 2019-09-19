/*
Declaration des variables
Questions a l'utilisateur
Resultat
 */
import java.util.Scanner;

public class Salutation {

    public static void main(String[] args){

        //Declaration des variables
        String nomDeLaPersonne;
        Scanner sc = new Scanner(System.in);

        //Questions a l'utilisateur
        System.out.println("Quel est ton nom?");
        nomDeLaPersonne = sc.next();

        //Resultat
        System.out.print("Bonjour " + nomDeLaPersonne);
        sc.close();

    }
}
