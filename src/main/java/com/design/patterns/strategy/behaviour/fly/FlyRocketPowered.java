package com.design.patterns.strategy.behaviour.fly;

import com.design.patterns.strategy.behaviour.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("로켓으로 날고 있어요");
    }
}
