package com.yhoyos.logistic.infrastructure.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yhoyos.logistic.application.dto.Order;
import com.yhoyos.logistic.application.handler.GenerateDeliveryHandler;
import com.yhoyos.logistic.domain.model.DeliveryDetail;

@RestController
@RequestMapping("/logistic")
public class LogisticController {

	private GenerateDeliveryHandler generateDeliveryHandler;
	
	public LogisticController(GenerateDeliveryHandler generateDeliveryHandler) {
		this.generateDeliveryHandler = generateDeliveryHandler;
	}
	
	@PostMapping()
	public DeliveryDetail generateDelivery(@RequestBody Order order) {
		return this.generateDeliveryHandler.generateDelivery(order);
	}
}
