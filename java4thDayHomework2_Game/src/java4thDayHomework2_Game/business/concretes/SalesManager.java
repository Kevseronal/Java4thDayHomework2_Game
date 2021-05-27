package java4thDayHomework2_Game.business.concretes;

import java4thDayHomework2_Game.business.abstracts.SalesService;
import java4thDayHomework2_Game.entities.concretes.Campaign;
import java4thDayHomework2_Game.entities.concretes.Game;
import java4thDayHomework2_Game.entities.concretes.Gamer;

public class SalesManager implements SalesService{

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adl� kullan�c� i�in " + game.getName() + " oyunu " + game.getUnitPrice() + " fiyatla al�nd�.");
		
	}

	@Override
	public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		
		double newPrice = game.getUnitPrice() - ((game.getUnitPrice() * campaign.getPercentAgeDiscount()) / 100);
		
		System.out.println(gamer.getFirstName() + " adl� kullan�c� i�in " + game.getName() + " oyunu " + campaign.getCampanyName() + " kampanyas� ile "
				+ newPrice + " fiyatla al�nd�.");
		
	}

 }
