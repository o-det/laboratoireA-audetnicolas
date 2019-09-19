import java.util.Scanner;

public class Experience_Verte {

    public static void main(String[] args){

        //Declaration des variables
        int A, B, C, D, E, F;
        int CO2;
        int k1, k2, k3;
        Scanner sc = new Scanner(System.in);

        //Valeur variable avant etape 1
        System.out.println("Entree des quantites...");
        System.out.print("A > ");
        A = sc.nextInt();
        System.out.print("B > ");
        B = sc.nextInt();
        System.out.print("C > ");
        C = sc.nextInt();
        System.out.print("D > ");
        D = sc.nextInt();
        System.out.print("E > ");
        E = sc.nextInt();
        System.out.print("F > ");
        F = sc.nextInt();
        CO2 = 0;
        System.out.println("A_0{" + A + "} B_0{" + B + "} C_0{" + C + "} D_0{" + D + "} E_0{" + E + "} F_0{"
                + F + "} CO2_0{" + CO2 + "}");

        //Calcul du k1
        System.out.println("R1 : 2A + 4C => 3D + CO2");
        k1 = Math.min((A/2), (C/4));
        System.out.println("> k : " + k1);
        System.out.println("> R1 : " + k1*2 + "A + " + k1*4 + "C => " + k1*3 + "D + " + k1 + "CO2");

        //Operations reaction 1
        A -= (k1*2);
        C -= (k1*4);
        D += (k1*3);
        CO2 += k1;
        System.out.println("A_1{" + A + "} B_1{" + B + "} C_1{" + C + "} D_1{" + D + "} E_1{" + E + "} F_1{"
                + F + "} CO2_1{" + CO2 + "}");

        //Calcul du k2
        System.out.println("R2 : B + 2C + E => 4F + 4CO2");
        k2 = Math.min((Math.min(B, (C/2))), (E));
        System.out.println("> k : " + k2);
        System.out.println("> R2 : " + k2 + "B + " + k2*2 + "C + " + k2 + "E => " + k2*4 + "F + " + k2*4 + "CO2");

        //Operations reaction 2
        B -= (k2);
        C -= (k2*2);
        E -= (k2);
        F += (k2*4);
        CO2 += (k2*4);
        System.out.println("A_2{" + A + "} B_2{" + B + "} C_2{" + C + "} D_2{" + D + "} E_2{" + E + "} F_2{"
                + F + "} CO2_2{" + CO2 + "}");

        //Calcul du k3
        System.out.println("R3 : A/2 + 4F => B + 4E + CO2");
        k3 = Math.min((A*2), (F/4));
        System.out.println("> k : " + k3);
        System.out.println("> R3 : " + k3/2 + "A + " + k3*4 + "F => " + k3 + "B + " + k3*4 + "E + " + k3 + "CO2");

        //Opereations reaction 3
        A -= (k3/2);
        F -= (k3*4);
        B += (k3);
        E += (k3*4);
        CO2 += (k3);
        System.out.println("A_3{" + A + "} B_3{" + B + "} C_3{" + C + "} D_3{" + D + "} E_3{" + E + "} F_3{"
                + F + "} CO2_3{" + CO2 + "}");
        sc.close();

    }
}
