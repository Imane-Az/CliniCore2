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
@Table(name = "salles")

public class Salle {
    @Id
 
     @GeneratedValue(generator="SALLE-GENERATOR")
     @SequenceGenerator(
        name="SALLE-GENERATOR",
        sequenceName = "SALLE_ID_SEQ",
        allocationSize = 1
    )

    @Column(name = "salle_id")
    private Long id;
    
    @Column
    private String nomS;

    @Column
    private String type;

    @Enumerated(EnumType.STRING)
    private SalleEtat etat;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomS() {
        return this.nomS;
    }

    public void setNomS(String nomS) {
        this.nomS = nomS;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SalleEtat getEtat() {
        return this.etat;
    }

    public void setEtat(SalleEtat etat) {
        this.etat = etat;
    }
    
     @OneToMany(mappedBy = "salles")
    private List<Consultation> consultations;

   

}
