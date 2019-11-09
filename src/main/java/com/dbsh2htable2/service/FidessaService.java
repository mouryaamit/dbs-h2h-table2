package com.dbsh2htable2.service;


import com.dbsh2htable2.entity.Fidessa;
import org.springframework.stereotype.Service;

@Service
public interface FidessaService {
    Iterable<Fidessa> getAllFidessa();
}



