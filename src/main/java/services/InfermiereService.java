package services;

import java.util.List;

import entities.Infermiere;

public interface InfermiereService {
    List<Infermiere> getAllInfirmieres();
    Infermiere getInfirmiereById(Long id);
    Infermiere createInfirmiere(Infermiere infermiere);
    Infermiere updateInfirmiere(Long id, Infermiere updatedInfermiere);
    void deleteInfirmiere(Long id);
}
