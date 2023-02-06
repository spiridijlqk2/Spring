package spring.boot.demo.mysampleapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewRestController {
	
	//inject properties
	@Value("${coach.name}")
	private String coachName;

	@Value("${team.name}")
	private String teamName;
	
	//expose new endpoint for "teaminfo"
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach name: " + coachName + ", Team name: " + teamName;
	}
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello world! " + LocalDateTime.now();
	}
	
	//expose new endpoint for workour
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return"run a hard 5k";
	}
	
	//expospe new endpoint for fortune
	@GetMapping("/fortune")
	public String getFortune() {
		return "today is your lucky day";
	}
	
}
