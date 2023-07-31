package Seminars.Seminar2.task_4;

public class Main {
    public static void main(String[] args) {
        Test4 test = new Test4();

        System.out.println( " Идентификатор пользователя - " + test.getUserID());
        System.out.println( " Идентификатор админа - "+ test.addAdminID());
        int uId = IUserID.getUniversalID();
        System.out.println(uId);
    }
}
