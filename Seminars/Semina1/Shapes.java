package Seminars.Semina1;

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(4.0,10.1,"green");
        Triangle t2 = new Triangle(3.0,25.0, "white");
        TwoShapes t3 = new TwoShapes(6.0, 11.1);
        Triangle t4 = new Triangle(34.2, 12.0);
        TwoShapes t5 = new TwoShapes();

        // t1.setHeight(6.0);
        // t1.setWidth(11.1);
        // t1.style = "green";
        
        // t2.setHeight(3.0);
        // t2.setWidth(24.1);
        // t2.style = "white";

        System.out.println("Информация от t1:");
        t1.showStyle ();
        t1.showDim ();
        System.out.println( "Площадь = " + t1.area() );

        System.out.println("Информация от t2:");
        t2.showStyle ();
        t2.showDim ();
        System.out.println( "Площадь = " + t2.area() );
    }
}
