package conf;

import org.aeonbits.owner.ConfigFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;


public class ProjectConf {
     static {//todo del
         System.setProperty("tag", System.getProperty("tag", "UI"));
         System.setProperty("runIn", System.getProperty("runIn", "browser_selenoid"));
     }

    public static final Project PROP = ConfigFactory.create(Project.class);
    private final Logger logger = LoggerFactory.getLogger(ProjectConf.class);

    static {

        String tag = System.getProperty("tag");
        if (tag == null || tag.isEmpty()) {
            throw new RuntimeException("tag must be specified (UI or API)");
        }


        String runIn = PROP.runIn();
        if (runIn == null || runIn.isEmpty()) {
            throw new RuntimeException("runIn must be specified in configuration");
        }


        if ("API".equals(tag)) {
            assertPropValue(PROP.apiUrl(), "apiUrl");
        } else if ("UI".equals(tag)) {
            assertPropValue(PROP.uiUrl(), "uiUrl");
            assertPropValue(PROP.browser(), "browser");

            if ("browser_selenoid".equals(runIn)) {
                assertPropValue(PROP.remote(), "remote");
                assertPropValue(PROP.version(), "version");
            }
        } else {
            throw new RuntimeException("Unsupported tag value: " + tag);
        }
    }

    public static void assertPropValue(String propValue, String nameProp) {
        assertThat(propValue).withFailMessage(nameProp + ": is empty or null").isNotEmpty().isNotNull();
    }
}





