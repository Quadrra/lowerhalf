/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ictartistdatabase;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author mrsal
 */
@Embeddable
public class ArtistdatabasePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ARTIST")
    private String artist;
    @Basic(optional = false)
    @Column(name = "SECTION")
    private String section;
    @Basic(optional = false)
    @Column(name = "SOCIAL")
    private String social;

    public ArtistdatabasePK() {
    }

    public ArtistdatabasePK(String artist, String section, String social) {
        this.artist = artist;
        this.section = section;
        this.social = social;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (artist != null ? artist.hashCode() : 0);
        hash += (section != null ? section.hashCode() : 0);
        hash += (social != null ? social.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArtistdatabasePK)) {
            return false;
        }
        ArtistdatabasePK other = (ArtistdatabasePK) object;
        if ((this.artist == null && other.artist != null) || (this.artist != null && !this.artist.equals(other.artist))) {
            return false;
        }
        if ((this.section == null && other.section != null) || (this.section != null && !this.section.equals(other.section))) {
            return false;
        }
        if ((this.social == null && other.social != null) || (this.social != null && !this.social.equals(other.social))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ictartistdatabase.ArtistdatabasePK[ artist=" + artist + ", section=" + section + ", social=" + social + " ]";
    }
    
}
