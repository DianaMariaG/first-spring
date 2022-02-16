package ro.fastrackit.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //ca sa devina Spring Bean
public class Car {
    private final Engine engine;

    @Autowired //ii zic lui Spring care constructor e pt el
    public Car(Engine engine){
        System.out.println("We build a car");
        this.engine = engine;
    }
    @Override
    public String toString(){
        return "This is my car" + engine;
    }
}
