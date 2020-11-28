package pjatk.MPR.ServiceMPR;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import pjatk.MPR.ModelMPR.Player;
import pjatk.MPR.RepositoryMPR.PlayerRepository;

@Service
public class PlayerService {

   // private List<Player> lista = new ArrayList<Player>();
    
    private PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
    	this.playerRepository = playerRepository;
       
       
        
        //do wykonywania zmian na obiektach dostarczonych
    }

    // zwrocimy sobi eliste fgraczy
//    public List<Player> findAll(){
//        return lista;// TODO Auto-generated constructor stub
//    }
    
    public List<Player> findAll() {
        return playerRepository.findAll();
    }
    public Optional<Player> findById(Long id){
    	return playerRepository.findById(id);
    }

    
    public Player save(Player player){
    	return playerRepository.save(player);
    }
}
