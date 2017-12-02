package org.postgetman.designrest.controller;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {

    private Mapper mapper;

    @Autowired
    public void setMapper(Mapper mapper){
        this.mapper = mapper;
    }

    protected <T,R> R convert(T source, Class<R> resultClass) {
        return mapper.map(source,resultClass);
    }
}
