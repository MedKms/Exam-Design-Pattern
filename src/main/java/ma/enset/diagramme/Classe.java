package ma.enset.diagramme;

import ma.enset.pattern.observer.ObservableImpl;
import ma.enset.pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Classe extends Entite implements Observer {
   private boolean ispublic;
   private boolean isAbstract;
   private boolean isStatic;
   int level;
   private boolean isFinal;
   private List<Attribute> attributesList=new ArrayList<>();
   private List<Methode> methodesList=new ArrayList<>();

   public Classe(String nom,boolean ispublic, boolean isAbstract, boolean isStatic, boolean isFinal) {
      this.nom=nom;
      this.ispublic = ispublic;
      this.isAbstract = isAbstract;
      this.isStatic = isStatic;
      this.isFinal = isFinal;
   }

   @Override
   public void update(ObservableImpl observable) {
      this.nom=observable.getNom();
      this.ispublic=observable.isIspublic();
      this.isAbstract=observable.isAbstract();
      this.isFinal=observable.isFinal();
      this.isStatic=observable.isStatic();
   }

   @Override
   public String toString() {
      return "Classe{" +
              "ispublic=" + ispublic +
              ", isAbstract=" + isAbstract +
              ", isStatic=" + isStatic +
              ", level=" + level +
              ", isFinal=" + isFinal +
              ", attributesList=" + attributesList +
              ", methodesList=" + methodesList +
              '}';
   }
}
