package com.dbsh2htable2.repository;


import com.dbsh2htable2.entity.Fidessa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FidessaRepository extends CrudRepository<Fidessa,Long> {
    List<Fidessa> findDistinctByTradeId(String tradeId);
}
