package Seminars.Seminar2.home_task_sem2;

public interface ICatsA {

    default void animall () {

        System.out.println( " Представляем кошек, любимцев многих людей!");

    } // метод по умолчанию

    void greet (); // приветсвие 

    void sleep (); // кот засыпает
    
    void eat (); // еда 


}
