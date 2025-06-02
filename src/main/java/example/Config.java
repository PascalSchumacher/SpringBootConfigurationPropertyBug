package example;

import java.util.Objects;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties({Config.MyProperties.class})
public class Config {

    @ConfigurationProperties("test")
    public record MyProperties(String valueName) {

        public MyProperties(String valueName) {
            this.valueName = Objects.requireNonNull(valueName);
        }
    }
}
