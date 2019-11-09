package com.dbsh2htable2.impl;

import com.dbsh2htable2.entity.Extern;
import com.dbsh2htable2.repository.ExternRepository;
import com.dbsh2htable2.service.ExternService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExternServiceImpl implements ExternService {

@Autowired
private ExternRepository externRepository;

    @Override
    public Iterable<Extern> getAllExtern() {
        Iterable<Extern> externIterator=externRepository.findAll();
        return externIterator;
    }
}
