package com.yhoyos.logistic.domain.service;

import com.yhoyos.logistic.domain.model.DeliveryDetail;

public interface DeliveryGenerator {

	public DeliveryDetail generateDelivery(String direction);
}
