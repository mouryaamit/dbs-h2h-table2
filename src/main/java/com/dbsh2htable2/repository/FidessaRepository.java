package com.dbsh2htable2.repository;

import entity.Fidessa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FidessaRepository extends CrudRepository<Fidessa,Long> {
    List<Fidessa> findDistinctByUniqueIdentifier(String uniqueIdentifier);
}
