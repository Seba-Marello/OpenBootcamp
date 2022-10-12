public class Main {
    public static void main(String[] args) {

        int numeroIf = 15;
        int numeroWhile = 1;
        int numeroDoWhile = 3;
        int numeroFor;
        String estacion = "Verano";


        //CONSIGNA: Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        //NOTA: No estaba especificado en la consigna que deberia hacer si se cumplia cada condicion, asi que lo resolvi de esta manera.
        if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else
            System.out.println("El numero es cero");


        //CONSIGNA: Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        //
        //Incrementar el valor de la variable en uno cada vez que se ejecute.
        //
        //Mostrarlo por pantalla cada vez que se ejecute.
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }


        //CONSIGNA: Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 3);


        //CONSIGNA: Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //CONSIGNA: Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
        switch (estacion) {
            case "Primavera":
                System.out.println("Esta en primavera");
                break;
            case "Verano":
                System.out.println("Esta en verano");
                break;
            case "Otoño":
                System.out.println("Esta en otoño");
                break;
            case "Invierno":
                System.out.println("Esta en invierno");
                break;
            default:
                System.out.println("No corresponde a una estacion del año");
        }


    }
}