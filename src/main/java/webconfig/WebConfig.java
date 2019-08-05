package webconfig;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;


/**
 * The interface Web config.
 */
public interface WebConfig extends Config {
    /**
     * Value BASE_CONFIG.
     */
    WebConfig BASE_CONFIG = ConfigFactory.create(WebConfig.class, System.getenv(), System.getProperties());

    /**
     * Value service.url.
     *
     * @return url. url
     */
    @Key("service.url")
    String getUrl();
}
