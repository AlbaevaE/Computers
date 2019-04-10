package com.example.demo.bootstrap;

import com.example.demo.model.Computers;
import com.example.demo.repository.ComputersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ComputerBootstrap implements CommandLineRunner {
    private final ComputersRepository computerRepository;

    public ComputerBootstrap(ComputersRepository computerRepository) {
        this.computerRepository = computerRepository;
    }
    @Override
    public void run(String...args)throws Exception{
        Computers com1 = new Computers();
        com1.setBrand("Acer");
        com1.setModel("Aspire 1203XV");
        com1.setDescriptions("Тактовая частота (MHz): 1300.Чипсет: VIA ProSavage PN133T.Объем (Mb): 128");
        com1.setYear(2010);
        computerRepository.save(com1);

        Computers com2 = new Computers();
        com2.setBrand("Apple");
        com2.setModel("MacBook Air 13");
        com2.setDescriptions("Процессор\n" +
                "Двухъядерный процессор Intel Core i5 с тактовой частотой 1,4 ГГц");
        com2.setYear(2014);
        computerRepository.save(com2);
    }
}
