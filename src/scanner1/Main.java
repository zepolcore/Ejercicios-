package scanner1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //realice un programa que pida dos numeros y luego muestres el resltado de su multiplicacion
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese su primer valor ");
        float valor1;
        valor1 = input.nextFloat();
        System.out.println("Ingrese el segundo valor");
        float valor2;
        valor2 = input.nextFloat();
        System.out.println("----------------------------------------------------------------");
        float multiplier = valor1*valor2;
        System.out.println("La la multiplicacion entre ambos valores es: "+ valor1 + "*" +valor2 + "=" + multiplier);
        System.out.println("FIN DEL PROGRAMA");
    }
}
