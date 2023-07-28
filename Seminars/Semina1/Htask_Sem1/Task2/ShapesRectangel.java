package Seminars.Semina1.Htask_Sem1.Task2;

public class ShapesRectangel {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(12.2, 11.2);

        System.out.println( " Прямоугольник со сторонами:");
        System.out.println( " Ширина = " + r1.getWidth());
        System.out.println( " Высота = " + r1.getHeight());
        System.out.println( " Периметр прямоугольника = " + r1.calculatePerimeter());
         System.out.println( " Площадь прямоугольника = " + r1.calculateArea());

    
    }
}
