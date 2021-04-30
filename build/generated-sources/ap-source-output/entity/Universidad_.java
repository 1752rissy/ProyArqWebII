package entity;

import entity.Departamento;
import entity.Vacante;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-30T02:21:54")
@StaticMetamodel(Universidad.class)
public class Universidad_ { 

    public static volatile CollectionAttribute<Universidad, Departamento> departamentoCollection;
    public static volatile SingularAttribute<Universidad, Integer> idUniversidad;
    public static volatile CollectionAttribute<Universidad, Vacante> vacanteCollection;
    public static volatile SingularAttribute<Universidad, String> nombreUniversidad;
    public static volatile SingularAttribute<Universidad, String> ubicacionUniversidad;

}