package ru.stqa.ptf.sandbox;

public class qwerty {

    public static void main(String[] args) {
        hello ("world");
        hello ("user");
        hello ("Gulnara");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area ());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

        double x1 = 1;
        double x2 = 2;
        double y1 = 3;
        double y2 = 4;
        System.out.println("Расстояние между точками  = " + distance(x1, x2, y1, y2));
    }

    public static void hello (String somebody) {
        System.out.println("Hello," + somebody+ "!");
    }

    public static double distance (double x1, double x2, double y1, double y2 ) {
        return Math.sqrt((y2 - y1) *  (y2 - y1) + (x2 - x1) *  (x2 - x1));

    }


}

