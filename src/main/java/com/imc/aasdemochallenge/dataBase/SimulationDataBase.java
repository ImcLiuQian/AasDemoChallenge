package com.imc.aasdemochallenge.dataBase;

import com.imc.aasdemochallenge.model.simulation.SimulationData;

import java.util.HashMap;

public class SimulationDataBase {
    static HashMap<Character, SimulationData> map = new HashMap<>();

    public static SimulationData put(Character series, SimulationData sim) {
        return map.put(series, sim);
    }

    public static SimulationData get(Character series) {
        return map.get(series);
    }
}
