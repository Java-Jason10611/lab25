package com.example.Weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@Autowired
	WeatherService apiServ;

	@RequestMapping("/")
	public String home() {

		return "index";
	}

	@RequestMapping("/latLongSubmit")
	public String latLong(@RequestParam("latitude") String latitude, @RequestParam("longitude") String longitude) {
		return "WeatherDisplay";
	}
}
