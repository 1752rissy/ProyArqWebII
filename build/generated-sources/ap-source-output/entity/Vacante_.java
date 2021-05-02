package entity;

import entity.Catedra;
import entity.PostulanteVacante;
import entity.Universidad;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-02T19:35:58")
@StaticMetamodel(Vacante.class)
public class Vacante_ { 

    public static volatile SingularAttribute<Vacante, String> descripcionVacante;
    public static volatile SingularAttribute<Vacante, Universidad> idUniversidad;
    public static volatile CollectionAttribute<Vacante, PostulanteVacante> postulanteVacanteCollection;
    public static volatile SingularAttribute<Vacante, Integer> idVacante;
    public static volatile CollectionAttribute<Vacante, Catedra> catedraCollection;

}