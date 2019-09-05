package ru.stqa.ptf.sandbox;

public class Point {
    double x1 = 1;
    double x2 = 2;
    double y1 = 3;
    double y2 = 4;

    public Point(double p1, double p2) {
        this.x1 = p1;
        this.x2 = p2;
        this.y1 = p1;
        this.y2 = p2;
    }


    public double distance() {
        return Math.sqrt((this.y2 - this.y1) * (this.y2 - this.y1) + (this.x2 - this.x1) * (this.x2 - this.x1));

    }
}