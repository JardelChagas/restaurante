package org.example.catalog.repository;

import org.example.catalog.model.ItemMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemMenuRepository extends JpaRepository<ItemMenu, Long> {
}
