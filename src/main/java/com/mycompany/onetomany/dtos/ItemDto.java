package com.mycompany.onetomany.dtos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.mycompany.onetomany.entities.Order;
public class ItemDto {

    private String itemId;
    private String itemName;

    @JsonBackReference
    private OrderDto order;
}
