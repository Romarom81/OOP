package Seminars.Seminar2.task_5;

abstract class Animal {
    protected String name;

    public Animal (String name) {
        this.name = name;

    }
    public abstract void makeSound ();

    public void sleep (){
        System.out.println( " Спит .....");
    }


}

class Cat extends Animal{
    
}
