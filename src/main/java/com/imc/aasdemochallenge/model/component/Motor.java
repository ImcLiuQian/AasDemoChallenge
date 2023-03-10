package com.imc.aasdemochallenge.model.component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.imc.aasdemochallenge.model.component.meta.meta.Nameplate;
import com.imc.aasdemochallenge.model.kpi.SustainabilityKPI;
import com.imc.aasdemochallenge.util.IRIUtil;

public class Motor {
    public String MotorIdentifier;
    public String Category;
    public double RatedVoltage;
    public double RatedSpeed;
    public double RatedTorque;
    public double RatedOutputPower;
    public int ElectrodesNumber;
    public Nameplate Nameplate;
    public Stator Stator;
    public Rotor Rotor;
    public Winding Winding;
    @JsonIgnore
    public SustainabilityKPI SustainabilityKPI;
    @JsonIgnore
    public boolean RecyclingRequired;

    public Motor() {}

    /**
     * @param ch
     */
    public Motor(char ch) {
        this.MotorIdentifier = IRIUtil.randomIRI();

        if (ch == 'A') {
            Category = "Series A";
            RatedVoltage = 380;
            RatedTorque = 100;
            RatedOutputPower = 75;
            RatedSpeed = 6000;
            ElectrodesNumber = 4;
        }
        else if (ch == 'B') {
            Category = "Series B";
            RatedTorque = 70;
            RatedSpeed = 5800;
            RatedVoltage = 380;
            RatedOutputPower = 25;
            ElectrodesNumber = 4;
        }
        else
            throw new RuntimeException("no Series support");

        this.Stator = new Stator();
        this.Rotor = new Rotor();
        this.Winding = new Winding();
        this.Nameplate = new Nameplate(ch);

        this.SustainabilityKPI = new SustainabilityKPI();
        this.Stator.StatorIdentifier = IRIUtil.randomIRI();
        this.Rotor.RotorIdentifier = IRIUtil.randomIRI();
        this.Winding.WindingIdentifier = IRIUtil.randomIRI();
    }
}
