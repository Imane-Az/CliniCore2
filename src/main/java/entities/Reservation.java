package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "reservations")
public class Reservation {
    
    @Id
    @GeneratedValue(generator="RESERVATION-GENERATOR")
    @SequenceGenerator(
        name="RESERVATION-GENERATOR",
        sequenceName = "RESERVATION_ID_SEQ",
        allocationSize = 1
    )

    @Column
    private Long id;

    @Column(name = "date_reservation")
    private Date dateReservation;


    @ManyToOne
    @JoinColumn(name = "mat_id")
    private Materiel materiel;

    @ManyToOne
    @JoinColumn(name = "infermiere_id")
    private Infermiere infermiere;

    public Object getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    public void setId(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }
}
