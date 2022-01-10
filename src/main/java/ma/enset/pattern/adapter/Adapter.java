package ma.enset.pattern.adapter;

import ma.enset.aspects.Lock;
import ma.enset.pattern.strategy.Strategy;

public class Adapter implements Strategy {
    private AdapterImpl adapterImpl=new AdapterImpl();

    @Override
    @Lock
    public void generateCode() {
        System.out.println("generatte from anciene Implementation");
        adapterImpl.generateCode1();
        adapterImpl.generateCode2();

    }
}
