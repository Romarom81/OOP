package Seminars.Seminar2.home_task_sem2;


public class First_Cat implements ICatsA {
    String name;
    int age;
    String owner;

    First_Cat(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    @Override
    public void eat() {
        System.out.println( " Мне пора покушать");
        
    }

    @Override
    public void greet() {
        System.out.println( " Привет, мяу!! Меня завут , " + name + " Мне исполнилось - " + age);
        
    }

    @Override
    public void sleep() {
        System.out.println( " Уже поздно, мне пора спать, Мяууу");
        
    }

    
}
