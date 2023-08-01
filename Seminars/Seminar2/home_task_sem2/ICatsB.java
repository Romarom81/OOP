package Seminars.Seminar2.home_task_sem2;

public interface ICatsB extends ICatsA {

     
    static void getOwner( String owner ){
        
        System.out.println( " Мой хозяин - " + owner);
    }
}
