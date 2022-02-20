package com.example.dnor.service;

import com.example.dnor.domain.NameDto;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/name")
public class NameController {

    @Resource
    private NameService nameService;

    @PostMapping("/add")
    public void addName(@RequestParam String name) {
        nameService.addName(name);
    }

    @GetMapping("/get/all/name")
    public List<NameResponce> findAllNames() {
        List<NameResponce> responses = nameService.findAllNames();
        return responses;
    }


}
