package com.yhoyos.logistic.application.handler;

import org.springframework.stereotype.Component;

import com.yhoyos.logistic.application.dto.Order;
import com.yhoyos.logistic.domain.model.DeliveryDetail;
import com.yhoyos.logistic.domain.service.DeliveryGenerator;

/**
 * Clase encargada de manejar la comunicación entre el controlador y la lógica de negocio.
 * Su responsabilidad es tomar los datos de entrada y transformarlos en objetos de dominio(lógica de negocio).
 *
 */
@Component
public class GenerateDeliveryHandler {

	private DeliveryGenerator deliveryGenerator;
	
	public GenerateDeliveryHandler(DeliveryGenerator deliveryGenerator) {
		this.deliveryGenerator = deliveryGenerator;
	}
	
	public DeliveryDetail generateDelivery(Order order) {
		return deliveryGenerator.generateDelivery(order.getDirection());
	}
}
