package com.yhoyos.logistic.infrastructure.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yhoyos.logistic.domain.model.Transporter;
import com.yhoyos.logistic.domain.repository.DeliveryRepository;

@Configuration
public class BeanFactory {

	@Autowired
	private DeliveryRepository deliveryRepository;
	
	@Bean
	public Transporter transporter() {
		return new Transporter(this.deliveryRepository);
	}
}
