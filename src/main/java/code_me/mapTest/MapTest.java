package code_me.mapTest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        IntStream.rangeClosed(1, 3).forEach(el -> map.put(el, "value" + el));
        String orDefault = map.getOrDefault(4, "-1");//
        System.out.println(orDefault);

        map.merge(2,"toUpperCase",(oldVal,newVal)->oldVal.toUpperCase(Locale.ROOT));
        System.out.println(map);

        Map<Integer,Integer> integerMap = new HashMap<>();
        IntStream.rangeClosed(1,4).forEach(el->integerMap.put(el,52));
        integerMap.merge(1,50,Integer::min);
        System.out.println(integerMap);

        Collection<Integer> values = integerMap.values();
        System.out.println(values);

        Set<Integer> integers = integerMap.keySet();
        System.out.println(integers);



    }
}

class fdsdfsdfsd {
    //метод для подсчета элементов
    public static void main(String[] args) {
        List<String> list = List.of("orange", "apple", "banana", "apple", "banana", "banana");
        Map<String, Integer> countList = new HashMap<>();
        list.forEach(el -> {
            countList.compute(el, (k, v) -> v == null ? 1 : v + 1);
        });
        System.out.println(countList);
        Map<String,Long> count = list.stream().collect(Collectors.groupingBy(el->el,Collectors.counting()));
        System.out.println(count);



    }
}
class CollectorsTest{
    private final List<Phones> listPhone =List.of(
            Phones.builder().model("15pro").name(Phone.IPHONE.getName()).price(52).build(),
            Phones.builder().model("15").name(Phone.IPHONE.getName()).price(52).build(),
            Phones.builder().model("15Mini").name(Phone.IPHONE.getName()).price(52).build(),
            Phones.builder().model("ZV1337").name(Phone.XIOMI.getName()).price(52).build()
    );

    @Test
    void checkGroupingBy(){
        Map<String, List<Phones>> collect = listPhone.stream().collect(Collectors.groupingBy(Phones::getName));
        for (Map.Entry<String, List<Phones>> el: collect.entrySet()){
            System.out.println(el.getKey());
           for (Phones phones:el.getValue()){
               System.out.println(phones.getModel());
           }
            System.out.println();
        }

    }
    @Test
    void checkPartitioningBy(){
        Map<Boolean, List<Phones>> iphone = listPhone.stream().collect(Collectors.partitioningBy(el ->el.getName().equals("xiomi")));
        List<Phones> list = iphone.get(true);
        System.out.println(list);
    }

}
enum Phone{
    IPHONE("iphone"),XIOMI("xiomi");
    private String name;

    Phone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
@Data
@AllArgsConstructor
@Builder
class Phones{
    private String name,model;
    private Integer price;

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price;
    }
}