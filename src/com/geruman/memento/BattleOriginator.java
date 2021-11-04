package com.geruman.memento;

public class BattleOriginator {
	private int foes;
	private int allies;
	private int wins;
	private int loses;

	public BattleMemento saveMemento() {
		return new BattleMemento(this);
	}

	public void loadStateFromMemento(BattleMemento memento) {
		this.foes = memento.getFoes();
		this.allies = memento.getAllies();
		this.loses = memento.getLoses();
		this.wins = memento.getWins();
		
	}

	public int getFoes() {
		return foes;
	}

	public void setFoes(int foes) {
		this.foes = foes;
	}

	public int getAllies() {
		return allies;
	}

	public void setAllies(int allies) {
		this.allies = allies;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLoses() {
		return loses;
	}

	public void setLoses(int loses) {
		this.loses = loses;
	}
	@Override
	public String toString() {
		return "|Resumen de la lucha|\n[Aliados: "+allies+" Enemigos: "+foes+"]\n[Combates vencidos: "+wins+" Combates perdidos: "+loses+"]";
	}

	

}
