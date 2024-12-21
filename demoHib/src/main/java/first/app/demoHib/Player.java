package first.app.demoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
//import javax.persistence.Table;


@Entity(name="worldcricket")
public class Player{
    @Id
    private int aid;
    @Column(name="player_name")
    private String Name;
   
    @Column(name="role")
    private String role;
    private Domestic d;
    
    public Domestic getD() {
		return d;
	}

	public void setD(Domestic d) {
		this.d = d;
	}

	// Getters and Setters
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getrole() {
        return role;
    }

    public void setrole(String role) {
        this.role = role;
    }

	@Override
	public String toString() {
		return "Player [aid=" + aid + ", Name=" + Name + ", role=" + role + "]";
	}
    
}
