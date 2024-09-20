package com.example.librairie.repository;

import com.example.librairie.model.Emprunt;
import com.example.librairie.model.Livre;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface EmpruntRepository extends CrudRepository<Emprunt,Integer> {
    @Query("select * from emprunt where code_emprunt= :id")
    Emprunt findEmpruntById(int id);
    @Modifying
    @Query("update emprunt set date_retour_effective= :dateRetourEffective where code_emprunt= :id")
    void updateEmprunt(Date dateRetourEffective , int id);


}
