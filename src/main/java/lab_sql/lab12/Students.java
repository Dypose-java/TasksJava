package lab_sql.lab12;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Students {
    private String name;
    private float avgScore;

    public List<Students> mockData(){
        return List.of(Students.builder().name("User1").avgScore(4.6f).build(),
                Students.builder().name("User2").avgScore(2.3f).build(),
                Students.builder().name("User3").avgScore(5.0f).build(),
                Students.builder().name("User4").avgScore(4.0f).build(),
                Students.builder().name("User5").avgScore(3.0f).build(),
                Students.builder().name("User6").avgScore(4.55f).build(),
                Students.builder().name("User7").avgScore(3.51f).build());
    }
    public void getTaskNumberOne(){
        System.out.println("Task number 1");
        System.out.println("List student");
        List<Students>  list= new Students().mockData();
        list.stream().forEach(System.out::println);
        System.out.println("new list >=4 and sort");
        List<Students> list1 = list.stream().filter(el -> el.getAvgScore() >= 4.0f).sorted(Comparator.comparing(Students::getAvgScore)).toList();
        list1.stream().forEach(System.out::println);
    }

}
