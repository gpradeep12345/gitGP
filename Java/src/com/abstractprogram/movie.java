package com.abstractprogram;

public class movie extends Trailer {

	

	@Override
	public void guestRole() {
		System.out.println("chris evans");
		
	}

	@Override
	public void twist() {
		System.out.println("thanos wipe the half universe in single snap");
			
	}
	public static void main(String[] args) {
		movie m = new movie();
		m.actor();
		m.movieName();
		m.guestRole();
		m.twist();
	}

}
