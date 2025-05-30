package conf;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties",
        "classpath:conf/${runIn}.properties"
})
public interface Project extends Config {
    @Key("ui.url")
    String uiUrl();

    @Key("ui.browser")
    String browser();

    @Key("ui.browser.size")
    String size();

    @Key("ui.browser.timeOut")
    long timeOut();

    @Key("ui.pageLoadTimeout")
    long pageLoadTimeout();

    @Key("ui.headless")
    boolean headless();

    @Key("ui.browser.version")
    String version();

    @Key("ui.remote")
    String remote();

    @Key("api.url")
    String apiUrl();

    @DefaultValue("browser_local")//todo
    String runIn();

}
