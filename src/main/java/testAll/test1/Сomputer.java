package testAll.test1;


public class Сomputer {
    Motherboard motherboard;

    public Сomputer(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public String toString() {
        return "Сomputer{" +
                "motherboard=" + motherboard.getName() +
                '}';
    }

}
 enum Motherboard{
     ASUS("асус");

     private String name;

     Motherboard(String name) {
         this.name = name;
     }

     public String getName() {
         return name;
     }
 }


class Main{
    public static void main(String[] args) {
        Сomputer pc1 = new Сomputer(Motherboard.ASUS);
        System.out.println(pc1);
    }
}