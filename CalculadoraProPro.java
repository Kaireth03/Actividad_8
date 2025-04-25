import java.util.Scanner;

public class CalculadoraProPro {
    static Scanner entrada = new Scanner(System.in);
    static double[] resultados = new double[100];
    static int contadorResultados = 0;

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            try {
                mostrarMenuFiguras();
                int figura = Integer.parseInt(entrada.nextLine());

                System.out.println("\nSeleccione la operacion:");
                System.out.println("1. Area");
                System.out.println("2. Perimetro");
                System.out.println("3. Potencia");
                System.out.print("Opcion: ");
                int operacion = Integer.parseInt(entrada.nextLine());

                OperacionFigura op;
                switch (operacion) {
                    case 1: op = new Area(); break;
                    case 2: op = new Perimetro(); break;
                    case 3: op = new Potencia(); break;
                    default:
                        System.out.println("Operación no válida.");
                        continue;
                }

                double resultado = op.calcular(figura);
                guardarResultado(resultado);
                System.out.println("Resultado: " + resultado);

            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese solo números válidos.");
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }

            System.out.print("\n¿Desea realizar otra operación? (s/n): ");
            String respuesta = entrada.nextLine().toLowerCase();
            continuar = respuesta.equals("s");
        }

        mostrarResultados();
        System.out.println("Gracias por usar la calculadora.");
    }

    public static void mostrarMenuFiguras() {
        System.out.println("\nSeleccione la figura:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");
    }

    public static void guardarResultado(double resultado) {
        resultados[contadorResultados] = resultado;
        contadorResultados++;
    }

    public static void mostrarResultados() {
        System.out.println("\n--- Resultados almacenados ---");
        for (int i = 0; i < contadorResultados; i++) {
            System.out.println("Operación " + (i + 1) + ": " + resultados[i]);
        }
    }
}
