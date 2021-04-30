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
import javax.persistence.Lob;
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
@Table(name = "Postulante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Postulante.findAll", query = "SELECT p FROM Postulante p"),
    @NamedQuery(name = "Postulante.findByIdPostulante", query = "SELECT p FROM Postulante p WHERE p.idPostulante = :idPostulante"),
    @NamedQuery(name = "Postulante.findByNombrePostulante", query = "SELECT p FROM Postulante p WHERE p.nombrePostulante = :nombrePostulante"),
    @NamedQuery(name = "Postulante.findByApellidoPostulante", query = "SELECT p FROM Postulante p WHERE p.apellidoPostulante = :apellidoPostulante"),
    @NamedQuery(name = "Postulante.findByDniPostulante", query = "SELECT p FROM Postulante p WHERE p.dniPostulante = :dniPostulante")})
public class Postulante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdPostulante")
    private Integer idPostulante;
    @Size(max = 80)
    @Column(name = "NombrePostulante")
    private String nombrePostulante;
    @Size(max = 80)
    @Column(name = "ApellidoPostulante")
    private String apellidoPostulante;
    @Size(max = 10)
    @Column(name = "DniPostulante")
    private String dniPostulante;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "CvPostulante")
    private String cvPostulante;
    @OneToMany(mappedBy = "idPostulante")
    private Collection<OrdenMerito> ordenMeritoCollection;
    @OneToMany(mappedBy = "idPostulante")
    private Collection<PostulanteVacante> postulanteVacanteCollection;

    public Postulante() {
    }

    public Postulante(Integer idPostulante) {
        this.idPostulante = idPostulante;
    }

    public Integer getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(Integer idPostulante) {
        this.idPostulante = idPostulante;
    }

    public String getNombrePostulante() {
        return nombrePostulante;
    }

    public void setNombrePostulante(String nombrePostulante) {
        this.nombrePostulante = nombrePostulante;
    }

    public String getApellidoPostulante() {
        return apellidoPostulante;
    }

    public void setApellidoPostulante(String apellidoPostulante) {
        this.apellidoPostulante = apellidoPostulante;
    }

    public String getDniPostulante() {
        return dniPostulante;
    }

    public void setDniPostulante(String dniPostulante) {
        this.dniPostulante = dniPostulante;
    }

    public String getCvPostulante() {
        return cvPostulante;
    }

    public void setCvPostulante(String cvPostulante) {
        this.cvPostulante = cvPostulante;
    }

    @XmlTransient
    public Collection<OrdenMerito> getOrdenMeritoCollection() {
        return ordenMeritoCollection;
    }

    public void setOrdenMeritoCollection(Collection<OrdenMerito> ordenMeritoCollection) {
        this.ordenMeritoCollection = ordenMeritoCollection;
    }

    @XmlTransient
    public Collection<PostulanteVacante> getPostulanteVacanteCollection() {
        return postulanteVacanteCollection;
    }

    public void setPostulanteVacanteCollection(Collection<PostulanteVacante> postulanteVacanteCollection) {
        this.postulanteVacanteCollection = postulanteVacanteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPostulante != null ? idPostulante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Postulante)) {
            return false;
        }
        Postulante other = (Postulante) object;
        if ((this.idPostulante == null && other.idPostulante != null) || (this.idPostulante != null && !this.idPostulante.equals(other.idPostulante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Postulante[ idPostulante=" + idPostulante + " ]";
    }
    
}
