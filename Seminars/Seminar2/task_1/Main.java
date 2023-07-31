package Seminars.Seminar2.task_1;

public class Main {
    public static void main(String[] args) {
        Test textObj =  new Test();
        for (int index = 0; index < 5; index++) {
            System.out.println( " Следующее значение " + textObj.getNext());

        }
        System.out.println( "Сброс!");
        textObj.reset();

        System.out.println( " Начальное значение 100");
        textObj.setStart (100);
        
        for (int index = 0; index < 5; index++) {
            System.out.println( " Следующее значение " + textObj.getNext());

        }

        System.out.println( "==============================\n");

        Test2 textObj2 =  new Test2();
        for (int index = 0; index < 5; index++) {
            System.out.println( " Следующее значение " + textObj2.getNext());

        }
        System.out.println( "Сброс!");
        textObj2.reset();

        System.out.println( " Начальное значение 200");
        textObj2.setStart (200);
        
        for (int index = 0; index < 5; index++) {
            System.out.println( " Следующее значение " + textObj2.getNext());

        }

    }
}
