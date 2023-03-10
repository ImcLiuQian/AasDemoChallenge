package com.imc.aasdemochallenge.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.imc.aasdemochallenge.dataBase.SimulationDataBase;
import com.imc.aasdemochallenge.model.simulation.SimulationData;
import com.imc.aasdemochallenge.simulation.SimFileProperties;
import com.imc.aasdemochallenge.util.JsonFileUtil;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn(value = "simFileProperties")
public class SimService implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        String SData = JsonFileUtil.read(SimFileProperties.SimulationPath);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(SData);
        for (JsonNode node : root) {
            Character series = node.get("series").asText().charAt(0);
            JsonNode simNode = node.get("simulation");
            SimulationData simulationData = mapper.treeToValue(simNode, SimulationData.class);
            SimulationDataBase.put(series, simulationData);
        }
    }
}
