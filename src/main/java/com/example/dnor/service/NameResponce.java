package com.example.dnor.service;

import lombok.Data;

import java.io.Serializable;

@Data
public class NameResponce implements Serializable {
    private final Integer id;
    private final String name;
}
