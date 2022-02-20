package com.example.dnor.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class NameDto implements Serializable {
    private final Integer id;
    private final String name;
}
