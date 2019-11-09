package com.dbsh2htable2.repository;

import entity.Extern;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import java.util.List;

@Repository
public interface ExternRepository extends CrudRepository<Extern,Long> {
    List<Extern> findDistinctByUniqueIdentifier(String uniqueIdentifier);

}
