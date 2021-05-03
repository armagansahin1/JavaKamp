package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Sale;

public class SaleManager implements SaleService{
    Campaign campaign;
    public SaleManager() {
    	
    }
	public SaleManager(Campaign campaign) {
		
		this.campaign = campaign;
	}
	@Override
	public void addSale(Sale sale) {
		
		System.out.println("Oyuncu ismi : "+sale.gamer.firstName+" "+sale.gamer.lastName);
		System.out.println("Oyun adý : "+sale.game.Name);
		System.out.println("Fiyat : "+sale.game.price);
		System.out.println("Kullanýlan kampanya : "+sale.campaign.campaignName);
		System.out.println("******Satýn Alýndý************");
	}

}
