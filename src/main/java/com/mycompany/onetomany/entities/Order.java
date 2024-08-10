package com.mycompany.onetomany.entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "orders")  // order is a reserved word for mysql so use "orders" in place of "order"
public class Order {

    @Id
    private String orderId;
    private String orderName;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    @JsonManagedReference
    @ToString.Exclude
    private List<Item> itemsList = new ArrayList<>();
}
