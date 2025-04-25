public class Area extends OperacionFigura {
    static Scanner entrada = new Scanner(System.in);

    @Override
    public double calcular(int figura) {
        switch (figura) {
            case 1:
                System.out.print("Radio: ");
                double radio = Double.parseDouble(entrada.nextLine());
                return Math.PI * radio * radio;
            case 2:
                System.out.print("Lado: ");
                double lado = Double.parseDouble(entrada.nextLine());
                return lado * lado;
            case 3:
                System.out.print("Base: ");
                double base = Double.parseDouble(entrada.nextLine());
                System.out.print("Altura: ");
                double altura = Double.parseDouble(entrada.nextLine());
                return (base * altura) / 2;
            case 4:
                System.out.print("Base: ");
                double baseR = Double.parseDouble(entrada.nextLine());
                System.out.print("Altura: ");
                double alturaR = Double.parseDouble(entrada.nextLine());
                return baseR * alturaR;
            case 5:
                System.out.print("Lado: ");
                double ladoP = Double.parseDouble(entrada.nextLine());
                return (5 * ladoP * ladoP) / (4 * Math.tan(Math.PI / 5));
            default:
                System.out.println("Figura no válida.");
                return 0;
        }
    }S

}
