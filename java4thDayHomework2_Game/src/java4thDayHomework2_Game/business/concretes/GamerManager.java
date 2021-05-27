package java4thDayHomework2_Game.business.concretes;

import java4thDayHomework2_Game.adapters.GamerCheckService;
import java4thDayHomework2_Game.business.abstracts.BaseGamerManager;
import java4thDayHomework2_Game.entities.concretes.Gamer;

public class GamerManager extends BaseGamerManager{
	
	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void signUp(Gamer gamer) {

		if(gamerCheckService.checkIfRealPerson(gamer)) {
			super.signUp(gamer);
		}else {
			System.out.println("Not a valid person.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu bilgileri güncellendi : " + gamer.getFirstName());
		
	}

	@Override
	public void deleteAccount(Gamer gamer) {
		System.out.println("Oyuncu silindi : " + gamer.getFirstName());
		
	}

}
