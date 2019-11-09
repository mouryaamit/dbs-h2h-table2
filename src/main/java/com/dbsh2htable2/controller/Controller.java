package com.dbsh2htable2.controller;

import com.dbsh2htable2.entity.Extern;
import com.dbsh2htable2.entity.Fidessa;
import com.dbsh2htable2.service.ExternService;
import com.dbsh2htable2.service.FidessaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    public FidessaService fidessaService;

    @Autowired
    public ExternService externService;

    @GetMapping(value = "/fidessa")
    public ResponseEntity<List<Fidessa>> getFidessaData(){
        Iterable<Fidessa> iterator=fidessaService.getAllFidessa();
        List<Fidessa> list=new ArrayList<Fidessa>();
        iterator.forEach(e->list.add(e));
        return new ResponseEntity<List<Fidessa>>(list, HttpStatus.OK);
    }

    @GetMapping(value = "/extern")
    public ResponseEntity<List<Extern>> getExternData(){
        Iterable<Extern> iterator=externService.getAllExtern();
        List<Extern> list=new ArrayList<Extern>();
        iterator.forEach(e->list.add(e));
        return new ResponseEntity<List<Extern>>(list, HttpStatus.OK);
    }
}
