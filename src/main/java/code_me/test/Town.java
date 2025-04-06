package code_me.test;

import java.io.Serializable;
import java.util.function.BiFunction;

public class Town {
    private String postCode = "33333";
private String name;

    public Town(String name) {
        this.name = name;
    }

    public Town() {
    }

    public class Street {
        private int house;

        public void printAddress() {
            System.out.println("Город " + name);
            System.out.println("Индекс " + postCode);
            System.out.println("Улица " + this);
            System.out.println("Дом " + house);
        }
    }

    public void createStreet() {
        Street street = new Street();
        street.house = 78;
        street.printAddress();
    }

    public static void main(String[] args) {
        BiFunction<Object, Object, Boolean> objectObjectBooleanBiFunction = (Object arg1, Object arg2) -> arg1.equals(arg2);
    }
}
class ClassTest{
    public static void main(String[] args) {
        int[] array = new int[4];

        printInfo(array.getClass());
        printInfo(Serializable.class);
        printInfo(Integer.class);
        printInfo(double.class);
    }
    private static void printInfo(Class arrayClass) {
        System.out.println("Class name " + arrayClass.getName());
        System.out.println("Is Array? " + arrayClass.isArray());
        System.out.println("Is Interface? " + arrayClass.isInterface());
        System.out.println("Is Primitive? " + arrayClass.isPrimitive());
        System.out.println();
    }
}