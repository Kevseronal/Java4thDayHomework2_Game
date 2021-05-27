package java4thDayHomework2_Game.business.abstracts;

import java4thDayHomework2_Game.entities.concretes.Gamer;

public abstract class BaseGamerManager implements GamerService{

	@Override
	public void signUp(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adlý oyuncu kayýt oldu.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adlý oyuncunun bilgisi güncellendi.");
		
	}

	@Override
	public void deleteAccount(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adlý oyuncu silindi.");
		
	}

}
