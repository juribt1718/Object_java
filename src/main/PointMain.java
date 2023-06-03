package main;

public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(12.345,23.456);
        p1.inverse();
        p1.printPoint();

        String s = new String("Yura");
        System.out.println(s);

        p1.pointX =18.3456;
        p1.pointY =88.3456;

        p1.printPoint();

    }


}
