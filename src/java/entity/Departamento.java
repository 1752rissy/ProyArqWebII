/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author agutierrez752
 */
@Entity
@Table(name = "Departamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departamento.findAll", query = "SELECT d FROM Departamento d"),
    @NamedQuery(name = "Departamento.findByIdDpto", query = "SELECT d FROM Departamento d WHERE d.idDpto = :idDpto"),
    @NamedQuery(name = "Departamento.findByNombreDpto", query = "SELECT d FROM Departamento d WHERE d.nombreDpto = :nombreDpto")})
public class Departamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdDpto")
    private Integer idDpto;
    @Size(max = 100)
    @Column(name = "NombreDpto")
    private String nombreDpto;
    @JoinColumn(name = "IdUniversidad", referencedColumnName = "IdUniversidad")
    @ManyToOne
    private Universidad idUniversidad;
    @OneToMany(mappedBy = "idDpto")
    private Collection<Catedra> catedraCollection;

    public Departamento() {
    }

    public Departamento(Integer idDpto) {
        this.idDpto = idDpto;
    }

    public Integer getIdDpto() {
        return idDpto;
    }

    public void setIdDpto(Integer idDpto) {
        this.idDpto = idDpto;
    }

    public String getNombreDpto() {
        return nombreDpto;
    }

    public void setNombreDpto(String nombreDpto) {
        this.nombreDpto = nombreDpto;
    }

    public Universidad getIdUniversidad() {
        return idUniversidad;
    }

    public void setIdUniversidad(Universidad idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    @XmlTransient
    public Collection<Catedra> getCatedraCollection() {
        return catedraCollection;
    }

    public void setCatedraCollection(Collection<Catedra> catedraCollection) {
        this.catedraCollection = catedraCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDpto != null ? idDpto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.idDpto == null && other.idDpto != null) || (this.idDpto != null && !this.idDpto.equals(other.idDpto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Departamento[ idDpto=" + idDpto + " ]";
    }
    
}
