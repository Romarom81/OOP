package Seminars.Seminar2.home_task_sem2;

public class Secd_Cat implements ICatsA {

    String name;
    int age;
    String owner;


    Secd_Cat(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    @Override
    public void eat() {
        System.out.println( " Что-то я проголодался, не пора бы перекусить   " + owner + "  дай поесть!!");
        
    }

    @Override
    public void greet() {
        System.out.println( " Хай , муур мяу!! я кот " + name + " Мне уже " + age  + "  лет!!");
        
    }

    @Override
    public void sleep() {
        System.out.println( owner + " лег спать, самое время побегать!!!");
        
    }
    
    
}
