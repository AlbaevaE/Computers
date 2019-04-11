package com.example.demo.controller;

import com.example.demo.model.Computers;
import com.example.demo.service.ComputerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ComputerController.URL_COMPUTERS)
public class ComputerController {
    public static final String URL_COMPUTERS = "/api/v1/computers";

    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @GetMapping
    public List<Computers> getComputers() {

        return this.computerService.findAllComputers();

    }

    @GetMapping("/{id}")
    public Computers getComputersById(@PathVariable Long id) {
        return this.computerService.findComputerById(id);
    }

    @PostMapping
    public Computers saveComputers(@RequestBody Computers c) {
        return this.computerService.saveComputer(c);
    }

    @DeleteMapping("/{id}")
    public void deleteComputerById(@PathVariable Long id) {
        this.computerService.deleteComputerById(id);
    }
}
