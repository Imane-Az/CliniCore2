package services;

import java.util.List;

import entities.Reservation;

public interface ReservationService {
    List<Reservation> getAllReservations();
    Reservation getReservationById(Long id);
    Reservation createReservation(Reservation reservation);
    Reservation updateReservation(Long id, Reservation updatedReservation);
    void deleteReservation(Long id);
}
