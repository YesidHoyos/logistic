package com.yhoyos.logistic.infrastructure.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "delivery_detail")
@Entity
@Data
@NoArgsConstructor
public class DeliveryDetailEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DELIVERY_SEQ")
    @SequenceGenerator(sequenceName = "delivery_detail_sequence", allocationSize = 1, name = "DELIVERY_SEQ")
	@Column(name = "delivery_detail_id")
	private Long id;
	
	@Column(name = "direction")
	private String direction;
	
	@Column(name = "delivery_detail_status")
	private String status;
	
	@Column(name = "guide_number")
	private long guideNumber;
	
	@Column(name = "transportation_company")
	private String transportationCompany;
	
	public DeliveryDetailEntity(String direction, String status, long guideNumber, String transportationCompany) {
		this.direction = direction;
		this.status = status;
		this.guideNumber = guideNumber;
		this.transportationCompany = transportationCompany;
	}
}
