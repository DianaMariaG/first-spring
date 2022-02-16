package ro.fastrackit.first;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public Engine() {
        System.out.println("Building engine");
    }

    @Override
    public String toString() {
        return "car engine";
    }
}
