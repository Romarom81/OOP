package Seminars.Seminar2.task_4;

public interface IUserID {
    int getUserID ();

    default int addAdminID () {  // метод с реализацией по умолчанию
        return 1;
    }

    static int getUniversalID (){
        return 0;
    }


}

