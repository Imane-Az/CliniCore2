package services.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daos.ReservationDao;
import entities.Reservation;
import services.ReservationService;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationDao reservationDAO;

    @Override
    public List<Reservation> getAllReservations() {
        return reservationDAO.findAll();
    }

    @Override
    public Reservation getReservationById(Long id) {
        Optional<Reservation> reservation = reservationDAO.findById(id);
        return reservation.orElse(null);
    }

    @Override
    public Reservation createReservation(Reservation reservation) {
        return reservationDAO.save(reservation);
    }

    @Override
    public Reservation updateReservation(Long id, Reservation updatedReservation) {
        return reservationDAO.findById(id)
                .map(existingReservation -> {
                    updatedReservation.setId(existingReservation.getId());
                    return reservationDAO.save(updatedReservation);
                })
                .orElseGet(() -> {
                    updatedReservation.setId(id);
                    return reservationDAO.save(updatedReservation);
                });
    }

    @Override
    public void deleteReservation(Long id) {
        reservationDAO.deleteById(id);
    }
}
