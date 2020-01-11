package com.microservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.microservice.entity.CustResponse;
import com.microservice.entity.CustomerData;
import com.microservice.service.GetService;

@RestController
@RequestMapping("/api")
public class MicroServiceController {

	@Autowired
	GetService getData;

	@RequestMapping(value = "/getData", method = RequestMethod.GET)
	public CustResponse get() {
		CustResponse custData = new CustResponse();
		List<CustomerData> customerData = new ArrayList<CustomerData>();
		Object[] obj = getData.getData();
		System.out.println(obj[0]);
		for (Object object : obj) {
			Gson g = new Gson();
			customerData.add(g.fromJson(object.toString(), CustomerData.class));
		}
		if (!customerData.isEmpty()) {
			custData.setCustData(customerData);
			custData.setRespCode("0000");
			custData.setRespDesc("Success");
		} else {
			custData.setRespCode("1111");
			custData.setRespDesc("Failed/Empty");
		}
		return custData;
	}
}
