package com.yhoyos.logistic.infrastructure.repository.persistence;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yhoyos.logistic.domain.model.DeliveryDetail;
import com.yhoyos.logistic.domain.repository.DeliveryRepository;
import com.yhoyos.logistic.infrastructure.repository.builder.DeliveryDetailBuilder;
import com.yhoyos.logistic.infrastructure.repository.entity.DeliveryDetailEntity;
import com.yhoyos.logistic.infrastructure.repository.persistence.jpa.DeliveryDetailRepositoryJpa;

@Repository
@Transactional
public class DeliveryDetailRepositoryImpl implements DeliveryRepository {

	private DeliveryDetailRepositoryJpa deliveryDetailRepositoryJpa;
	
	public DeliveryDetailRepositoryImpl(DeliveryDetailRepositoryJpa deliveryDetailRepositoryJpa) {
		this.deliveryDetailRepositoryJpa = deliveryDetailRepositoryJpa;
	}

	@Override
	public DeliveryDetail saveDeliveryDetail(DeliveryDetail deliveryDetail) {
		DeliveryDetailEntity deliveryDetailEntity = DeliveryDetailBuilder.convertToEntity(deliveryDetail);
		DeliveryDetailEntity deliveryDetailEntitySaved = this.deliveryDetailRepositoryJpa.save(deliveryDetailEntity);
		return DeliveryDetailBuilder.convertToDomain(deliveryDetailEntitySaved);
	}
	

}
