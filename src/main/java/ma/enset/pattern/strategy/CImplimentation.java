package ma.enset.pattern.strategy;

import ma.enset.aspects.SecuredByAspect;

public class CImplimentation implements Strategy {
    @Override
    @SecuredByAspect(roles={"USER"})
    public void generateCode() {
        System.out.println("generatte from C");
    }
}
