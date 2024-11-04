//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape shape1 =new Shape("Red",true);
        System.out.println("Color of shape "+shape1.getColor());
        System.out.println("is filled? "+shape1.isFilled());
        shape1.setColor("Blue");
        System.out.println("Color of shape "+shape1.getColor());
        System.out.println(shape1);
        System.out.println("**************************");


        Circle c1 = new Circle(1.0,"Black",true);
        System.out.println("Area of circle "+c1.getArea());
        System.out.println("Perimeter of circle "+c1.getPerimeter());
        System.out.println(c1);
        System.out.println("**************************");

        Rectangle r1=new Rectangle(6,2);
        System.out.println("Rectangle width:"+ r1.getWidth());
        System.out.println("Rectangle length: "+r1.getLength());
        System.out.println("Rectangle Perimeter: "+r1.getPerimeter());
        System.out.println("Rectangle area: "+r1.getArea());
        System.out.println(r1);
        System.out.println("**************************");


        Square s=new Square(6);
        System.out.println("Square side: "+s.getSide());
        s.setSide(2);
        System.out.println("Square new side: "+s.getSide());
        System.out.println("Square Perimeter: "+s.getPerimeter());
        System.out.println("Square area: "+s.getArea());
        System.out.println(s);

    }
}