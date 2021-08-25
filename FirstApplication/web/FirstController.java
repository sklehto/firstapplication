package fi.palvelinohjelmointi.FirstApplication.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

/*	@RequestMapping("*") // Riippumatta urlista kaikki käsitellään näin. Muuten tarvitaan eksakti osoite.
	@ResponseBody
	public String returnGreeting() {
		return "Hello you!";
	} */
	
	/**
	 * Viikon 1 tehtävä 1:
	 */
	
	@RequestMapping("index")
	@ResponseBody
	public String returnMainPage() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String returnContactPage() {
		return "This is the contact page";
	}
	
	/**
	 * Viikon 1 tehtävä 2:
	 */
	
	@RequestMapping("hello")
	@ResponseBody
	public String returnLocationAndName(@RequestParam(value = "location", required = false, defaultValue = "Earth") String location, 
			@RequestParam(name = "name", required = false, defaultValue = "") String name) {
		return "Welcome to the " + location + " " + name +"!";
	}
}
