package c;

import java.util.Arrays;
import java.util.Scanner;

import c.Soldier.Rank;

public class Tar4Soldier {

	public static void main(String[] args) {

		Soldier soldier = new Soldier();

		Scanner sc = new Scanner(System.in);

		System.out.print("enter id: ");
		soldier.setId(sc.nextInt());
		sc.nextLine();

		System.out.print("enter name: ");
		soldier.setName(sc.nextLine());

		System.out.print("enter rank " + Arrays.toString(Rank.values()) + ": ");
		soldier.setRank(Rank.valueOf(sc.nextLine()));

		System.out.print("enter ammunition: ");
		soldier.setAmmunition(sc.nextInt());

		System.out.println("======= soldier details:");
		System.out.println("id: " + soldier.getId());
		System.out.println("name: " + soldier.getName());
		System.out.println("rank: " + soldier.getRank());
		System.out.println("ammunition: " + soldier.getAmmunition());
		System.out.println("=======================");

		soldier.shoot();
		soldier.shoot();
		soldier.shoot();
		soldier.shoot();
		soldier.shoot();

		sc.close();
	}

}
