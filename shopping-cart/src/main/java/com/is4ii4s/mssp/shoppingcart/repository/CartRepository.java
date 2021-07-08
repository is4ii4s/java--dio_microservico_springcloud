package com.is4ii4s.mssp.shoppingcart.repository;

import com.is4ii4s.mssp.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
