package java4thDayHomework2_Game;

import java4thDayHomework2_Game.adapters.MernisServiceAdapter;
import java4thDayHomework2_Game.business.abstracts.BaseGamerManager;
import java4thDayHomework2_Game.business.concretes.CampaignManager;
import java4thDayHomework2_Game.business.concretes.GamerManager;
import java4thDayHomework2_Game.business.concretes.SalesManager;
import java4thDayHomework2_Game.entities.concretes.Campaign;
import java4thDayHomework2_Game.entities.concretes.Game;
import java4thDayHomework2_Game.entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer();
		gamer1.setId(5);
		gamer1.setNationalityId("1234567");
		gamer1.setFirstName("Kevser");
		gamer1.setLastName("Önal");
		gamer1.setDateOfBirth(2000);
		
		Campaign campaign1 = new Campaign(10, "Þirinler", 25);
		
		Game game1 = new Game(15, "Pine", 40, "Bir þey");
		
		BaseGamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		CampaignManager campaignManager = new CampaignManager();
		SalesManager salesManager = new SalesManager();
		
		gamerManager.deleteAccount(gamer1);
		gamerManager.signUp(gamer1);
		campaignManager.add(campaign1);
		salesManager.saleWithCampaign(game1, gamer1, campaign1);

	}

}
