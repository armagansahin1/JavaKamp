package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;


public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		
		System.out.println("Kampanya eklendi : "+campaign.campaignName);
	}

}
