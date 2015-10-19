/**
 * We can use Factory design pattern to implement this
 * We are going to create a Shape interface and concrete classes implementing the Shape interface
 * /
public interface Shape{
    void draw();
}

//Concrete class Rectangle included private variable width and length, and override interface Shape

public class Rectangle implements Shape{
    
    private double width;
    private double length;
    
    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    
    @Override
    public void draw(){
    
        System.out.println("Area of Rectangle: " +(width*length));
        
    }
}

//Concrete class Circle included private variable radius, and override interface Shape
public class Circle implements Shape{
    
    private double radius;
    private final double PI = 3.1415926;
    
    Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public void draw(){
        System.out.println("Area of Circle: "+(PI*radius*radius));
    }
}
//Concrete class Square included private variable length, and override interface Shape
public class Square implement Shape{
    
    private double length;
    
    Square(double length){
        this.length = length;
    }
    
    @Override
    public void draw(){
        System.out.println("Area of Square: " +(length * length));
    }
}

//Create a Factory to generate object of concrete class

public class ShapeFactory{
    
    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle(10.0);
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle(10.0, 15.0);
        }
        if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square(10.0);
        }
        return null;
    }
}
//use Factory to get object of concrete class by passing information
public class FactoryDemo{
    public static void main(String[] args){
        ShapeFactory shapeF = new ShapeFactory();
        Shape shape1 = shapeF.getShape("CIRCLE");
        Shape shape2 = shapeF.getShape("RECTANGLE");
        Shape shape3 = shapeF.getShape("SQUARE");
        
        List<Double> list = new LinkedList<Double>();
        list.add(shape1);
        list.add(shape2);
        list.add(shape3);
        
        Collections.sort(list);
    }
}