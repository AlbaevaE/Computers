package com.example.demo.service;

import com.example.demo.model.Computers;

import java.util.List;

public interface ComputerService {
    List<Computers> findAllComputers();

    Computers findComputerById(Long id);

    Computers saveComputer(Computers c);
}
