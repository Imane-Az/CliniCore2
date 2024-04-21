package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import entities.Personnel;
import services.PersonnelService;

import java.util.List;

@RestController
@RequestMapping("/api/personnel")
public class PersonnelController {

    @Autowired
    private PersonnelService personnelService;

    @GetMapping("/")
    public ResponseEntity<List<Personnel>> getAllPersonnel() {
        List<Personnel> personnelList = personnelService.getAllPersonnel();
        return new ResponseEntity<>(personnelList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Personnel> getPersonnelById(@PathVariable Long id) {
        Personnel personnel = personnelService.getPersonnelById(id);
        return new ResponseEntity<>(personnel, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Personnel> createPersonnel(@RequestBody Personnel personnel) {
        Personnel createdPersonnel = personnelService.createPersonnel(personnel);
        return new ResponseEntity<>(createdPersonnel, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Personnel> updatePersonnel(@PathVariable Long id, @RequestBody Personnel updatedPersonnel) {
        Personnel personnel = personnelService.updatePersonnel(id, updatedPersonnel);
        if (personnel != null) {
            return new ResponseEntity<>(personnel, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersonnel(@PathVariable Long id) {
        personnelService.deletePersonnel(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
