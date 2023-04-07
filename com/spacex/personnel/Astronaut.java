// Astronaut.java
// D. Singletary 
// 3/20/23
// class representing an astronaut

package com.spacex.personnel;

import java.time.LocalDateTime;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Astronaut {
    private String name;
    private double heightCm;  // height in centimeters
    private double weightKg;  // weight in kilograms
    private LocalDateTime arrival; // arrival date/time
    
    // overload, create an astronaut with specified name, height, and weight
    public Astronaut(String name, double heightCm, double weightKg,
                     LocalDateTime arrival) {
        this.name = name;
        this.heightCm = heightCm;
        this.weightKg = weightKg;
        this.arrival = arrival;
    }
    
    public String toString() {
        DecimalFormat decFormatter = new DecimalFormat(".#");
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        return "name: " + name + "\n" + 
               "height: " + decFormatter.format(heightCm) + " (cm)\n" +
               "weight: " + decFormatter.format(weightKg) + " (kg)\n" +
               dtFormatter.format(arrival) + "\n";
    }
}

