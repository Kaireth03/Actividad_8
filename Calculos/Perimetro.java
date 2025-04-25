import java.util.Scanner;

public class Perimetro extends OperacionFigura {
    static Scanner entrada = new Scanner(System.in);

    @Override
    public double calcular(int figura) {
        switch (figura) {
            case 1:
                System.out.print("Radio: ");
                double radio = Double.parseDouble(entrada.nextLine());
                return 2 * Math.PI * radio;
            case 2:
                System.out.print("Lado: ");
                double lado = Double.parseDouble(entrada.nextLine());
                return 4 * lado;
            case 3:
                System.out.print("Lado 1: ");
                double l1 = Double.parseDouble(entrada.nextLine());
                System.out.print("Lado 2: ");
                double l2 = Double.parseDouble(entrada.nextLine());
                System.out.print("Lado 3: ");
                double l3 = Double.parseDouble(entrada.nextLine());
                return l1 + l2 + l3;
            case 4:
                System.out.print("Base: ");
                double baseR = Double.parseDouble(entrada.nextLine());
                System.out.print("Altura: ");
                double alturaR = Double.parseDouble(entrada.nextLine());
                return 2 * (baseR + alturaR);
            case 5:
                System.out.print("Lado: ");
                double ladoP = Double.parseDouble(entrada.nextLine());
                return 5 * ladoP;
            default:
                System.out.println("Figura no válida.");
                return 0;
        }
    }
}
