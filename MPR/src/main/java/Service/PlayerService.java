package Service;

import Model.Player;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    private List<Player> lista = new ArrayList<Player>();

    public PlayerService() {
        lista = new ArrayList<Player>();
        lista.add(new Player(1, "Fancia", 11, 2));
        //do wykonywania zmian na obiektach dostarczonych
    }

    // zwrocimy sobi eliste fgraczy
    public List<Player> findAll(){
        return lista;// TODO Auto-generated constructor stub
    }

}
