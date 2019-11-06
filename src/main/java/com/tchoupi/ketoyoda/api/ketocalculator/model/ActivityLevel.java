package com.tchoupi.ketoyoda.api.ketocalculator.model;

import lombok.Getter;

public enum ActivityLevel {
    Sedentary("Sedentary", "Pas d'activité"),
    LightlyActive("Lightly Active", ""),
    ModeratelyActive("Moderately Active",""),
    VeryActive("Very Active","");

    @Getter
    private String enActivityLevel, frActivityLevel;

    ActivityLevel(String enActivityLevel, String frActivityLevel) {
        this.enActivityLevel= enActivityLevel;
        this.frActivityLevel= frActivityLevel;
    }
}
