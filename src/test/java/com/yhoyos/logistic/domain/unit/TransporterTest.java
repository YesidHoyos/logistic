package com.yhoyos.logistic.domain.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yhoyos.logistic.domain.model.DeliveryDetail;
import com.yhoyos.logistic.domain.model.DeliveryStatus;
import com.yhoyos.logistic.domain.model.Transporter;
import com.yhoyos.logistic.domain.repository.DeliveryRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TransporterTest {

	@Mock
	private DeliveryRepository deliveryRepository;

	@InjectMocks
	private Transporter transporter;
	
	private static final String YHOYOS_COMPANY = "Yhoyos's Company";

	@Test
	public void generateDeliveryTest() {
		//arrange
		String direction = "calle 9sur";
		long guideNumber = 1234;
		String transportationCompany = YHOYOS_COMPANY;
		
		DeliveryDetail deliveryDetailExpected = new DeliveryDetail(1, DeliveryStatus.CREATED, direction, guideNumber, transportationCompany);
		
		when(deliveryRepository.saveDeliveryDetail(Mockito.any())).thenReturn(deliveryDetailExpected);
		//act
		DeliveryDetail deliveryDetail = this.transporter.generateDelivery(direction);
		//assert
		assertEquals(deliveryDetailExpected, deliveryDetail);
	}
	
	@Test
	public void generateGuideNumberTest() {
		//arrange
		long guideNumberExpected = 1234;
		//act
		long guideNumber = this.transporter.generateGuideNumber();
		//assert
		assertEquals(guideNumberExpected, guideNumber);
	}
	
	@Test
	public void assignTransportationCompanyTest() {
		//arrange
		String transportationCompanyExpected = YHOYOS_COMPANY;
		//act
		String transportationCompany = this.transporter.assignTransportationCompany();
		//assert
		assertEquals(transportationCompanyExpected, transportationCompany);
	}
}
