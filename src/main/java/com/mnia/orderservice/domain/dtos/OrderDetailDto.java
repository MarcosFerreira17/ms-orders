package com.mnia.orderservice.domain.dtos;

import lombok.*;

import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDto {
    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
