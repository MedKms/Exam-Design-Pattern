package ma.enset.diagramme;

import java.util.ArrayList;
import java.util.List;

public class GroupeClasses extends Classe{
    private List<Classe> classesList=new ArrayList<>();

    public GroupeClasses(String nom, boolean ispublic, boolean isAbstract, boolean isStatic, boolean isFinal) {
        super(nom, ispublic, isAbstract, isStatic, isFinal);
    }


    public Classe addClasse(Classe classe){
        classe.level=this.level+1;
        classesList.add(classe);
        return classe;
    }
}
