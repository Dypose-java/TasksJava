package testAll.test4;

public class Main {
    public static void main(String[] args) {
        People people = new Dypose("Dypose",52,1);
        System.out.println(people);
        
    }

}
abstract class People{
   private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
class Dypose extends People{
    private int id;
    public Dypose(String name, int age, int id) {
        super(name,age);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Dypose{" +
                "id=" + id +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
class Example{
    public Example() {
        System.out.println("Hello word");
    }
}
class MainExample extends  Example{

}

