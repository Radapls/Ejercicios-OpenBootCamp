public class Main
    {
        public static void main(String[] args)
        {
            Coche miCoche = new Coche();

            miCoche.AgregarPuerta(); //Crear un objeto miCoche en el main y añadirle una puerta.

            System.out.println("Numero de puertas de mi coche " + miCoche.puertas); //Mostrar el número de puertas que tiene el objeto.

            suma (1, 2, 3); //Llamar a la función en el main y darle valores.
        }

        public static int suma (int a, int b, int c) //Crear una función con tres parámetros que sean números que se suman entre sí.
        {
            return a + b + c;
        }
    }

class Coche { //Crear una clase coche.
    public int puertas = 4; //Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    public void AgregarPuerta()
    {
        this.puertas++;
        //Una función que incremente el número de puertas que tiene el coche.
    }
}
