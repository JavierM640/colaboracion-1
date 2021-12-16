import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class colaboracion1 {
    /** Inicio codificación: Javier Martin - 02/12/2021 */
    public static double triangulo() {
        Scanner s = new Scanner(System.in);

        double area;
        double b;
        double a;

        System.out.println("Introduce la base: ");
        b = s.nextDouble();

        System.out.println("Introduce la altura: ");
        a = s.nextDouble();

        area = (b * a) / 2;

        System.out.println("El area es de " + area);

        return area;
    }

    /** Fin codificación: Javier Martin - 02/12/2021 */

    public static double rectangulo() {
        Scanner s = new Scanner(System.in);

        double area;
        double b;
        double a;

        System.out.println("Introduce la base: ");
        b = s.nextDouble();

        System.out.println("Introduce la altura: ");
        a = s.nextDouble();

        area = (b * a);

        System.out.println("El area es de " + area);

        return area;
    }

    /** Inicio codificación: Javier Martin - 16/12/2021 */
    public static double Vrectangulo() {
        Scanner s = new Scanner(System.in);

        double volumen;
        double a;
        double h;
        double l;

        System.out.println("Introduce la altura: ");
        a = s.nextDouble();

        System.out.println("Introduce el ancho: ");
        h = s.nextDouble();

        System.out.println("Introduce el largo: ");
        l = s.nextDouble();

        volumen = a * h * l;

        System.out.println("El volumen es de " + volumen);

        return volumen;
    }
    /** Fin codificación: Javier Martin - 16/12/2021 */

    /** Inicio codificación: Javier Martin - 06/12/2021 */
    public static double circulo() {
        Scanner s = new Scanner(System.in);

        double area;
        double r;

        System.out.println("Introduce el radio: ");
        r = s.nextDouble();

        area = Math.PI * (r * r);

        System.out.println("El area es de " + area);

        return area;
    }

    public static double pentagono() {
        Scanner s = new Scanner(System.in);

        double area;
        double l;

        System.out.println("Introduce la cantidad de lados: ");
        l = s.nextDouble();

        area = (5 * l * (l / 2)) / 2;

        System.out.println("El area es de " + area);

        return area;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("1. Calcular area del triangulo");
            System.out.println("2. Calcular area del rectangulo");
            System.out.println("3. Calcular area del circulo");
            System.out.println("4. Calcular area del pentagono");
            System.out.println("5. Salir del programa");
            System.out.println("Elige una de las opciones: ");
            opcion = s.nextDouble();

            switch (opcion) {
                case 1:
                    triangulo();
                    break;
                case 2:
                    rectangulo();
                    break;
                case 3:
                    circulo();
                    break;
                case 4:
                    pentagono();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
            }
        }

    }
    /** Fin codificación: Javier Martin - 06/12/2021 */
}
