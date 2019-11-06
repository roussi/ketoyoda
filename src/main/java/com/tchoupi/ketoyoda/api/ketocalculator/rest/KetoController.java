package com.tchoupi.ketoyoda.api.ketocalculator.rest;

import com.tchoupi.ketoyoda.api.ketocalculator.service.KetoCalculatorService;
import com.tchoupi.ketoyoda.api.ketocalculator.util.dto.KetoRequest;
import com.tchoupi.ketoyoda.api.ketocalculator.util.dto.KetoResponse;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RequestMapping(value = KetoController.API_VERSION)
@RestController
public class KetoController {

    public static final String API_VERSION = "/v1";

    private final KetoCalculatorService ketoCalculatorService;

    public KetoController(KetoCalculatorService ketoCalculatorService) {
        this.ketoCalculatorService = ketoCalculatorService;
    }

    @PostMapping("/keto/calculator")
    public Mono<KetoResponse> calculateCalories(@RequestBody KetoRequest ketoRequest){
        return ketoCalculatorService.calculateKeto(ketoRequest);
    }
}
