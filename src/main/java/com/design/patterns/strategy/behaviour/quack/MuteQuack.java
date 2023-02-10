package com.design.patterns.strategy.behaviour.quack;

import com.design.patterns.strategy.behaviour.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("<< 조용 >>");
    }
}
