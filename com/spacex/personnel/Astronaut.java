// Astronaut.java
// W. Rizvi 
// 04/14/24
// class representing an astronaut

package com.spacex.personnel;

import java.time.LocalDateTime;
import java.text.DecimalFormat;
import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Astronaut {
    private String name;
    private double heightCm;  // height in centimeters
    private double weightKg;  // weight in kilograms
    private LocalDateTime arrival; // arrival date/time
    private Period period; // time the astronaut will stay on the vehicle
    private LocalDate estimatedDepartureDate; // estimated date of departure
    
    // overload, create an astronaut with specified name, height, and weight
    public Astronaut(String name, double heightCm, double weightKg,
                     LocalDateTime arrival, Period period, LocalDate estimatedDepartureDate) {
        this.name = name;
        this.heightCm = heightCm;
        this.weightKg = weightKg;
        this.arrival = arrival;
        this.period = period;
        this.estimatedDepartureDate = estimatedDepartureDate;
    }
    
    @Override
    public String toString() {
        DecimalFormat decFormatter = new DecimalFormat(".#");
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        return "name: " + name + "\n" + 
               "height: " + decFormatter.format(heightCm) + " (cm)\n" +
               "weight: " + decFormatter.format(weightKg) + " (kg)\n" +
               "arrival: " + dtFormatter.format(arrival) + "\n" +
               "stay duration: " + period.getDays() + " days\n" +
               "estimated departure date: " + dateFormatter.format(estimatedDepartureDate) + "\n";
    }
}