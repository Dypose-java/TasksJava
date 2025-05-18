package ui.config2;

import org.aeonbits.owner.ConfigFactory;


public class Project {
    public static final ProjectConf PROJECT_CONF = ConfigFactory.create(ProjectConf.class);


    static {

        if (PROJECT_CONF.runMode().isEmpty()){
            throw new RuntimeException("tag runIn is Empty");
        } else if (PROJECT_CONF.runMode()==null) {
            throw new RuntimeException("tag runIn is null");
        }
    }

}

