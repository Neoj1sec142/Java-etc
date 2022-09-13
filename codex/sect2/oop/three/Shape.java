// implementing an interface example
public interface Shape{
    public void getArea();
    public void getShapeName();
    public void getSides();
}
class Rectangle implements Shape{
    String shapeName = "Rectangle";
    int length, breadth;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void getShapeName(){
        System.out.println("Name of the shape is: " + shapeName);
    }
    public void getArea(){
        System.out.println("Area of the rectangle is: " + (length * breadth));
    }
    public void getSides(){
        System.out.println("Length is: " + length);
        System.out.println("Breadth is: " + breadth);
    }
    public static void main(String[] args){
        Rectangle rect = new Rectangle(5, 2);
        rect.getShapeName();
        rect.getArea();
        rect.getSides();
    }
}
class Square implements Shape{
    String shapeName = "Square";
    int side;
    Square(int side){
        this.side = side;
    }
    public void getShapeName(){
        System.out.println("Name of the shape is: " + shapeName);
    }
    public void getArea(){
        System.out.println("Area of the square is: " + (side * side));
    }
    public void getSides(){
        System.out.println("Length is: " + this.side);
    }
    public static void main(String[] args){
        Square sq = new Square(5);
        sq.getShapeName();
        sq.getArea();
        sq.getSides();
    }
}