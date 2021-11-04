package com.geruman.memento;

public class BattleMemento {
	public int allies;
	public int foes;
	public int wins;
	public int loses;
	
	public int getAllies() {
		return allies;
	}
	public void setAllies(int allies) {
		this.allies = allies;
	}
	public int getFoes() {
		return foes;
	}
	public void setFoes(int foes) {
		this.foes = foes;
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
	public BattleMemento(BattleOriginator battleOriginator) {
		this.wins = battleOriginator.getWins();
		this.allies = battleOriginator.getAllies();
		this.foes = battleOriginator.getFoes();
		this.loses = battleOriginator.getLoses();
	}

}
