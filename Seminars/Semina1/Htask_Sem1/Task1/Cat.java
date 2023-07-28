package Seminars.Semina1.Htask_Sem1.Task1;

/**
 * Задача1
 * Создайте класс "Кот" (Cat) со следующими свойствами:
 * Приватное поле "имя" (name) типа String для хранения имени кота.
 * Приватное поле "возраст" (age) типа int для хранения возраста кота.
 * Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
 * Публичный метод "приветствие" (greet), который выводит на консоль приветствие
 * вида "Мяу!
 * Меня зовут <имя>. Мне <возраст> года(лет).".
 * Дополнительное задание:
 * Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String.
 * Добавьте соответствующее поле в классе "Кот" и методы доступа для него.
 * Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида
 * "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя
 * владельца>.".
 * Cat
 */

public class Cat {
    private String name;
    private int age;
    
    

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    void greet() {
        System.out.println(" Мяу! Меня зовут " + name + " Мне " + age + "лет/года." + Owner.getName());
    }

}

class Owner extends Cat {

    String Ownername;

 
    public String getOwnerName() {
        return Ownername;
    }

    public void setName(String Ownername) {
        this.Ownername = Ownername;
    }
    void showName (){
        System.out.println( "Мой владелец -" + Ownername);
    }

    public Owner(String name, int age, String ownername) {
        super(name, age);
        Ownername = ownername;
    }


}
