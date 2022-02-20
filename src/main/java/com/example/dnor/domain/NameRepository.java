package com.example.dnor.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NameRepository extends JpaRepository<Name, Integer> {

    @Query("select n from Name n order by n.name ASC")
    List<Name> findAllSortedAsc();

    @Query("select n from Name n order by n.name DESC")
    List<Name> findAllSortedDesc();

    @Query("select n from Name n where upper(n.name) like upper(concat('%', ?1, '%')) order by n.name")
    List<Name> findByNameContainsParamAsc(String name);

    @Query("select n from Name n where upper(n.name) like upper(concat('%', ?1, '%')) order by n.name DESC")
    List<Name> findByNameContainsParamDesc(String name);

}