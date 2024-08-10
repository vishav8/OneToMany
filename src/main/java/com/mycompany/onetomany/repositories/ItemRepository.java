package com.mycompany.onetomany.repositories;

import com.mycompany.onetomany.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
}
