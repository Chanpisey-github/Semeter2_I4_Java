package tp09.Ex2;

import java.util.Scanner;

public class Point3D {
    private Double x,y,z;
    private Point3D(){ }


    public Point3D(Double x,Double y,Double z) {
        setX(x);
        setY(y);
        setZ(z);

    }

    public static Point3D dataInput(){
        Scanner sc = new Scanner(System.in);
        Point3D point3d = new Point3D();
        try {
            System.out.print("Input value of X: ");
            point3d.setX(sc.nextDouble());
            System.out.print("Input value of Y: ");
            point3d.setY(sc.nextDouble());
            System.out.print("Input value of Z: ");
            point3d.setZ(sc.nextDouble());
        }catch (Exception e){
            System.out.println("Have Something  Wrong....Try again!!");
        }
        return point3d;
    }


    @Override
    public String toString() {
        return "Point3D{" +'\''+
                "x=" + x +'\''+
                ", y=" + y +'\''+
                ", z=" + z +
                '}';
    }

    public Double getX() { return x;}

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }
    public void setY(Double y)  {
        this.y = y;
    }


    public Double getZ() {
        return z;
    }
    public void setZ(Double z) {
        this.z = z;
    }
}
