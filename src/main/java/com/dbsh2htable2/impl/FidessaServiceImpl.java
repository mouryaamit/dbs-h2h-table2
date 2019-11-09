package com.dbsh2htable2.impl;

import com.dbsh2htable2.entity.Fidessa;
import com.dbsh2htable2.repository.FidessaRepository;
import com.dbsh2htable2.service.FidessaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FidessaServiceImpl implements FidessaService {


    @Autowired
    private FidessaRepository fidessaRepository;

    @Override
    public Iterable<Fidessa> getAllFidessa() {
        Iterable<Fidessa> fidessaIterator=fidessaRepository.findAll();
        return fidessaIterator;
    }

}
