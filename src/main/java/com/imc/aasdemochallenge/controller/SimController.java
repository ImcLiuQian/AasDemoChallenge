package com.imc.aasdemochallenge.controller;

import com.imc.aasdemochallenge.dataBase.SimulationDataBase;
import com.imc.aasdemochallenge.model.simulation.SimulationData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Sim")
@Slf4j
public class SimController {
    @GetMapping("{series}")
    public SimulationData getSimulationData(@PathVariable Character series) {
        return SimulationDataBase.get(series);
    }
}
