package hello.world.configurations;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("hello")
public class HelloConfiguration {

    private String stem;

    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem;
    }
}
