package com.example.dnor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class DnorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DnorApplication.class, args);
	}

    @Service
    public static class NameService {
        public void addName(String name) {

        }
    }
}
