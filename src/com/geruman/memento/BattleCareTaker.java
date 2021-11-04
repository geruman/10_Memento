package com.geruman.memento;

import java.util.ArrayList;
import java.util.List;

public class BattleCareTaker {

	private List<BattleMemento> mementos;
	 public BattleCareTaker() {
		mementos = new ArrayList<BattleMemento>();
	}
	public void addMemento(BattleMemento saveMemento) {
		mementos.add(saveMemento);
		
	}

	public BattleMemento getMemento(int i) {
		return mementos.get(i);
	}

}
