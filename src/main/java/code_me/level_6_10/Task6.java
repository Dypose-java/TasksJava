package code_me.level_6_10;

import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class Task6 {
    /**
     * Дан массив с числами:
     * {1, 2, 3, 3, 4, 5}
     * Проверьте, что в этом массиве есть два одинаковых элемента подряд.
     */
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,7,4,5);
        boolean bool=IntStream.range(0,list.size()-1).anyMatch(i->Objects.equals(list.get(i),list.get(i+1)));
        System.out.println(bool);

    }

    }


