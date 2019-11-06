package com.tchoupi.ketoyoda.api.ketocalculator.service;

import com.tchoupi.ketoyoda.api.ketocalculator.util.dto.KetoRequest;
import com.tchoupi.ketoyoda.api.ketocalculator.util.dto.KetoResponse;
import reactor.core.publisher.Mono;

/**
 *
 * @author aroussi
 */
public interface KetoCalculatorService {
    Mono<KetoResponse> calculateKeto(KetoRequest ketoRequest);
}
