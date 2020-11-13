package pjatk.MPR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import Model.Player;
import Service.PlayerController;
import Service.PlayerService;

@SpringBootApplication
@ComponentScan(basePackageClasses = PlayerController.class)
@ComponentScan(basePackageClasses = Player.class)
@ComponentScan(basePackageClasses = PlayerService.class)
public class MprApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(MprApplication.class, args);
	}

}
