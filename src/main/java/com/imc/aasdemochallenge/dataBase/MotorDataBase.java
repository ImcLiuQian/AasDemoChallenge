package com.imc.aasdemochallenge.dataBase;

import com.imc.aasdemochallenge.model.component.Motor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MotorDataBase {
    public static volatile Map<Integer, Motor> motorMap = new ConcurrentHashMap<>();

    public static Motor get(Integer id) {
        Motor motor = motorMap.get(id);
        if (motor == null) {
            throw new RuntimeException("no motor with the id, please add motor first");
        }
        return motor;
    }
}
