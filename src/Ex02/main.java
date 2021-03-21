package Ex02;

public class main {
    public static void main(String[] args) {
        circleFunction circle1 = new circleFunction();
        circleFunction circle2 = new circleFunction();
        if (circle1.equal(circle2))
            System.out.println("They are equal(radius)");
        else
            System.out.println("They are not equal (radius)");
        if (circle1.compareTo(circle2) > 0)
            System.out.println("circle1 is bigger than circle2");
        else if (circle1.compareTo(circle2) < 0)
            System.out.println("circle1 is smaller than circle2");
        else
            System.out.println("They have the same length");
        System.out.println("Before Increase");
        System.out.println("Circle1 " + circle1.toString());
        System.out.println("Circle2 " + circle2.toString());
        System.out.println("After Increase 2");
        circle1.inc(2);
        circle2.inc(2);
        System.out.println("Circle1 " + circle1.toString());
        System.out.println("Circle2 " + circle2.toString());
        System.out.println("Decrease 2");
        circle1.dec(2);
        circle2.dec(2);
        System.out.println("Circle1 " + circle1.toString());
        System.out.println("Circle2 " + circle2.toString());

    }
}
