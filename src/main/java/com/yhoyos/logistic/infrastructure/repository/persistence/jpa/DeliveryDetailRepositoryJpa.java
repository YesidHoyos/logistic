package com.yhoyos.logistic.infrastructure.repository.persistence.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yhoyos.logistic.infrastructure.repository.entity.DeliveryDetailEntity;

public interface DeliveryDetailRepositoryJpa extends JpaRepository<DeliveryDetailEntity, Long>{

}
