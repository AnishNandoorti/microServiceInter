package com.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("getservice")
public class GetService {

	@Autowired
	RestTemplate restTemplate;

	public Object[] getData() {
		// List<CustResponse> custResponse = new ArrayList<CustResponse>();
		ResponseEntity<Object[]> entity = restTemplate.getForEntity("http://CUSTOMER/api/getAllCustData",
				Object[].class);
		// ("http://CUSTOMER/api/getAllCustData", CustomerData.class,
		// CustResponse.class);
		Object[] objects = entity.getBody();
		return objects;
	}

}
