package com.javahonk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DropDownController {

	@RequestMapping(value = "/dropDown.web", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		System.out.println("drop");
		return "dropDown";
	}

	@RequestMapping(value = "/populatePersonDataFromServer.web", method = RequestMethod.GET)
	public @ResponseBody
	List<PersonData> populateActivePSwapBasket() {
		System.out.println("drddopd");
		PersonData personData = new PersonData();
		personData.setPersonId(10);
		personData.setPersonName("Java Honk");

		List<PersonData> personDatas = new ArrayList<PersonData>();
		personDatas.add(personData);

		personData = new PersonData();
		personData.setPersonId(11);
		personData.setPersonName("AngularJS combo box");
		personDatas.add(personData);

		personData = new PersonData();
		personData.setPersonId(11);
		personData.setPersonName("Select box list");
		personDatas.add(personData);
		System.out.println("dropd");
		return personDatas;
	}

}
