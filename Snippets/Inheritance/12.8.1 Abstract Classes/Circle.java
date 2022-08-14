public class Circle extends Shape {

    private double radius;
 
    public Circle(Point center, double radius) {
       this.radius = radius;
       this.position = center;
    }
 
    @Override
    public double computeArea() {
       return (Math.PI * Math.pow(radius, 2));
    }
 }