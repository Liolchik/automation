package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

public interface TestConfig extends Config {

    TestConfig cfg = ConfigFactory.create(TestConfig.class);



    @DefaultValue("chrome")
    String browser();
}