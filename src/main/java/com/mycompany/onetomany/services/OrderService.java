package com.mycompany.onetomany.services;

import com.mycompany.onetomany.dtos.OrderDto;

public interface OrderService {

    OrderDto createOrder(OrderDto orderDto);
    OrderDto getOrder(String orderId);
}
