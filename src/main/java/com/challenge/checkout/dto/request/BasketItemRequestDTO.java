package com.challenge.checkout.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BasketItemRequestDTO {
    @NotNull
    private String productId;

    @Positive
    private int quantity;

    public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }
}