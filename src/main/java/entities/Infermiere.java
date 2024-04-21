package entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "infermieres")
public class Infermiere {
    @Id
    @GeneratedValue(generator="INFERMIERE-GENERATOR")
    @SequenceGenerator(
        name="INFERMIERE-GENERATOR",
        sequenceName = "INFERMIERE_ID_SEQ",
        allocationSize = 1
    )

    @Column(name = "infermiere_id")
    private Long id;

     @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String email;
    @Column
    private String password;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

 @OneToMany(mappedBy = "infermieres")
 private List<Reservation> reservations;
   
}
