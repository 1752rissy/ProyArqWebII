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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author agutierrez752
 */
@Entity
@Table(name = "PostulanteVacante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PostulanteVacante.findAll", query = "SELECT p FROM PostulanteVacante p"),
    @NamedQuery(name = "PostulanteVacante.findByIdPostulanteVacante", query = "SELECT p FROM PostulanteVacante p WHERE p.idPostulanteVacante = :idPostulanteVacante")})
public class PostulanteVacante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdPostulanteVacante")
    private Integer idPostulanteVacante;
    @JoinColumn(name = "IdPostulante", referencedColumnName = "IdPostulante")
    @ManyToOne
    private Postulante idPostulante;
    @JoinColumn(name = "IdVacante", referencedColumnName = "IdVacante")
    @ManyToOne
    private Vacante idVacante;

    public PostulanteVacante() {
    }

    public PostulanteVacante(Integer idPostulanteVacante) {
        this.idPostulanteVacante = idPostulanteVacante;
    }

    public Integer getIdPostulanteVacante() {
        return idPostulanteVacante;
    }

    public void setIdPostulanteVacante(Integer idPostulanteVacante) {
        this.idPostulanteVacante = idPostulanteVacante;
    }

    public Postulante getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(Postulante idPostulante) {
        this.idPostulante = idPostulante;
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
        hash += (idPostulanteVacante != null ? idPostulanteVacante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PostulanteVacante)) {
            return false;
        }
        PostulanteVacante other = (PostulanteVacante) object;
        if ((this.idPostulanteVacante == null && other.idPostulanteVacante != null) || (this.idPostulanteVacante != null && !this.idPostulanteVacante.equals(other.idPostulanteVacante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.PostulanteVacante[ idPostulanteVacante=" + idPostulanteVacante + " ]";
    }
    
}
