package com.tchoupi.ketoyoda.api.ketocalculator.util.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tchoupi.ketoyoda.api.ketocalculator.model.ActivityLevel;
import com.tchoupi.ketoyoda.api.ketocalculator.model.BodyCharacteristic;
import com.tchoupi.ketoyoda.api.ketocalculator.model.KetoGoal;
import com.tchoupi.ketoyoda.api.ketocalculator.model.Gender;
import lombok.Data;

@Data
public class KetoRequest {
    private Gender gender;
    private int age;
    private BodyCharacteristic bodyCharacteristic;
    private ActivityLevel activityLevel;
    private KetoGoal ketoGoal;

    /**
     * It's recommended to never go above a 30% calorie deficit.
     * It's also recommended that you never go above a 15% calorie surplus.
     * If you do, negative results may happen.
     */
    @JsonProperty(defaultValue = "20")
    private int deficitOrSurplus = 20;
    /**
     * It is highly recommended that on a ketogenic diet,
     * you keep your carb intake to 5% or less of total calories.
     * This works out to be an average of 20g net carbs a day.
     */
    @JsonProperty(defaultValue = "160")
    private float carbsToConsume;

    /**
     * Protein shouldn't be over-consumed on a ketogenic diet.
     * If too much is eaten, it could lead to slower weight loss and smaller levels on ketones in the blood.
     * <ul>
     *    <li>If you're sedentary, we suggest between 0.6g and 0.8g protein.</li>
     *    <li>If you're active, we suggest between 0.8g and 1.0g protein.</li>
     *    <li>If you lift weights, we suggest between 1.0g and 1.2g protein.</li>
     * </ul>
     */
    @JsonProperty(defaultValue = "0.8")
    private float proteinToConsume;
}
