public class Typage {

    public static void main(String[] args){

        //Identification des variables
        int var1 = 10;
        float var2 = 6/5;
        char var3 = 5;

        //Premiere conversion
        String var1String = Integer.toString(var1);
        System.out.println("Conversion #1 : " + var1String);

        //Deuxieme conversion
        boolean var1Boolean = (var1 == 10);
        System.out.println("Conversion #2 : " + var1Boolean);
        //La conversion est impossible

        //Troisieme conversion
        int var2Int = (int)var2;
        System.out.println("Conversion #3 : " + var2Int);

        //Quatireme conversion
        String var2IntString = Integer.toString(var2Int);
        System.out.println("Conversion #4 : " + var2Int);

        //Cinquieme conversion
        int var3Int = (int)var3;
        System.out.println("Conversion #5 : " + var3Int);

    }

}
