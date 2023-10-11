package lista7;

import java.util.ArrayList;

public class Desktop extends Produto {
	private Boolean gamer;
	private ArrayList <String> pecas = new ArrayList <String> (2);
	
	public Boolean getGamer() {
		return gamer;
	}
	public void setGamer(Boolean gamer) {
		this.gamer = gamer;
	}
	public ArrayList <String> getPecas() {
		return pecas;
	}
	public void setPecas(ArrayList <String> pecas) {
		this.pecas = pecas;
	}
}
