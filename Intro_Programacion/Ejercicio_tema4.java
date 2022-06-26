public class Ejercicio_tema4 {
    public static void main(String[] args) {

        int numeroIf = -2;
        int numeroWhile = 0;
        int numeroDoWhile = 0;
        int numeroFor = 0;
        var estacion = "invierno".toUpperCase();

        System.out.println("---------------------");
        System.out.println("Ejercicio If");
        if (numeroIf == 0) {
                System.out.println("NumeroIf es igual a " + numeroIf);
            } else if (numeroIf >= 0) {
                System.out.println(numeroIf + " es positivo");
            } else if (numeroIf <= 0) {
                System.out.println(numeroIf + " es negativo");
            }
        System.out.println("---------------------");

        System.out.println("Ejercicio While");
        while (numeroWhile < 3) {
            System.out.println("el valor de numeroWhile es " + numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        System.out.println("---------------------");

        System.out.println("Ejercicio Do While");
        do { numeroDoWhile = numeroDoWhile + 1;}
            while (numeroDoWhile < 3);
            System.out.println("el valor de numeroDoWhile es " + numeroDoWhile);
        System.out.println("---------------------");

        System.out.println("Ejercicio For");
        for (numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("el valor de numeroFor es " + numeroFor);
        }
        System.out.println("---------------------");

        System.out.println("Ejercicio Switch Case");
        switch (estacion) {
            case "VERANO":
            System.out.println("Es Verano");
                break;
            case "OTOÑO":
                System.out.println("Es Otoño");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("Esta no es una estación");
        }
        System.out.println("---------------------");
    }
}

