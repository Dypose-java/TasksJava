package vk_skuf.vanya.lab1;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        List<Mammal> listMammal = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int capacityList = 0;

        while (true) {
            try {

                System.out.println("Enter sum Mammal");
                capacityList = scanner.nextInt();

                if (capacityList == 0)
                    System.err.println("sum>0");

                else break;

            } catch (Exception e) {
                System.err.println("the value was entered incorrectly ");
                scanner.next();
            }
        }


        for (int i = 0; i < capacityList; i++) {
            scanner.nextLine();

            System.out.println("Enter name:");
            String name = scanner.nextLine();

            System.out.println("Enter family:");
            String family = scanner.nextLine();

            System.out.println("Enter maxSpeed");
            float maxSpeed = scanner.nextFloat();

            listMammal.add(new Mammal(name, family, maxSpeed));
        }
        System.out.println(listMammal);

        String maxFamile = maxLengthFamilyFromMammal(listMammal);

        int indexLastMaxFamily = IntStream.range(0, listMammal.size()).filter(i -> listMammal.get(i).getFamily()
                .equals(maxFamile)).reduce((first, last) -> last).getAsInt();


        System.out.println("lastMaxElFromFamily: " + listMammal.get(indexLastMaxFamily) + ", index:" + indexLastMaxFamily);

    }

    static String maxLengthFamilyFromMammal(List<Mammal> list) {
        return list.stream().map(Mammal::getFamily).max(String::compareTo).get();
    }


}
