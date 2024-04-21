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
@Table(name = "patients")
public class Patient {
    @Id
 
     @GeneratedValue(generator="PATIENT-GENERATOR")
     @SequenceGenerator(
        name="PATIENT-GENERATOR",
        sequenceName = "PATIENT_ID_SEQ",
        allocationSize = 1
    )

    @Column(name="patient_id")
    private Long id;

     @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String dateNaissance;
    @Column
    private String maladie;

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

    public String getDateNaissance() {
        return this.dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getMaladie() {
        return this.maladie;
    }

    public void setMaladie(String maladie) {
        this.maladie = maladie;
    }

    
    @OneToMany(mappedBy = "patients")
    private List<Consultation> consultations;
}
