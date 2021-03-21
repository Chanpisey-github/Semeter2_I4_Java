package Ex02;

import Ex02.point.Point3D;

public class circleFunction {
    Point3D point;
    Point3D point2;

    public circleFunction(){
        System.out.println("Point 1");

        this.point = Point3D.inputData();
        System.out.println("Point 2");

        this.point2=Point3D.inputData();
    }

    public boolean equal(circleFunction circle) {
        double circleLength = circle.getRadius() - getRadius();
        return circleLength == 0;
    }

    public int compareTo(circleFunction c) {

        return (int) (c.getLength() - getLength());
    }

    public double getLength() {
        return getRadius() * 2;
    }

    public double getSurface() {
        double x = Math.pow((point.getX() - point2.getX()), 2);
        double y = Math.pow((point.getY() - point2.getY()), 2);
        double z = Math.pow((point.getZ() - point2.getZ()), 2);
        return x + y + z;
    }

    public double getRadius() {
        return Math.sqrt(getSurface());
    }

    public void inc(int number) {
        point.setX(point.getX() + number);
        point.setY(point.getY() + number);
        point.setZ(point.getZ() + number);
        point2.setX(point.getX() + number);
        point2.setY(point.getY() + number);
        point2.setZ(point.getZ() + number);
    }

    public void dec(int number) {
        point.setX(point.getX() - number);
        point.setY(point.getY() - number);
        point.setZ(point.getZ() - number);
        point2.setX(point.getX() - number);
        point2.setY(point.getY() - number);
        point2.setZ(point.getZ() - number);
    }

    @Override
    public String toString() {
        return "length of circle:" + String.format("%.2f", getLength()) + ",Radius:"
                + String.format("%.2f", getRadius()) + ",X(" + point.getX() + "," + point2.getX() + ")" + ",Y("
                + point.getY() + "," + point2.getY() + ")" + ",Z(" + point.getZ() + "," + point2.getZ() + ")";
    }
}