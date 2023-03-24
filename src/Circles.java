
// Casey Spaulding
// 10/23/2023
// SkillStorm Java
// Circles.java
// Instructor: Miles Mixon
public class Circles {
    private int radius;
    private int diameter;
    private String color;
    static final double PI = 3.14;

    int count = 0;

    // Default constructor
    public Circles() {
        this.radius = 20;
        this.color = "Blue";
        count++; // Increment count by 1 of each circle object created using this constructor
        System.out.println("Circle object created with default values");
    }

    // Constructor with radius and color
    public Circles(int radius, String color) {
        this.radius = radius;
        this.color = color;
        count++; // Increment count by 1 of each circle object created using this constructor
        System.out.println("Circle object created with custom radius and color constructor");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

    public double getDiameter(int radius) {
        return 2 * radius;
    }

    public String toString() {
        return "New Circle -> Radius: " + radius + " Diameter: " + diameter + " Color: " + color;
    }

    public static void main(String[] args) {
        Circles c1 = new Circles();
        Circles c2 = new Circles(10, "Red");
        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Circle 1 area: " + c1.getArea());
        System.out.println("Circle 2 area: " + c2.getArea());
        System.out.println("Circle 1 circumference: " + c1.getCircumference());
        System.out.println("Circle 2 circumference: " + c2.getCircumference());
        System.out.println("Circle 1 diameter: " + c1.getDiameter(c1.getRadius()));
        System.out.println("Circle 2 diameter: " + c2.getDiameter(c2.getRadius()));

        if (c1.getRadius() > c2.getRadius()) {
            System.out.println("Circle 1 is bigger than Circle 2");
        } else {
            System.out.println("Circle 2 is bigger than Circle 1");
        }

        if(c1.equals(c2)) {
            System.out.println("Circle 1 is equal to Circle 2");
        } else {
            System.out.println("Circle 1 is not equal to Circle 2");
        }
    }

}
