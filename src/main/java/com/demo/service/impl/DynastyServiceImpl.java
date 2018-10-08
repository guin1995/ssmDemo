package com.demo.service.impl;

import com.demo.dao.DynastyMapper;
import com.demo.pojo.Dynasty;
import com.demo.service.DynastyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DynastyServiceImpl implements DynastyService {

    @Autowired
    private DynastyMapper dynastyMapper;

    @Override
    public Dynasty getById(Long id) {
        return dynastyMapper.getById(id);
    }
}
