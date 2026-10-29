public class Rectangle {
    double length, width;

    public void displayInfo() {
        System.out.println("Length: " + length + "; Width: " + width);
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4.0, 5.0);

        rect.displayInfo();
        System.out.println("Area: " + rect.calculateArea() + "\n Perimeter: " + rect.calculatePerimeter());
    }
}
