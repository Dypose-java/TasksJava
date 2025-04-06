package code_me.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.stream.IntStream;

public class ConnectionData {
    //public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String DB = "Test";
    public static final String URL = "jdbc:postgresql://localhost/Test";
    public static final String USER = "postgres";
    public static final String PASSWORD = "dypose";
   static public Connection connection() throws SQLException {
        String url = "jdbc:postgresql://localhost/Test";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "dypose");
        Connection connection = DriverManager.getConnection(url, props);
        return connection;

    }

}
class test{
    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1,7).boxed().toList();
       // list.forEach();
        Iterator<Integer> iterator=list.iterator();
        //iterator.forEachRemaining(System.out::println);
        while (iterator.hasNext()){
            System.out.println(iterator.next());;
        }

    }
}

