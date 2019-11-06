package com.tchoupi.ketoyoda.api.ketocalculator.util.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class KetoResponse {
    private long calories;
    private long protein;
    private long fat;
    private long carbs;
}
