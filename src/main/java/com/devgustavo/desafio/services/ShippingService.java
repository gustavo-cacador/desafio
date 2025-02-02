package com.devgustavo.desafio.services;

import com.devgustavo.atividade.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {

        double basic = order.getBasic();

        // if else basico para retornar o valor do frete
        if(basic < 100) {
            return 20.0;
        } else if(basic >= 100 && basic < 200) {
            return 12.0;
        } else {
            return 0.0;
        }
    }
}
