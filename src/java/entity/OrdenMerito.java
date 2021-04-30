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
@Table(name = "OrdenMerito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdenMerito.findAll", query = "SELECT o FROM OrdenMerito o"),
    @NamedQuery(name = "OrdenMerito.findByIdOrdMerito", query = "SELECT o FROM OrdenMerito o WHERE o.idOrdMerito = :idOrdMerito"),
    @NamedQuery(name = "OrdenMerito.findByPuntajeOrdMerito", query = "SELECT o FROM OrdenMerito o WHERE o.puntajeOrdMerito = :puntajeOrdMerito")})
public class OrdenMerito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdOrdMerito")
    private Integer idOrdMerito;
    @Column(name = "puntajeOrdMerito")
    private Integer puntajeOrdMerito;
    @JoinColumn(name = "IdPostulante", referencedColumnName = "IdPostulante")
    @ManyToOne
    private Postulante idPostulante;

    public OrdenMerito() {
    }

    public OrdenMerito(Integer idOrdMerito) {
        this.idOrdMerito = idOrdMerito;
    }

    public Integer getIdOrdMerito() {
        return idOrdMerito;
    }

    public void setIdOrdMerito(Integer idOrdMerito) {
        this.idOrdMerito = idOrdMerito;
    }

    public Integer getPuntajeOrdMerito() {
        return puntajeOrdMerito;
    }

    public void setPuntajeOrdMerito(Integer puntajeOrdMerito) {
        this.puntajeOrdMerito = puntajeOrdMerito;
    }

    public Postulante getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(Postulante idPostulante) {
        this.idPostulante = idPostulante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrdMerito != null ? idOrdMerito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenMerito)) {
            return false;
        }
        OrdenMerito other = (OrdenMerito) object;
        if ((this.idOrdMerito == null && other.idOrdMerito != null) || (this.idOrdMerito != null && !this.idOrdMerito.equals(other.idOrdMerito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.OrdenMerito[ idOrdMerito=" + idOrdMerito + " ]";
    }
    
}
