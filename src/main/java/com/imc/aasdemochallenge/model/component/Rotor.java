package com.imc.aasdemochallenge.model.component;

import com.imc.aasdemochallenge.model.component.meta.meta.Nameplate;

public class Rotor {
    public String RotorIdentifier;
    public String Category;
    public int RotorSlotNumber;
    public double RotorOuterDiameter;
    public double RotorInnerDiameter;
    public double AirGap;
    public double AluminiumRingWidth;
    public double AluminiumRingThickness;
    public double SlopeRatio;
    public double RotorResistance;
    public double RotorReactance;
    public Nameplate Nameplate;

    public Rotor() {
        Nameplate = new Nameplate();
        RotorSlotNumber = 34;
        RotorOuterDiameter = 67.4;
        RotorInnerDiameter = 12;
        AirGap = 0.3;
        AluminiumRingWidth = 5.5;
        AluminiumRingThickness = 3;
        SlopeRatio = 1.417;
        RotorResistance = 143.014;
        RotorReactance = 100.293;
    }
}
