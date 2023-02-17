package org.carpathian.lynx.examples.redis.configuration;

import org.carpathian.lynx.examples.redis.repository.Item;
import org.carpathian.lynx.examples.redis.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RedisRunner implements CommandLineRunner {

    private final ItemRepository itemRepository;

    public RedisRunner(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        itemRepository.deleteAll();
        itemRepository.save(new Item(1L, "Item 1"));
        itemRepository.save(new Item(2L, "Item 2"));

        System.out.println(itemRepository.findAll());
    }
}
