package pjatk.MPR.ServiceMPR;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pjatk.MPR.ModelMPR.Player;
import pjatk.MPR.RepositoryMPR.PlayerRepository;

@RestController
public class PlayerController {


    @Autowired
    private PlayerService playerService;

    //
    //status 404 404 500 itp to sa statusy 
    //http ktore odpowiadaja jakiemus stanowi


    //przekazanie kontrollerowi ze ktos wchodzi tu i ma byc obslouzony
        /////@GetMapping
        //@RestController
        @GetMapping("/players")
    public ResponseEntity<List<Player>> findAll() {
        return ResponseEntity.ok(playerService.findAll());
    }

        

        @GetMapping("/{id}")
        public ResponseEntity<Player> findById(@PathVariable Long id) {
            Optional<Player> BYiD = playerService.findById(id);
            
            if(BYiD.isPresent()){
            	 return ResponseEntity.ok(BYiD.get());
            	
            }
            else {
            	return ResponseEntity.notFound().build();
            }
            
           
        }
        
        @PostMapping("/player")
        public ResponseEntity<Player> save(@RequestBody Player player){
			return ResponseEntity.ok(playerService.save(player));
        	
        }
       
        

}
