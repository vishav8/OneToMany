package com.mycompany.onetomany.dtos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto {

    private String orderId;
    private String orderName;

    @JsonManagedReference
    private List<ItemDto> itemsList = new ArrayList<>();
}
