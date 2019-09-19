import java.util.Scanner;

public class Pythagore {

    public static void main(String[] args){

        //Declaration des variables
        int valeurA, valeurB, valeurHyp;
        Scanner sc = new Scanner(System.in);

        //Question a l'utilisateur
        System.out.println("Quelle est la valeur A?");
        valeurA = sc.nextInt();
        System.out.println("Quelle est la valeur B?");
        valeurB = sc.nextInt();

        //Operations
        valeurHyp = (int) Math.sqrt(Math.pow(valeurA, 2) + Math.pow(valeurB, 2));
        sc.close();

        //Resultat
        System.out.println("Valeur de pythagore : " + valeurHyp);

    }
}
