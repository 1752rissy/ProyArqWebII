package entity;

import entity.Catedra;
import entity.Universidad;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-30T02:21:54")
@StaticMetamodel(Departamento.class)
public class Departamento_ { 

    public static volatile SingularAttribute<Departamento, Universidad> idUniversidad;
    public static volatile SingularAttribute<Departamento, String> nombreDpto;
    public static volatile SingularAttribute<Departamento, Integer> idDpto;
    public static volatile CollectionAttribute<Departamento, Catedra> catedraCollection;

}