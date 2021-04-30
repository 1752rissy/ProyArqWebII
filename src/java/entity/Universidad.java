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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author agutierrez752
 */
@Entity
@Table(name = "Universidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Universidad.findAll", query = "SELECT u FROM Universidad u"),
    @NamedQuery(name = "Universidad.findByIdUniversidad", query = "SELECT u FROM Universidad u WHERE u.idUniversidad = :idUniversidad"),
    @NamedQuery(name = "Universidad.findByNombreUniversidad", query = "SELECT u FROM Universidad u WHERE u.nombreUniversidad = :nombreUniversidad"),
    @NamedQuery(name = "Universidad.findByUbicacionUniversidad", query = "SELECT u FROM Universidad u WHERE u.ubicacionUniversidad = :ubicacionUniversidad")})
public class Universidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdUniversidad")
    private Integer idUniversidad;
    @Size(max = 150)
    @Column(name = "NombreUniversidad")
    private String nombreUniversidad;
    @Size(max = 100)
    @Column(name = "UbicacionUniversidad")
    private String ubicacionUniversidad;
    @OneToMany(mappedBy = "idUniversidad")
    private Collection<Vacante> vacanteCollection;
    @OneToMany(mappedBy = "idUniversidad")
    private Collection<Departamento> departamentoCollection;

    public Universidad() {
    }

    public Universidad(Integer idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    @XmlElement(name = "IdUniversidad")
    public Integer getIdUniversidad() {
        return idUniversidad;
    }

    public void setIdUniversidad(Integer idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    @XmlElement(name = "NombreUniversidad")
    public String getNombreUniversidad() {
        return nombreUniversidad;
    }


    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    @XmlElement(name = "UbicacionUniversidad")
    public String getUbicacionUniversidad() {
        return ubicacionUniversidad;
    }

    public void setUbicacionUniversidad(String ubicacionUniversidad) {
        this.ubicacionUniversidad = ubicacionUniversidad;
    }

    @XmlTransient
    public Collection<Vacante> getVacanteCollection() {
        return vacanteCollection;
    }

    public void setVacanteCollection(Collection<Vacante> vacanteCollection) {
        this.vacanteCollection = vacanteCollection;
    }

    @XmlTransient
    public Collection<Departamento> getDepartamentoCollection() {
        return departamentoCollection;
    }

    public void setDepartamentoCollection(Collection<Departamento> departamentoCollection) {
        this.departamentoCollection = departamentoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUniversidad != null ? idUniversidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Universidad)) {
            return false;
        }
        Universidad other = (Universidad) object;
        if ((this.idUniversidad == null && other.idUniversidad != null) || (this.idUniversidad != null && !this.idUniversidad.equals(other.idUniversidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Universidad[ idUniversidad=" + idUniversidad + " ]";
    }
    
}
