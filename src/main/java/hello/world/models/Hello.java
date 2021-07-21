package hello.world.models;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Hello {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
