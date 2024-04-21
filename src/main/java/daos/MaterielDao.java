package daos;

import java.util.List;
import java.util.Optional;

import entities.Materiel;
import entities.MaterielStatus;


public class MaterielDao {
      private Long id;

    private String nom;
    private String type;
    private String dateAchat;

    private MaterielStatus status;

    public List<Materiel> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    public Optional<Materiel> findById(Long id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    public Materiel save(Materiel materiel) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    public void deleteById(Long id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
}
