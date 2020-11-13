package Service;

import Model.Player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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




}
