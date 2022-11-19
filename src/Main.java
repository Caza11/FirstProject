public class Main {



    public static void main(String[] args) {


    //Funcion sumar
    int resultado = suma(2,6,4);

    System.out.println(resultado);

    //Clase coche
    Coche miCoche = new Coche();
    miCoche.agregarPuertas();


    System.out.println();
    System.out.println(miCoche.numPuertas);

    }

    public static int suma(int a, int b, int c)
    {
        return a + b + c;


    }



        public static class Coche
        {
            public int numPuertas = 0;

            public void agregarPuertas()
            {
            numPuertas++;
            }


        }



}