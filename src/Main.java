public class Main {
    public static void main(String[] args) {

        //Primera Parte
        System.out.println(suma(7,9,14));

        //Segunda Parte
        Coche coche = new Coche();
        coche.aumentarPuertas();
        System.out.println(coche.puerta);

    }

    public static int suma(int a,int b, int c){
        return a + b + c;
    }
}