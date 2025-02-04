package com.github.sfidencio.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.hateoas.RepresentationModel;

import java.math.BigDecimal;
import java.util.UUID;

@AllArgsConstructor
@Builder
public class CreateProductResponse extends RepresentationModel<CreateProductResponse> {
    private UUID id;
    private String description;
    private BigDecimal price;
    private BigDecimal stock;
}
