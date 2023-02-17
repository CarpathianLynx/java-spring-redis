package org.carpathian.lynx.examples.redis.controller;

import org.carpathian.lynx.examples.redis.repository.Item;
import org.carpathian.lynx.examples.redis.repository.ItemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class WebController {

    private final ItemRepository itemRepository;

    public WebController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping
    public Iterable<Item> getItems() {
        return itemRepository.findAll();
    }
}