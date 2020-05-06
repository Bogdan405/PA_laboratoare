
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

	@GetMapping("/players")
		public void player_list(){
			Player.Player(1,"");
		}

	@PostMapping("/name")
	public void player_add(){
		Player.Player(2,"");
	}

	@PutMapping("/name")
	public void player_udate(){
		Player.Player(3,"");
	}
	@DeleteMapping("/name")
	public void player_delete(){
		Player.Player(4,"");
	}

}
            