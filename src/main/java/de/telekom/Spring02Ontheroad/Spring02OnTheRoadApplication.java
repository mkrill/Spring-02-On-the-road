package de.telekom.Spring02Ontheroad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Spring02OnTheRoadApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring02OnTheRoadApplication.class, args);
	}

	@RequestMapping("/hello/{name}")
	@ResponseBody
	public String hello(@PathVariable("name") String name, @RequestParam(defaultValue = "") String title) {
		if (title.length() > 0) {
			return "Hello " + name + ", " + title;
		} else {
			return "Hello " + name;
		}
	}
}