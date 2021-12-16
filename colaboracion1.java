import java.util.Scanner;

public class colaboracion1 {

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

    public static void volumenTriangular(){
      Scanner s = new Scanner(System.in);

      double area = triangulo();
      double altura;

      System.out.println("Introduce la cantidad de lados: ");
      altura = s.nextDouble();

      double volumenPrisma= area*altura;

      System.out.println("El volumen del prisma triangular es de " + volumenPrisma);


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
}
