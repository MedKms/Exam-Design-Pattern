package ma.enset.pattern.observer;

import ma.enset.aspects.Log;
import ma.enset.aspects.SecuredByAspect;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private boolean ispublic;
    private boolean isAbstract;
    private boolean isStatic;
    private boolean isFinal;
    private List<Observer> listObservers=new ArrayList<>();
    @Override
    @SecuredByAspect(roles={"ADMIN"})
    public void addObserver(Observer observer) {
        listObservers.add(observer);
    }

    @Override
    @SecuredByAspect(roles={"ADMIN"})
    public void removeObserver(Observer observer) {
        listObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:listObservers){
            observer.update(this);
        }
    }
    @Log
    public boolean isIspublic() {
        return ispublic;
    }

    @Log
    public void setIspublic(boolean ispublic) {
        this.ispublic = ispublic;
        notifyObserver();
    }

    public boolean isAbstract() {
        return isAbstract;
    }

    public void setAbstract(boolean anAbstract) {
        isAbstract = anAbstract;
        notifyObserver();
    }

    public boolean isStatic() {
        return isStatic;
    }

    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
        notifyObserver();
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
        notifyObserver();
    }
}
