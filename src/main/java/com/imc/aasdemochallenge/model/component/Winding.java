package com.imc.aasdemochallenge.model.component;

import com.imc.aasdemochallenge.model.component.meta.meta.Nameplate;

public class Winding {
    public String WindingIdentifier;
    public String Category;
    public double MainCoilDiameter;
    public double SubCoilDiameter;
    public double MainPhaseResistance;
    public double SecondaryPhaseResistance;
    public double WindingTurnsRatio;
    public double MainWindingFactor;
    public double SecondaryWindingFactor;
    public double MainPhaseLeakageResistance;
    public double SecondaryPhaseLeakageResistance;
    public Nameplate Nameplate;

    public Winding() {
        Nameplate = new Nameplate();
        MainCoilDiameter = 0.40;
        SubCoilDiameter = 0.39;
        MainPhaseResistance = 77.93;
        SecondaryPhaseResistance = 73.72;
        WindingTurnsRatio = 1.141;
        MainWindingFactor = 0.892;
        SecondaryWindingFactor = 0.871;
        MainPhaseLeakageResistance = 45.37;
        SecondaryPhaseLeakageResistance = 46.549;
    }
}
