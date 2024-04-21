package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import entities.Materiel;
import services.MaterielService;

import java.util.List;

@RestController
@RequestMapping("/api/materiels")
public class MaterielController {

    @Autowired
    private MaterielService materielService;

    @GetMapping("/")
    public ResponseEntity<List<Materiel>> getAllMateriels() {
        List<Materiel> materiels = materielService.getAllMateriels();
        return new ResponseEntity<>(materiels, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Materiel> getMaterielById(@PathVariable Long id) {
        Materiel materiel = materielService.getMaterielById(id);
        return new ResponseEntity<>(materiel, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Materiel> createMateriel(@RequestBody Materiel materiel) {
        Materiel createdMateriel = materielService.createMateriel(materiel);
        return new ResponseEntity<>(createdMateriel, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Materiel> updateMateriel(@PathVariable Long id, @RequestBody Materiel updatedMateriel) {
        Materiel materiel = materielService.updateMateriel(id, updatedMateriel);
        if (materiel != null) {
            return new ResponseEntity<>(materiel, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMateriel(@PathVariable Long id) {
        materielService.deleteMateriel(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
