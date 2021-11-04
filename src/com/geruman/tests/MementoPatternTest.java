package com.geruman.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.geruman.memento.BattleCareTaker;
import com.geruman.memento.BattleOriginator;

class MementoPatternTest {

	@Test
	void test() {
		BattleOriginator battleOriginator = new BattleOriginator();
		BattleCareTaker careTaker = new BattleCareTaker();
		battleOriginator.setFoes(49);
		battleOriginator.setAllies(35);
		battleOriginator.setWins(3);
		battleOriginator.setLoses(3);
		careTaker.addMemento(battleOriginator.saveMemento());
		battleOriginator.setFoes(51);
		battleOriginator.setAllies(43);
		battleOriginator.setWins(4);
		battleOriginator.setLoses(3);
		careTaker.addMemento(battleOriginator.saveMemento());
		battleOriginator.loadStateFromMemento(careTaker.getMemento(0));
		assertEquals(49,battleOriginator.getFoes());
		assert 35 == battleOriginator.getAllies();
		assert 3 == battleOriginator.getWins();
		assert 3 == battleOriginator.getLoses();
	}

}
