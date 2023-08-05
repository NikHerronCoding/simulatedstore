/* 
   /$$$$$$           /$$   /$$ /$$ /$$             /$$   /$$                                                          /$$$$$$                  /$$ /$$                    
   /$$$__  $$$        | $$$ | $$|__/| $$            | $$  | $$                                                         /$$__  $$                | $$|__/                    
  /$$_/  \_  $$       | $$$$| $$ /$$| $$   /$$      | $$  | $$  /$$$$$$   /$$$$$$   /$$$$$$   /$$$$$$  /$$$$$$$       | $$  \__/  /$$$$$$   /$$$$$$$ /$$ /$$$$$$$   /$$$$$$ 
 /$$/ /$$$$$  $$      | $$ $$ $$| $$| $$  /$$/      | $$$$$$$$ /$$__  $$ /$$__  $$ /$$__  $$ /$$__  $$| $$__  $$      | $$       /$$__  $$ /$$__  $$| $$| $$__  $$ /$$__  $$
| $$ /$$  $$| $$      | $$  $$$$| $$| $$$$$$/       | $$__  $$| $$$$$$$$| $$  \__/| $$  \__/| $$  \ $$| $$  \ $$      | $$      | $$  \ $$| $$  | $$| $$| $$  \ $$| $$  \ $$
| $$| $$\ $$| $$      | $$\  $$$| $$| $$_  $$       | $$  | $$| $$_____/| $$      | $$      | $$  | $$| $$  | $$      | $$    $$| $$  | $$| $$  | $$| $$| $$  | $$| $$  | $$
| $$|  $$$$$$$$/      | $$ \  $$| $$| $$ \  $$      | $$  | $$|  $$$$$$$| $$      | $$      |  $$$$$$/| $$  | $$      |  $$$$$$/|  $$$$$$/|  $$$$$$$| $$| $$  | $$|  $$$$$$$
|  $$\________/       |__/  \__/|__/|__/  \__/      |__/  |__/ \_______/|__/      |__/       \______/ |__/  |__/       \______/  \______/  \_______/|__/|__/  |__/ \____  $$
 \  $$$   /$$$                                                                                                                                                     /$$  \ $$
  \_  $$$$$$_/                                                                                                                                                    |  $$$$$$/
    \______/                                                                                                                                                       \______/ 
*/




package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}