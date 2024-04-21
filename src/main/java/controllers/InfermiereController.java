package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import entities.Infermiere;
import services.InfermiereService;

import java.util.List;

@RestController
@RequestMapping("/api/infirmieres")
public class InfermiereController {

    @Autowired
    private InfermiereService infermiereService;

    @GetMapping("/")
    public ResponseEntity<List<Infermiere>> getAllInfirmieres() {
        List<Infermiere> infermieres = infermiereService.getAllInfirmieres();
        return new ResponseEntity<>(infermieres, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Infermiere> getInfirmiereById(@PathVariable Long id) {
        Infermiere infermiere = infermiereService.getInfirmiereById(id);
        return new ResponseEntity<>(infermiere, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Infermiere> createInfirmiere(@RequestBody Infermiere infermiere) {
        Infermiere createdInfermiere = infermiereService.createInfirmiere(infermiere);
        return new ResponseEntity<>(createdInfermiere, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Infermiere> updateInfirmiere(@PathVariable Long id, @RequestBody Infermiere updatedInfermiere) {
        Infermiere infermiere = infermiereService.updateInfirmiere(id, updatedInfermiere);
        if (infermiere != null) {
            return new ResponseEntity<>(infermiere, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInfirmiere(@PathVariable Long id) {
        infermiereService.deleteInfirmiere(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
