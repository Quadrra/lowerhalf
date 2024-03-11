/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ictartistdatabase;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author mrsal
 */
@Entity
@Table(name = "ARTISTDATABASE", catalog = "", schema = "ARTISTDATABASE")
@NamedQueries({
    @NamedQuery(name = "Artistdatabase.findAll", query = "SELECT a FROM Artistdatabase a")
    , @NamedQuery(name = "Artistdatabase.findByArtist", query = "SELECT a FROM Artistdatabase a WHERE a.artistdatabasePK.artist = :artist")
    , @NamedQuery(name = "Artistdatabase.findBySection", query = "SELECT a FROM Artistdatabase a WHERE a.artistdatabasePK.section = :section")
    , @NamedQuery(name = "Artistdatabase.findBySocial", query = "SELECT a FROM Artistdatabase a WHERE a.artistdatabasePK.social = :social")})
public class Artistdatabase implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArtistdatabasePK artistdatabasePK;

    public Artistdatabase() {
    }

    public Artistdatabase(ArtistdatabasePK artistdatabasePK) {
        this.artistdatabasePK = artistdatabasePK;
    }

    public Artistdatabase(String artist, String section, String social) {
        this.artistdatabasePK = new ArtistdatabasePK(artist, section, social);
    }

    public ArtistdatabasePK getArtistdatabasePK() {
        return artistdatabasePK;
    }

    public void setArtistdatabasePK(ArtistdatabasePK artistdatabasePK) {
        this.artistdatabasePK = artistdatabasePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (artistdatabasePK != null ? artistdatabasePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Artistdatabase)) {
            return false;
        }
        Artistdatabase other = (Artistdatabase) object;
        if ((this.artistdatabasePK == null && other.artistdatabasePK != null) || (this.artistdatabasePK != null && !this.artistdatabasePK.equals(other.artistdatabasePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ictartistdatabase.Artistdatabase[ artistdatabasePK=" + artistdatabasePK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
