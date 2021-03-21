package Ex02.point;

import java.util.Scanner;

public class Point3D {
    private static Scanner sc;
    private double x,y,z;
    private Point3D(){}
    public static Point3D inputData(){
        sc = new Scanner(System.in);
        Point3D p = new Point3D();
        System.out.print("Input x:");
        try {
            p.setX(Double.parseDouble(sc.nextLine()));
        } catch (Exception e) {
            System.out.println("Change to Integer");
        }
        System.out.print("Input y:");
        try {
            p.setY(Double.parseDouble(sc.nextLine()));
        } catch (Exception e) {
            System.out.println("Change to Integer");
        }

        System.out.print("Input z:");
        try {
            p.setZ(Double.parseDouble(sc.nextLine()));
        } catch (Exception e) {
            System.out.println("Change to Integer");
        }
        return p;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x){
        checkField.checkNullOrEmptyOrBlank(String.valueOf(x), "x");
        this.x =x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        checkField.checkNullOrEmptyOrBlank(String.valueOf(z),"y");
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        checkField.checkNullOrEmptyOrBlank(String.valueOf(z), "z");
        this.z = z;
    }
    @Override
    public String toString(){
        return "{\nx=" + x + "\ny=" + y + "\nz=" + z + "\n}";
    }
}
