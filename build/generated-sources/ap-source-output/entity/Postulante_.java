package entity;

import entity.OrdenMerito;
import entity.PostulanteVacante;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-02T19:35:58")
@StaticMetamodel(Postulante.class)
public class Postulante_ { 

    public static volatile SingularAttribute<Postulante, String> nombrePostulante;
    public static volatile SingularAttribute<Postulante, String> apellidoPostulante;
    public static volatile SingularAttribute<Postulante, Integer> idPostulante;
    public static volatile SingularAttribute<Postulante, String> dniPostulante;
    public static volatile SingularAttribute<Postulante, String> cvPostulante;
    public static volatile CollectionAttribute<Postulante, PostulanteVacante> postulanteVacanteCollection;
    public static volatile CollectionAttribute<Postulante, OrdenMerito> ordenMeritoCollection;

}