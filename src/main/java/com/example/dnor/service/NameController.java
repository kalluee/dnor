package com.example.dnor.service;

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

    @GetMapping("/get/all")
    public List<NameResponce> findAllNames() {
        List<NameResponce> responses = nameService.findAllNames();
        return responses;
    }

    @GetMapping("/get/all/sorted/asc")
    public List<NameResponce> findAllSortedAsc() {
        List<NameResponce> responses = nameService.findAllSortedAsc();
        return responses;
    }

    @GetMapping("/get/all/sorted/desc")
    public List<NameResponce> findAllSortedDesc() {
        List<NameResponce> responses = nameService.findAllSortedDesc();
        return responses;
    }

    @GetMapping("/get/all/by/param/sorted/asc")
    public List<NameResponce> findAllByParamSortedAsc(@RequestParam String request) {
        List<NameResponce> responses = nameService.findAllByParamSortedAsc(request);
        return responses;
    }

    @GetMapping("/get/all/by/param/sorted/desc")
    public List<NameResponce> findAllByParamSortedDesc(@RequestParam String request) {
        List<NameResponce> responses = nameService.findAllByParamSortedDesc(request);
        return responses;
    }
}