package java4thDayHomework2_Game.business.concretes;

import java4thDayHomework2_Game.business.abstracts.CampaignService;
import java4thDayHomework2_Game.entities.concretes.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi : " + campaign.getCampanyName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getCampanyName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi : " + campaign.getCampanyName());
		
	}

}
