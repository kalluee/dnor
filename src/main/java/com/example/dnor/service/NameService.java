package com.example.dnor.service;

import com.example.dnor.domain.Name;
import com.example.dnor.domain.NameMapper;
import com.example.dnor.domain.NameRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NameService {
    @Resource
    private NameRepository nameRepository;

    @Resource
    private NameMapper nameMapper;

    public void addName(String name) {
        com.example.dnor.domain.Name newName = new com.example.dnor.domain.Name();
        newName.setName(name);
        nameRepository.save(newName);
    }

    public List<NameResponce> findAllNames() {
        List<Name> allNames = nameRepository.findAll();
        List<NameResponce> response = nameMapper.namesToNameDtos(allNames);
        return response;

    }
}
