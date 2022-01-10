package ma.enset.pattern.adapter;

import ma.enset.aspects.SecuredByAspect;

public class AdapterImpl {
    @SecuredByAspect(roles={"USER"})
    public void generateCode1(){
        System.out.println("generatte code partie 1");
    }
    @SecuredByAspect(roles={"USER"})
    public void generateCode2(){
        System.out.println("generatte code partie 1");
    }
}
