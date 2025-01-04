package testAll.test3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("Iphone15");

        Phone.Button button =phone.new Button();
        button.getVolume();
        button.butAddVolume().butAddVolume();
        button.getVolume();
        button.butReduceVolume();
        button.getVolume();

    }

}
class Phone  {
    private static String name;
   private static Set<NameDekstopApp> dekstopAppList = new HashSet<>();

    public Phone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    class Button{
        private int counter = 0;

        void butMain(){
            System.out.println("Главная кнопка нажата");
        }

        Button butAddVolume(){
            if (counter<=9) {
                System.out.printf("Прибавление громкости +%d\n", ++counter);
            }
            else {
                System.out.println("Volume max\n");
            }
            return this;
        }

        Button butReduceVolume(){
            if (counter>1)
                System.out.printf("Убавление громкости -%d\n", --counter);
            else
                System.out.println("Громкость минимальная");
            return this;
        }

        Button  getVolume(){
            System.out.printf("Громкость %s: %d\n",name,counter);
            return this;
        }
    }

    enum NameDekstopApp{
        TELEGRAM,VK,T_BANK
    }

    interface Screen{

        default void setDekstopApp(NameDekstopApp name){
            dekstopAppList.add(name);
        }
        default void getDekstop(){

            if (dekstopAppList.size()==0){
                System.out.println("На телефоне нет приложений");
            }
            else
                System.out.printf("Приложения на %s:%s\n",Phone.name,dekstopAppList);

        }

        default void removeDekstop(NameDekstopApp name){
            Phone.dekstopAppList.remove(name);
        }
    }
}
class Test{
      int age;

    public void getClas() {
       class Example{
           String name;
           int age;

           public Example(String name, int age) {
               this.name = name;
               this.age = age;
           }
       }
    }
}
class runMain {
    public static void main(String[] args) {
        List<String> customStringBuilder = new ArrayList<>(10) {

            @Override
            public String get(int index) {

                return super.get(index);
            }
        };



    }
}