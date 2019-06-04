package mainapp;

import java.util.HashMap;

public class Map {

	private HashMap<Integer, String> myMap = new HashMap<>();
	private int counter = 0;

	public HashMap<Integer, String> getMap() {
		return myMap;
	}

	public void setMap(HashMap<Integer, String> myMap) {
		this.myMap = myMap;
	}

	public void addToMap(String str) {
		myMap.put(counter, str);
		counter++;
	}

	public void removeFromMap(int k) {
		myMap.remove(k);
	}

}
