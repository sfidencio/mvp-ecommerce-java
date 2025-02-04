package com.github.sfidencio.adapter.input;

import com.github.sfidencio.application.dto.CreateProductRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/v1/categories/{id}/products")
@Tag(name = "Product API", description = "API for managing products")
public interface IProductResource {
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(
            summary = "Create a new product",
            description = "Creates a new product with the specified details",
            responses = {
                    @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "201", description = "Product created successfully"),
                    @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "409", description = "Product already exists"),
                    @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "400", description = "Invalid request payload")
            }
    )
    void createProduct(
            @Parameter(description = "Enter Category ID") @PathVariable UUID id,
            @Parameter(description = "Details of the product to create", required = true)
            @RequestBody CreateProductRequest request
    );
}
