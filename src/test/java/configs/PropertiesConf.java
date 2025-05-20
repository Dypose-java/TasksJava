package configs;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesConf {
    static Properties properties = new Properties();
     static public Properties readProp(String fileName){
        try(InputStream is=PropertiesConf.class.getClassLoader().getResourceAsStream("secretTg.properties")) {
            if (is==null)
                throw new RuntimeException("File not found in classpath");
            properties.load(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return  properties;
    }


}
