package org.example.catalog.controller;

import org.example.catalog.Service.ItemMenuService;
import org.example.catalog.model.ItemMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/itemMenu")
public class ItemMenuController {
    @Autowired
    private ItemMenuService itemMenuService;

    @GetMapping
    public List<ItemMenu> list() {
        return itemMenuService.findAll();
    }
    @PostMapping("/create")
    public ItemMenu create(@RequestBody ItemMenu itemMenu) {
        return itemMenuService.save(itemMenu);
    }
}
