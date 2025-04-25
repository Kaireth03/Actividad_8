import java.util.Scanner;

public class Potencia extends OperacionFigura {
    static Scanner entrada = new Scanner(System.in);

    @Override
    public double calcular(int figura) {
        System.out.print("Ingrese la base: ");
        int base = Integer.parseInt(entrada.nextLine());
        System.out.print("Ingrese el exponente (entero >= 0): ");
        int exponente = Integer.parseInt(entrada.nextLine());
        return potenciaRecursiva(base, exponente);
    }

    public int potenciaRecursiva(int base, int exponente) {
        if (exponente == 0) return 1;
        return base * potenciaRecursiva(base, exponente - 1);
    }
}
