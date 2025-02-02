package com.devgustavo.desafio.services;

import com.devgustavo.atividade.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public double total(Order order) {
        double desconto = order.getBasic() * (order.getDiscount() / 100.0); // desconto = valorPedido - porcentagem do desconto (150 - 20% = 30 reais (20% de 150 = 30)
        return order.getBasic() - desconto; // retorna o valorPedido - valorDesconto que seria (150 - 30 = 120)
    }
}
