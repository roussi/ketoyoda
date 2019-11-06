package com.tchoupi.ketoyoda.api.ketocalculator.model;

import lombok.Getter;

public enum Gender {
    MALE("male", "Homme"),
    FEMALE("female", "Femme");

    @Getter
    private String enGender, frGender;

    Gender(String enGender, String frGender) {
        this.enGender = enGender;
        this.frGender = frGender;
    }
}
