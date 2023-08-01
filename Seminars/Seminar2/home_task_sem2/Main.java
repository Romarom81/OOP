package Seminars.Seminar2.home_task_sem2;

public class Main {

    public static void main(String[] args) {
        First_Cat cat1 = new First_Cat(" Барсик", 5, "Маша");
        Secd_Cat cat2 = new Secd_Cat(" Обормот", 7, "Колян");
        
        cat1.animall();
        cat1.greet();
        cat1.sleep();
        cat1.eat();

        cat2.animall();
        cat2.greet();
        cat2.sleep();
        cat2.eat();
    
    
    }

    
    
}