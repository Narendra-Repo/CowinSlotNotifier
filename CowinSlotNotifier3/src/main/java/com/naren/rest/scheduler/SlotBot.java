package com.naren.rest.scheduler;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.naren.rest.model.Center;
import com.naren.rest.model.CenterData;
import com.naren.rest.service.NetworkDAO;

@Component
public class SlotBot {
	int i = 0;

	private static final Logger logger = LogManager.getLogger(SlotBot.class);
	@Autowired
	private NetworkDAO netDao;

	@Scheduled(fixedRate = 10000)
	public void initializer() {
		logger.info("Thread pid:" + ++i);
		String resp = netDao.apiConsumer();
		logger.info("Response: " + resp);
		List<Center> centList = getCenterList(resp);
	}

	public List<Center> getCenterList(String json) {
		try {
			JSONObject outer = new JSONObject(json);
			JSONArray sessions = outer.getJSONArray("sessions");
			List<CenterData> centerlist = new ArrayList<CenterData>();

			for (int i = 0; i < sessions.length(); i++) {
				CenterData centerdata = objectMapper().readValue(sessions.get(i).toString(), CenterData.class);
				centerlist.add(centerdata);
			}
			logger.info("Arraylist: "+centerlist);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		JSONObject outer = new JSONObject(json);
//		JSONArray sessions = outer.getJSONArray("sessions");
//		logger.info("array: " + sessions);

		return null;
	}

	@Bean
	ObjectMapper objectMapper() {
		return new ObjectMapper();
	}
}
