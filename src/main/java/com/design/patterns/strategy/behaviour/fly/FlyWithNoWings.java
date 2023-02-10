package com.design.patterns.strategy.behaviour.fly;

import com.design.patterns.strategy.behaviour.FlyBehaviour;

public class FlyWithNoWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("못 날아요");
    }
}
