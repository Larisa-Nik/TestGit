

import java.util.ArrayList;
import java.util.List;

public class FarmSimulator {
	public static void main(String [] args) {
		Farm11 farm = new Farm11(2);
		Farm11 farm111 = new Farm11(12);
		Cow11 cow=new Cow11("Zorka");
		Cow11 cow1=new Cow11("Masha");

		System.out.println(farm.checkPlace());
		System.out.println(farm111.checkPlace());
		System.out.println(farm.kolCow());
		//1 написати метод в класі Farm який би вертав boolean чи корова може війти на ферму
		//  залежності від того чи заповнена ферма повністю чи ще є місце

		//2 написати метод в класі Farm який би вертав int кількість корів зараз на фермі
	}
}

class Farm11 {
	private List<Cow11> cows;
	private int capacity; // максимальна допустима кількість корів на фермі

	public Farm11(int capacity) {
		this.cows = new ArrayList<>();
		this.capacity = capacity;
	}

	public int kolCow(){
		capacity=this.cows.size();
		System.out.println(capacity);
		return capacity ;
	}

	public boolean checkPlace(){
		if (this.cows.size()>=this.capacity){return false;}
		else return true;
	}



	public void cowEnter(Cow11 cow) {
		this.cows.add(cow);
		System.out.println(this.cows.get(0).name);
	}

	public void cowExit(Cow11 cow) {
		this.cows.remove(cow);
	}
}

class Cow11 {
	 String name;

	public Cow11(String name) {

		this.name = name;
	}
}
