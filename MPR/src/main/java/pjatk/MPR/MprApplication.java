package pjatk.MPR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import pjatk.MPR.ModelMPR.Player;
import pjatk.MPR.RepositoryMPR.PlayerRepository;
import pjatk.MPR.ServiceMPR.PlayerController;
import pjatk.MPR.ServiceMPR.PlayerService;

@SpringBootApplication
//@ComponentScan(basePackageClasses = PlayerController.class)
//@ComponentScan(basePackageClasses = Player.class)
//@ComponentScan(basePackageClasses = PlayerService.class)
//@ComponentScan(basePackageClasses = PlayerRepository.class)
public class MprApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(MprApplication.class, args);
	}

}
