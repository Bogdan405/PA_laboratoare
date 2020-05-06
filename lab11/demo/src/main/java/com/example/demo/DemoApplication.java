
package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	// mappam ca la requestul get sa se ruleze cererea din baza de date a listei de playeri
	@GetMapping("/players")
		public void player_list(){
			Player.Player(1,"");
		}
	// mappam ca la requestul post sa se ruleze aduagarea unui player
	@PostMapping("/name")
	public void player_add(){
		Player.Player(2,"");
	}
	// mappam ca la requestul put sa se ruleze updatarea unui player
	@PutMapping("/name")
	public void player_udate(){
		Player.Player(3,"");
	}

	// mappam ca la requestul delete sa se ruleze stergerea unui player
	@DeleteMapping("/name")
	public void player_delete(){
		Player.Player(4,"");
	}

}
            