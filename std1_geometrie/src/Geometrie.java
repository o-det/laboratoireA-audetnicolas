public class Geometrie {

    public static void main(String[] args) {

        //Declaration des variables
        double rayonCercle;
        double coteCube;
        double rayonCylindre;
        double hauteurCylindre;
        double rayonCone;
        double hauteurCone;

        double surfaceCercle;
        double surfaceCube;
        double volumeCube;
        double surfaceCylindre;
        double volumeCylindre;
        double apothemeCone;
        double surfaceCone;
        double volumeCone;

        //Valeur des variables
        rayonCercle = 10.0;
        coteCube = 7.0;
        rayonCylindre = 10.0;
        hauteurCylindre = 5.0;
        rayonCone = 3.0;
        hauteurCone = 7.0;

        //Operations Cercle
        surfaceCercle = Math.PI*Math.pow(rayonCercle, 2);

        //Operations Cube
        surfaceCube = 6*Math.pow(coteCube, 2);
        volumeCube = Math.pow(coteCube, 3);

        //Operations Cylindre
        surfaceCylindre = (2*Math.PI*rayonCylindre*hauteurCylindre)+(2*Math.PI*Math.pow(rayonCylindre, 2));
        volumeCylindre = Math.PI*Math.pow(rayonCylindre, 2)*hauteurCylindre;

        //Operations Cone
        apothemeCone = Math.sqrt (Math.pow(rayonCone, 2) + Math.pow(hauteurCone, 2));
        surfaceCone = (Math.PI*rayonCone*apothemeCone) + (Math.PI*Math.pow(rayonCone, 2));
        volumeCone = (Math.PI*Math.pow(rayonCone, 2)*hauteurCone)/3;

        //Resultats
        System.out.println("Le cercle");
        System.out.println("- Rayon    : " + rayonCercle);
        System.out.println("- Surface  : " + surfaceCercle);
        System.out.println("Le cube");
        System.out.println("- Longueur : " + coteCube);
        System.out.println("- Surface  : " + surfaceCube);
        System.out.println("- Volume   : " + volumeCube);
        System.out.println("Le cylindre");
        System.out.println("- Rayon    : " + rayonCylindre);
        System.out.println("- Hauteur  : " + hauteurCylindre);
        System.out.println("- Surface  : " + surfaceCylindre);
        System.out.println("- Volume   : " + volumeCylindre);
        System.out.println("Le cone");
        System.out.println("- Rayon    : " + rayonCone);
        System.out.println("- Hauteur  : " + hauteurCone);
        System.out.println("- Apotheme : " + apothemeCone);
        System.out.println("- Surface  : " + surfaceCone);
        System.out.println("- Volume   : " + volumeCone);

    }

}
