package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

@Entity
@Table(name = "personnels")
public class Personnel {
    @Id
    
     @GeneratedValue(generator="PERSONNEL-GENERATOR")
     @SequenceGenerator(
        name="PERSONNEL-GENERATOR",
        sequenceName = "PERSONNEL_ID_SEQ",
        allocationSize = 1
    )

    @Column(name = "perso_id")
    private Long id;

     @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String email;
    @Column
    private String password;

    @Enumerated(EnumType.STRING)
    private PersonnelRole role;


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

    public PersonnelRole getRole() {
        return this.role;
    }

    public void setRole(PersonnelRole role) {
        this.role = role;
    }


}
