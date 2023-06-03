package main;

public class Point {

    public double pointX = 45.8543;
    public double pointY = 18.3545;

    public void inverse(){
        double c;
        c =  pointX;
        pointX = pointY;
        pointY =c;
    }

    public void printPoint(){
        System.out.println("pointX: " + pointX +" pointY: " + pointY);
    }

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }
}
