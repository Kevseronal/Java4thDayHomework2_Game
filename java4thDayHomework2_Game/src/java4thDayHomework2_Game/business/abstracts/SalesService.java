package java4thDayHomework2_Game.business.abstracts;

import java4thDayHomework2_Game.entities.concretes.Campaign;
import java4thDayHomework2_Game.entities.concretes.Game;
import java4thDayHomework2_Game.entities.concretes.Gamer;

public interface SalesService {

	void sale(Game game, Gamer gamer);
	void saleWithCampaign(Game game, Gamer gamer, Campaign campaign);
}
