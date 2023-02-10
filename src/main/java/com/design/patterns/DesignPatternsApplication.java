package com.design.patterns;

import com.design.patterns.strategy.behaviour.fly.FlyRocketPowered;
import com.design.patterns.strategy.behaviour.quack.MuteQuack;
import com.design.patterns.strategy.type.MallardDuck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.setFlyBehaviour(new FlyRocketPowered());
        mallardDuck.setQuackBehaviour(new MuteQuack());
        mallardDuck.performQuack();
        mallardDuck.performFly();
    }
}
