package com.imc.aasdemochallenge.model.component;

import com.imc.aasdemochallenge.model.component.meta.meta.Nameplate;

public class Stator {
    public String StatorIdentifier;
    public String Category;
    public int StatorSlotNumber;
    public double StatorOuterDiameter;
    public double StatorInnerDiameter;
    public double StatorThickness;
    public double MagneticResistance;
    public Nameplate Nameplate;

    public Stator() {
        Nameplate = new Nameplate();
        StatorSlotNumber = 24;
        StatorOuterDiameter = 120;
        StatorInnerDiameter = 68;
        StatorThickness = 30;
        MagneticResistance = 602;
    }
}
