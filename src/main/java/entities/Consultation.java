package entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.SequenceGenerator;



@Entity
@Table(name = "consultations")
public class Consultation {
      @Id
    @GeneratedValue(generator="CONSULTATION-GENERATOR")   
    @SequenceGenerator(
        name="CONSULTATION-GENERATOR",
        sequenceName = "CONSULTATION_ID_SEQ",
        allocationSize = 1
    )

    @Column(name = "consultation_id")
    private Long id;

    @Column(name = "date_consultation")
    private Date dateConsultation;

    @ManyToOne
    @JoinColumn(name="patient_id")
    private Patient patients;

    @ManyToOne
    @JoinColumn(name = "medecin_id")
    private Medecin medecins;

    @ManyToOne
    @JoinColumn(name = "salle_id")
    private Salle salles;

    public Object getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    public void setId(Object id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }
}
