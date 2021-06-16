package com.naren.rest.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class NetworkDAO {
	private static final Logger logger = LogManager.getLogger(NetworkDAO.class);

	public String apiConsumer() {
		logger.error("Inside API Consumer");
		String uri = "https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/findByDistrict?district_id=383&date=17-06-2021";
		HttpResponse<String> response = null;
		try {
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();

			response = client.send(request, BodyHandlers.ofString());

		} catch (Exception e) {
			logger.error("Exception in ApiConsumer: ", e);
		}
//		logger.error("Headers: "+headers);
		return response.body();
	}
}
