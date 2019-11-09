package com.dbsh2htable2.service;


import com.dbsh2htable2.entity.Extern;
import org.springframework.stereotype.Service;

@Service
public interface ExternService {
    Iterable<Extern> getAllExtern();
}
