package com.example.librairie.repository;

import com.example.librairie.model.Livre;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Livre,Integer> {
    @Query("select * from livre where titre_livre= :titreLivre")
    Livre findLivreByTitreLivre(String titreLivre);
@Query("select  * from livre where code_livre= :codeLivre")
Livre findLivreByCodeLivre(int codeLivre);

    @Modifying
    @Query("update livre set exemplaire_dispo= :exemplaireDispo where code_livre= :codeLivre")
    void retourLivre(int exemplaireDispo , int codeLivre);

}