package com.yhoyos.logistic.domain.repository;

import com.yhoyos.logistic.domain.model.DeliveryDetail;

public interface DeliveryRepository {

	public DeliveryDetail saveDeliveryDetail(DeliveryDetail deliveryDetail);
}
