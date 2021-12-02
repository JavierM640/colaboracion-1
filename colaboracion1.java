public class colaboracion1 {

    public static double triangulo(double b, double a){

        double area;

        area = (b * a)/2;

        return area;
    }
    public static double rectangulo(double b, double a){

        double area;

        area = (b * a);

        return area;
    }

    public static void main (String[] args) {
        System.out.println(triangulo(2, 3));
        System.out.println(rectangulo(2,3));
    }
}
