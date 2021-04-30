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
@Table(name = "Vacante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vacante.findAll", query = "SELECT v FROM Vacante v"),
    @NamedQuery(name = "Vacante.findByIdVacante", query = "SELECT v FROM Vacante v WHERE v.idVacante = :idVacante"),
    @NamedQuery(name = "Vacante.findByDescripcionVacante", query = "SELECT v FROM Vacante v WHERE v.descripcionVacante = :descripcionVacante")})
public class Vacante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdVacante")
    private Integer idVacante;
    @Size(max = 250)
    @Column(name = "DescripcionVacante")
    private String descripcionVacante;
    @OneToMany(mappedBy = "idVacante")
    private Collection<PostulanteVacante> postulanteVacanteCollection;
    @JoinColumn(name = "IdUniversidad", referencedColumnName = "IdUniversidad")
    @ManyToOne
    private Universidad idUniversidad;
    @OneToMany(mappedBy = "idVacante")
    private Collection<Catedra> catedraCollection;

    public Vacante() {
    }

    public Vacante(Integer idVacante) {
        this.idVacante = idVacante;
    }

    public Integer getIdVacante() {
        return idVacante;
    }

    public void setIdVacante(Integer idVacante) {
        this.idVacante = idVacante;
    }

    public String getDescripcionVacante() {
        return descripcionVacante;
    }

    public void setDescripcionVacante(String descripcionVacante) {
        this.descripcionVacante = descripcionVacante;
    }

    @XmlTransient
    public Collection<PostulanteVacante> getPostulanteVacanteCollection() {
        return postulanteVacanteCollection;
    }

    public void setPostulanteVacanteCollection(Collection<PostulanteVacante> postulanteVacanteCollection) {
        this.postulanteVacanteCollection = postulanteVacanteCollection;
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
        hash += (idVacante != null ? idVacante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vacante)) {
            return false;
        }
        Vacante other = (Vacante) object;
        if ((this.idVacante == null && other.idVacante != null) || (this.idVacante != null && !this.idVacante.equals(other.idVacante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Vacante[ idVacante=" + idVacante + " ]";
    }
    
}
