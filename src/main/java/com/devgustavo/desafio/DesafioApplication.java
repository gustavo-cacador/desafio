package com.devgustavo.desafio;

import com.devgustavo.desafio.entities.Order;
import com.devgustavo.desafio.services.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private DiscountService discountService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order1 = new Order(1034, 150.00, 20.0);
		Order order2 = new Order(2282, 800.00, 10.0);
		Order order3 = new Order(1309, 95.90, 0.0);

		System.out.println("Pedido código " + order1.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", discountService.discountOrder(order1)));

		System.out.println("-----------------------");

		System.out.println("Pedido código " + order2.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", discountService.discountOrder(order2)));

		System.out.println("-----------------------");

		System.out.println("Pedido código " + order3.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", discountService.discountOrder(order3)));
	}
}
