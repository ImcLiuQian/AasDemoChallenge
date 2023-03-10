package com.imc.aasdemochallenge.model.kpi;

import com.imc.aasdemochallenge.model.kpi.meta.CarbonFootprintDelivery;
import com.imc.aasdemochallenge.model.kpi.meta.CarbonFootprintProduction;
import com.imc.aasdemochallenge.model.kpi.meta.CarbonFootprintUsage;

public class SustainabilityKPI {
    public CarbonFootprintProduction CarbonFootprintProduction;
    public CarbonFootprintDelivery CarbonFootprintDelivery;
    public CarbonFootprintUsage CarbonFootprintUsage;

    public SustainabilityKPI() {
        CarbonFootprintProduction = new CarbonFootprintProduction();
        CarbonFootprintDelivery = new CarbonFootprintDelivery();
        CarbonFootprintUsage = new CarbonFootprintUsage();
    }
}
