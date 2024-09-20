package com.example.librairie.repository;

import com.example.librairie.model.Adherent;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface AdherentRepository extends CrudRepository<Adherent,Integer> {
    @Query("select * from adherent where codeAdherent= :codeAdherent")
    public Adherent findAdherentById(int codeAdherent);
}
