package com.geruman;

import com.geruman.memento.BattleCareTaker;
import com.geruman.memento.BattleOriginator;

public class MementoDemoMain {

	public static void main(String[] args) {
		BattleOriginator battle = new BattleOriginator();
		BattleCareTaker careTaker = new BattleCareTaker();
		battle.setAllies(5);
		battle.setFoes(10);
		battle.setLoses(10);
		battle.setWins(12);
		System.out.println(battle);
		careTaker.addMemento(battle.saveMemento());
		battle.setAllies(2);
		battle.setFoes(8);
		battle.setLoses(1);
		battle.setWins(0);
		System.out.println(battle);
		careTaker.addMemento(battle.saveMemento());
		battle.setAllies(235);
		battle.setFoes(104);
		battle.setLoses(120);
		battle.setWins(125);
		System.out.println(battle);
		careTaker.addMemento(battle.saveMemento());
		System.out.println("Cargando primer memento");
		battle.loadStateFromMemento(careTaker.getMemento(0));
		System.out.println(battle);
		System.out.println("Cargando segundo memento");
		battle.loadStateFromMemento(careTaker.getMemento(1));
		System.out.println(battle);
		System.out.println("Cargando tercer memento");
		battle.loadStateFromMemento(careTaker.getMemento(2));
		System.out.println(battle);
		System.out.println("Cargando primer memento");
		battle.loadStateFromMemento(careTaker.getMemento(0));
		System.out.println(battle);
	}
}
