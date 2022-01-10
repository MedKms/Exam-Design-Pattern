package ma.enset;

import ma.enset.diagramme.Classe;
import ma.enset.diagramme.Entite;
import ma.enset.diagramme.GroupeClasses;
import ma.enset.pattern.observer.ObservableImpl;

public class Application {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        Classe classe1=new Classe("Test1",true,false,false,false);
        System.out.println(classe1);
        System.out.println("---------------------------");
        Classe classe2=new Classe("Test2",true,false,false,false);
        System.out.println(classe1);
        System.out.println("---------------------------");
        ObservableImpl observable=new ObservableImpl();
        observable.addObserver(classe1);
        observable.addObserver(classe2);
        observable.setAbstract(true);
        System.out.println(classe1);
        System.out.println(classe2);
        System.out.println("---------------------------");
    }
}
