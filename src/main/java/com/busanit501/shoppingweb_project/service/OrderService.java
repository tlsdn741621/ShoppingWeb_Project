package com.busanit501.shoppingweb_project.service;

import com.busanit501.shoppingweb_project.dto.CartItemDTO;
import com.busanit501.shoppingweb_project.dto.OrderDTO;
import com.busanit501.shoppingweb_project.dto.ProductDTO;

public interface OrderService {
    OrderDTO PurchaseFromCart(Long memberId);
    CartItemDTO AddCartItemFromProductDetail(CartItemDTO cartItemDTO);

}
