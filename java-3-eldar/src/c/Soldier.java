package c;

public class Soldier {

	private int id;
	private String name;
	private Rank rank;
	private int ammunition;

	public enum Rank {
		PRIVATE, SERGENT, COLONEL, CAPTAIN, MAJOR, GENERAL;
	}

	public void shoot() {
		if (this.ammunition > 0) {
			System.out.println(this.name + " is shooting");
			this.ammunition--;
		} else {
			System.out.println(this.name + " faild shooting - no ammuntion");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public int getAmmunition() {
		return ammunition;
	}

	public void setAmmunition(int ammunition) {
		if (ammunition >= 0) {
			this.ammunition = ammunition;
		}
	}

}
