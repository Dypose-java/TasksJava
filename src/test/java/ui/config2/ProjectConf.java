package ui.config2;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties",
        "classpath:configs/${runIn}.properties",
        "classpath:configs/local.properties"})//
public interface ProjectConf extends Config {
    @Key("browser")
    String browser();

    @Key("browser.version")
    String browserVersion();

    @Key("url")
    String url();

    @Key("run.mode")
    String runMode();

    @Key("headless")
    boolean headless();

    @Key("browser.size")
    String windowSize();

    @Key("browser.timeOut")
    long timeOut();

    @Key("remote")
    String remote();

    @Key("pageLoadTimeout")
    long pageLoadTimeout();

    @Key("holdBrowserOpen")
    boolean holdBrowserOpen();
}
