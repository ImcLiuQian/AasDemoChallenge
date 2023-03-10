package com.imc.aasdemochallenge.simulation;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SimFileProperties implements InitializingBean {
    @Value("${simulation.filePath}")
    String simulationPath;

    static public String SimulationPath;

    @Override
    public void afterPropertiesSet() throws Exception {
        SimulationPath = simulationPath;
    }
}
