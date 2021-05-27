package java4thDayHomework2_Game.business.abstracts;

import java4thDayHomework2_Game.entities.concretes.Gamer;

public abstract class BaseGamerManager implements GamerService{

	@Override
	public void signUp(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adl� oyuncu kay�t oldu.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adl� oyuncunun bilgisi g�ncellendi.");
		
	}

	@Override
	public void deleteAccount(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adl� oyuncu silindi.");
		
	}

}
