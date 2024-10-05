package prueba.area_circulo;

import java.util.Scanner;

public class Area_circulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();


        double area = 3.1416 * radio * radio;

        System.out.println("El área del círculo es: " + (area));
    }
}
