package daos;

import java.util.List;
import java.util.Optional;

import entities.Medecin;

public class MedecinDao {
    
    private Long id;

    private String nom;
    private String prenom;
    private String email;
    private String password;
    private String specialite;
    public List<Medecin> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    public Optional<Medecin> findById(Long id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
    public static Medecin save(Medecin medecin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
    public boolean existsById(Long id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }
    public static void deleteById(Long id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
}
