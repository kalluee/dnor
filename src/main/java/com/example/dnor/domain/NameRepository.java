package com.example.dnor.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NameRepository extends JpaRepository<Name, Integer> {

    @Query("select n from Name n where upper(n.name) like upper(?1)")
    List<Name> findByNameIsLike(String request);

}