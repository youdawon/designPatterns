package com.design.patterns.strategy.behaviour.quack;

import com.design.patterns.strategy.behaviour.QuackBehaviour;

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
