package com.imc.aasdemochallenge.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.imc.aasdemochallenge.dataBase.MotorDataBase;
import com.imc.aasdemochallenge.model.component.Motor;
import com.imc.aasdemochallenge.model.component.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Order")
@Slf4j
public class OrderController {

    @PostMapping("{id}")
    public Motor addOrder(@RequestBody String orderStr, @PathVariable Integer id) throws JsonProcessingException {
        Order order = new ObjectMapper().readValue(orderStr, Order.class);

        log.info("order no: {}, post order", id);

        char category = order.MotorCategory.charAt(order.MotorCategory.length() - 1);
        Motor motor = new Motor(category);
        motor.Stator.Category = order.StatorCategory;
        motor.Rotor.Category = order.RotorCategory;
        motor.Winding.Category = order.WindingCategory;

        MotorDataBase.motorMap.put(id, motor);

        return motor;
    }
}