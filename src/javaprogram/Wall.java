package javaprogram;

/**
 * Method named getWidth without any parameters, it needs to return the value of width field.
 * Method named getHeight without any parameters, it needs to return the value of height field.
 * Method named setWidth with one parameter of type double, it needs to set the value of the width
 * field. If the parameter is less than 0 it needs to set the width field value to 0.
 *Method named setHeight with one parameter of type double, it needs to set the value of the
 * height field. If the parameter is less than 0 it needs to set the height field value to 0.
 * Method named getArea without any parameters, it needs to return the area of the wall.
 */

public class Wall {

    // Instance variables
    private double width;
    private double height;

    // No-arg constructor
    public Wall() {
        this.width = 0;
        this.height = 0;
    }

    // Constructor with parameters
    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    // Method to get the width
    public double getWidth() {
        return width;
    }

    // Method to get the height
    public double getHeight() {
        return height;
    }

    // Method to set the width
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // Method to set the height
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to get the area of the wall
    public double getArea() {
        return width * height;
    }

    // Main method to test the Wall class
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea()); // area= 20.0
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth()); // width= 5.0
        System.out.println("height= " + wall.getHeight()); // height= 0.0
        System.out.println("area= " + wall.getArea()); // area= 0.0
    }
}
