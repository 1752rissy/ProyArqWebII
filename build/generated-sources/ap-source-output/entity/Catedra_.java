package entity;

import entity.Departamento;
import entity.Usuario;
import entity.Vacante;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-30T02:21:54")
@StaticMetamodel(Catedra.class)
public class Catedra_ { 

    public static volatile SingularAttribute<Catedra, String> nombreCatedra;
    public static volatile SingularAttribute<Catedra, Usuario> idUsuario;
    public static volatile SingularAttribute<Catedra, Integer> idCatedra;
    public static volatile SingularAttribute<Catedra, Departamento> idDpto;
    public static volatile SingularAttribute<Catedra, Vacante> idVacante;

}