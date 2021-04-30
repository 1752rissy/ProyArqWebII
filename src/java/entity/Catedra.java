/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author agutierrez752
 */
@Entity
@Table(name = "Catedra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Catedra.findAll", query = "SELECT c FROM Catedra c"),
    @NamedQuery(name = "Catedra.findByIdCatedra", query = "SELECT c FROM Catedra c WHERE c.idCatedra = :idCatedra"),
    @NamedQuery(name = "Catedra.findByNombreCatedra", query = "SELECT c FROM Catedra c WHERE c.nombreCatedra = :nombreCatedra")})
public class Catedra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdCatedra")
    private Integer idCatedra;
    @Size(max = 100)
    @Column(name = "NombreCatedra")
    private String nombreCatedra;
    @JoinColumn(name = "IdDpto", referencedColumnName = "IdDpto")
    @ManyToOne
    private Departamento idDpto;
    @JoinColumn(name = "IdUsuario", referencedColumnName = "IdUsuario")
    @ManyToOne
    private Usuario idUsuario;
    @JoinColumn(name = "IdVacante", referencedColumnName = "IdVacante")
    @ManyToOne
    private Vacante idVacante;

    public Catedra() {
    }

    public Catedra(Integer idCatedra) {
        this.idCatedra = idCatedra;
    }

    public Integer getIdCatedra() {
        return idCatedra;
    }

    public void setIdCatedra(Integer idCatedra) {
        this.idCatedra = idCatedra;
    }

    public String getNombreCatedra() {
        return nombreCatedra;
    }

    public void setNombreCatedra(String nombreCatedra) {
        this.nombreCatedra = nombreCatedra;
    }

    public Departamento getIdDpto() {
        return idDpto;
    }

    public void setIdDpto(Departamento idDpto) {
        this.idDpto = idDpto;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Vacante getIdVacante() {
        return idVacante;
    }

    public void setIdVacante(Vacante idVacante) {
        this.idVacante = idVacante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatedra != null ? idCatedra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catedra)) {
            return false;
        }
        Catedra other = (Catedra) object;
        if ((this.idCatedra == null && other.idCatedra != null) || (this.idCatedra != null && !this.idCatedra.equals(other.idCatedra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Catedra[ idCatedra=" + idCatedra + " ]";
    }
    
}
