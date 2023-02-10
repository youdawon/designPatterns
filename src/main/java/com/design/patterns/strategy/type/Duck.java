package com.design.patterns.strategy.type;

import com.design.patterns.strategy.behaviour.FlyBehaviour;
import com.design.patterns.strategy.behaviour.QuackBehaviour;
import com.design.patterns.strategy.behaviour.quack.Quack;
import lombok.NoArgsConstructor;
import lombok.Setter;

public abstract class Duck {

    FlyBehaviour flyBehaviour;

    QuackBehaviour quackBehaviour;

    public Duck() {
    }

    public abstract void display();

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.");
    }

    public void setFlyBehaviour(FlyBehaviour behaviour){
        this.flyBehaviour = behaviour;
    }

    public void setQuackBehaviour(QuackBehaviour behaviour){
        this.quackBehaviour = behaviour;
    }
}
