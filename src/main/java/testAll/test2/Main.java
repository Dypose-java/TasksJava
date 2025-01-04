package testAll.test2;

public class Main {
    public static void main(String[] args) {
        Printable printable = new Book("book", 52);
        printable.print();
        String name =((Book)printable).getName();
        System.out.println(name);
        printable.deafaultPrint();
        Printable.staticPrint();
    }
}

interface Printable {
    default void deafaultPrint(){System.out.println("default Print");}
    void print();
    static void staticPrint(){
        System.out.println("staticPrint");
    }
}

class Book implements Printable {
    String name;
    int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void print() {
        System.out.printf("Name:%s, price:%d", name, price);
    }
}



