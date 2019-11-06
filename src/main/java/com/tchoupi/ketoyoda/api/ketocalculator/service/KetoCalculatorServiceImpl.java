package com.tchoupi.ketoyoda.api.ketocalculator.service;

import com.tchoupi.ketoyoda.api.ketocalculator.model.KetoGoal;
import com.tchoupi.ketoyoda.api.ketocalculator.util.dto.KetoRequest;
import com.tchoupi.ketoyoda.api.ketocalculator.util.dto.KetoResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Slf4j
@Service
public class KetoCalculatorServiceImpl implements KetoCalculatorService {
    @Override
    public Mono<KetoResponse> calculateKeto(KetoRequest ketoRequest) {
        KetoGoal goal = ketoRequest.getKetoGoal();
        Mono<KetoResponse> responseMono;
        switch (goal){
            case LoseWeight:
                log.info("LoseWeight");
                responseMono = calculateKetoForLosingWeight();
                break;
            case MaintainWeight:
                log.info("MaintainWeight");
                responseMono = calculateKetoForMaintingWeight();
                break;
            case GainWeight:
                log.info("GainWeight");
                responseMono = calculateKetoForGainingWeight();
                break;
            default:
                throw new UnsupportedOperationException("No goal was defined");

        }
        return responseMono;
    }

    private Mono<KetoResponse> calculateKetoForGainingWeight() {
        KetoResponse response = KetoResponse.builder()
                .protein(160)
                .fat(94)
                .carbs(400)
                .build();
        return Mono.just(response);
    }

    private Mono<KetoResponse> calculateKetoForMaintingWeight() {
        KetoResponse response = KetoResponse.builder()
                .protein(160)
                .fat(94)
                .carbs(400)
                .build();
        return Mono.just(response);
    }

    private Mono<KetoResponse> calculateKetoForLosingWeight() {
        KetoResponse response = KetoResponse.builder()
                .protein(160)
                .fat(94)
                .carbs(400)
                .build();
        return Mono.just(response);
    }
}
