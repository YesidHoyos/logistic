package com.yhoyos.logistic.domain.model;

import com.yhoyos.logistic.domain.repository.DeliveryRepository;
import com.yhoyos.logistic.domain.service.DeliveryGenerator;


public class Transporter implements DeliveryGenerator {

	private static final String YHOYOS_COMPANY = "Yhoyos's Company";
	private DeliveryRepository deliveryRepository;
	
	public Transporter(DeliveryRepository deliveryRepository) {
		this.deliveryRepository = deliveryRepository;
	}
	
	@Override
	public DeliveryDetail generateDelivery(String direction) {
		long guideNumber = generateGuideNumber();
		String transportationCompany = assignTransportationCompany();
		DeliveryDetail deliveryDetail = new DeliveryDetail(DeliveryStatus.CREATED, direction, guideNumber, transportationCompany);
		return this.deliveryRepository.saveDeliveryDetail(deliveryDetail);
	}
	
	public long generateGuideNumber() {
		return 1234;
	}
	
	public String assignTransportationCompany() {
		return YHOYOS_COMPANY;
	}

}
