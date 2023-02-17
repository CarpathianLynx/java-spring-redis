package org.carpathian.lynx.examples.redis.repository;

import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}