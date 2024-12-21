package first.app.demoHib;

import javax.persistence.Embeddable;

@Embeddable
public class Domestic {
private String teamname;
private int tropies;
public String getTeamname() {
	return teamname;
}
public void setTeamname(String teamname) {
	this.teamname = teamname;
}
public int getTropies() {
	return tropies;
}
public void setTropies(int tropies) {
	this.tropies = tropies;
}
@Override
public String toString() {
	return "Domestic [teamname=" + teamname + ", tropies=" + tropies + "]";
}

}
