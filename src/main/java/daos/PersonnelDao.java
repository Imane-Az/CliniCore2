package daos;

import java.util.List;
import java.util.Optional;

import entities.Personnel;
import entities.PersonnelRole;


public class PersonnelDao {
    
    private Long id;

    private String nom;
    private String prenom;
    private String email;
    private String password;

    private PersonnelRole role;

    public List<Personnel> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    public Optional<Personnel> findById(Long id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    public Personnel save(Personnel personnel) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    public void deleteById(Long id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
}
