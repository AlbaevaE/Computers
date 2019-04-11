package com.example.demo.service;

import com.example.demo.model.Computers;
import com.example.demo.repository.ComputersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerServiceImp implements ComputerService {
    private final ComputersRepository computerRepository;

    public ComputerServiceImp(ComputersRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    @Override
    public List<Computers> findAllComputers() {
        return this.computerRepository.findAll();
    }

    @Override
    public Computers findComputerById(Long id) {
        return this.computerRepository.findById(id).get();
    }

    @Override
    public Computers saveComputer(Computers c) {
        return this.computerRepository.save(c);
    }

    @Override
    public void deleteComputerById(Long id) {
        this.computerRepository.deleteById(id);
    }
}
