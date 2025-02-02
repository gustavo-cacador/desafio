package com.devgustavo.desafio.services;

import com.devgustavo.atividade.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ShippingService shippingService;

    public double discountOrder(Order order) {
        return orderService.total(order) + shippingService.shipment(order); // retorna o valorPedido + fretePedido calculando o totalPedido
    }
}
