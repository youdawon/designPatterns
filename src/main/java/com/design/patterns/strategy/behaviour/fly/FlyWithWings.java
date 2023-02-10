package com.design.patterns.strategy.behaviour.fly;

import com.design.patterns.strategy.behaviour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("날고 있어요");
    }
}
