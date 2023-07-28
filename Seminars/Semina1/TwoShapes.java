package Seminars.Semina1;

public class TwoShapes {
    private double width;
    private double height;

    TwoShapes (double width, double height) {
        this.height = height;
        this.width = width;
    }

    TwoShapes (){
        height = 0.0;
        width = 0.0;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    void showDim () {
        System.out.println( "Ширина и высота: " + width + " и " + height);
    }
  
}
 class Triangle extends TwoShapes {

    String style;

    Triangle(double width, double height, String style) {
        super(width, height);
        this.style = style;

    }
   Triangle (double width, double height){
       super(width, height);
   } 
   
    double area () {
        return ( getWidth()*getHeight()/2);
    }

    void showStyle () {
        System.out.println( "Треугольник " + style );
    }
 }
