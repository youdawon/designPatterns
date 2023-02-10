package com.design.patterns.strategy.type;

import com.design.patterns.strategy.behaviour.fly.FlyWithWings;
import com.design.patterns.strategy.behaviour.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
