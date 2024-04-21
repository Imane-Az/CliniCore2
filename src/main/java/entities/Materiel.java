package entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

@Entity
@Table(name = "materiels")
public class Materiel {
    @Id
     @GeneratedValue(generator="MATERIEL-GENERATOR")
     @SequenceGenerator(
        name="MATERIEL-GENERATOR",
        sequenceName = "MATERIEL_ID_SEQ",
        allocationSize = 1
    )

    @Column(name = "mat_id")
    private Long id;
    @Column
    private String nom;
    @Column
    private String type;
    @Column
    private String dateAchat;

    @Enumerated(EnumType.STRING)
    private MaterielStatus status;


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

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDateAchat() {
        return this.dateAchat;
    }

    public void setDateAchat(String dateAchat) {
        this.dateAchat = dateAchat;
    }

    public MaterielStatus getStatus() {
        return this.status;
    }

    public void setStatus(MaterielStatus status) {
        this.status = status;
    }
   
    @OneToMany(mappedBy = "materiels")
    private List<Reservation> reservations;
   
}
