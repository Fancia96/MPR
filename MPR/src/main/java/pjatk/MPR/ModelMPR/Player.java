package pjatk.MPR.ModelMPR;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Player {
	@Id
	@GeneratedValue
    private Long id;
    private String nickname;
    private int health;
    private int attack;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public Player(Long id, String nickname, int health, int attack) {
        this.id = id;
        this.nickname = nickname;
        this.health = health;
        this.attack = attack;
    }
    
    public Player(String nickname, int health, int attack) {
        this.nickname = nickname;
        this.health = health;
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Player{is nickname health attack";
    }



}
