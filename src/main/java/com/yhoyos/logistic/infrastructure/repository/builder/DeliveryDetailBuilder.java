package com.yhoyos.logistic.infrastructure.repository.builder;

import com.yhoyos.logistic.domain.model.DeliveryDetail;
import com.yhoyos.logistic.domain.model.DeliveryStatus;
import com.yhoyos.logistic.infrastructure.repository.entity.DeliveryDetailEntity;

public class DeliveryDetailBuilder {

	public static DeliveryDetailEntity convertToEntity(DeliveryDetail deliveryDetail) {
		return new DeliveryDetailEntity(deliveryDetail.getDirection(), deliveryDetail.getStatus().toString(), deliveryDetail.getGuideNumber(), deliveryDetail.getTransportationCompany());
	}
	
	public static DeliveryDetail convertToDomain(DeliveryDetailEntity deliveryDetailEntity) {
		return new DeliveryDetail(deliveryDetailEntity.getId(), DeliveryStatus.valueOf(deliveryDetailEntity.getStatus()), deliveryDetailEntity.getDirection(), deliveryDetailEntity.getGuideNumber(), deliveryDetailEntity.getTransportationCompany());
	}
}
