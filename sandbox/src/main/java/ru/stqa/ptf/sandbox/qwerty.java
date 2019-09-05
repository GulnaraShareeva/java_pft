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

        Point p1 = new Point (1,3);
        Point p2 = new Point (2,4);
        p1.x1 = 1;
        p2.x2 = 2;
        p1.y1 = 3;
        p2.y2 = 4;

        System.out.println("Расстояние между точками  = " + p2.distance());
    }

    public static void hello (String somebody) {
        System.out.println("Hello," + somebody+ "!");
    }


}

