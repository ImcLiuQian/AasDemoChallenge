package com.imc.aasdemochallenge.model.component.meta.meta;

import java.util.Date;
import java.util.UUID;

public class Nameplate {
    public String ManufacturerName;
    public String SerialNo;
    public String OriginCountry;
    public String ConstructionTime;

    public Nameplate() {
        SerialNo = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 12);
        OriginCountry = "Germany";
        ManufacturerName = "Siemens";
        ConstructionTime = new Date().toString();
    }

    public Nameplate(char ch) {
        SerialNo = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 12);
        if (ch == 'A') {
            OriginCountry = "Germany";
            ManufacturerName = "Siemens";
        }
        else if (ch == 'B') {
            OriginCountry = "Japan";
            ManufacturerName = "Laboratory";
        }
        ConstructionTime = new Date().toString();
    }
}
