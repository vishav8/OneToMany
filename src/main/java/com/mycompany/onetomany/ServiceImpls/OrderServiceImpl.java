package com.mycompany.onetomany.ServiceImpls;

import com.mycompany.onetomany.dtos.OrderDto;
import com.mycompany.onetomany.entities.Item;
import com.mycompany.onetomany.entities.Order;
import com.mycompany.onetomany.services.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        Order order = new Order();
        order.setOrderId(orderDto.getOrderId());
        order.setOrderName(orderDto.getOrderName());

            return null;
    }

    @Override
    public OrderDto getOrder(String orderId) {
        return null;
    }
}
