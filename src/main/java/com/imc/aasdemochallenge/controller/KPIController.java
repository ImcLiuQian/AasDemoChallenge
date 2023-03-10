package com.imc.aasdemochallenge.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.imc.aasdemochallenge.dataBase.MotorDataBase;
import com.imc.aasdemochallenge.model.component.Motor;
import com.imc.aasdemochallenge.model.kpi.meta.CarbonFootprintDelivery;
import com.imc.aasdemochallenge.model.kpi.meta.CarbonFootprintProduction;
import com.imc.aasdemochallenge.model.kpi.meta.CarbonFootprintUsage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/KPI")
@Slf4j
public class KPIController {

    @PostMapping("/Delivery/{id}")
    public ResponseEntity addDelivery(@PathVariable Integer id, @RequestBody String deliveryStr) throws JsonProcessingException {
        CarbonFootprintDelivery delivery = new ObjectMapper().readValue(deliveryStr, CarbonFootprintDelivery.class);

        log.info("order no: {}, post delivery", id);
        Motor motor = MotorDataBase.get(id);
        motor.SustainabilityKPI.CarbonFootprintDelivery.GHGTotal = delivery.GHGTotal;
        motor.SustainabilityKPI.CarbonFootprintDelivery.FossilFuelType = delivery.FossilFuelType;
        motor.SustainabilityKPI.CarbonFootprintDelivery.FuelEmissionFactor = delivery.FuelEmissionFactor;
        motor.SustainabilityKPI.CarbonFootprintDelivery.FossilFuelAmount = delivery.FossilFuelAmount;
        return ResponseEntity.ok().body("success");
    }

    @PostMapping("/Production/{id}")
    public ResponseEntity addProduction(@PathVariable Integer id, @RequestBody String prodStr) throws JsonProcessingException {

        CarbonFootprintProduction prod = new ObjectMapper().readValue(prodStr, CarbonFootprintProduction.class);

        log.info("order no: {}, post production", id);
        Motor motor = MotorDataBase.get(id);
        motor.SustainabilityKPI.CarbonFootprintProduction.GHGTotal = prod.GHGTotal;
        motor.SustainabilityKPI.CarbonFootprintProduction.GHGInventoryChange = prod.GHGInventoryChange;
        motor.SustainabilityKPI.CarbonFootprintProduction.GHGElectricityUse = prod.GHGElectricityUse;
        motor.SustainabilityKPI.CarbonFootprintProduction.PurchasedElectricity = prod.PurchasedElectricity;
        motor.SustainabilityKPI.CarbonFootprintProduction.ElectricityEmissionFactor = prod.ElectricityEmissionFactor;
        motor.SustainabilityKPI.CarbonFootprintProduction.GHGHeatUse = prod.GHGHeatUse;
        motor.SustainabilityKPI.CarbonFootprintProduction.PurchasedHeat = prod.PurchasedHeat;
        motor.SustainabilityKPI.CarbonFootprintProduction.HeatEmissionFactor = prod.HeatEmissionFactor;

        return ResponseEntity.ok().body("success");
    }

    @PostMapping("/Usage/{id}")
    public ResponseEntity addUsage(@PathVariable Integer id, @RequestBody String usageStr) throws JsonProcessingException {

        CarbonFootprintUsage usage = new ObjectMapper().readValue(usageStr, CarbonFootprintUsage.class);

        log.info("order no: {}, post usage", id);
        Motor motor = MotorDataBase.get(id);
        motor.SustainabilityKPI.CarbonFootprintUsage.GHGTotal = usage.GHGTotal;
        motor.SustainabilityKPI.CarbonFootprintUsage.EnergyEfficiency = usage.EnergyEfficiency;
        motor.SustainabilityKPI.CarbonFootprintUsage.InputPower = usage.InputPower;
        motor.SustainabilityKPI.CarbonFootprintUsage.OutputPower = usage.OutputPower;
        motor.SustainabilityKPI.CarbonFootprintUsage.UsageTime = usage.UsageTime;
        motor.SustainabilityKPI.CarbonFootprintUsage.PowerEmissionFactor = usage.PowerEmissionFactor;

        return ResponseEntity.ok().body("success");
    }
}
