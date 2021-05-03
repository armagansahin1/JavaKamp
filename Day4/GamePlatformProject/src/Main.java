
import java.util.Date;

import Adapters.KPSServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Sale;

public class Main {

	public static void main(String[] args) {
		
		Game game=new Game();
	    game.id=1;
        game.Name="Assasins's Creed Valhala";
        game.price = 250;
        
        GameManager gameManager = new GameManager();
        gameManager.addGame(game);
        
        Gamer gamer = new Gamer();
        gamer.id=1;
        gamer.identityNumber="11189245922";
        gamer.firstName="armaðan";
        gamer.lastName="þahin";
        gamer.birthOfDate=new Date(1995,5,19);
        
        Gamer gamer2 = new Gamer();
        gamer2.id=2;
        gamer2.identityNumber="111111111111";
        gamer2.firstName="anýl";
        gamer2.lastName="þahin";
        gamer2.birthOfDate=new Date(1997,11,1);
     
        GamerManager gamerManager =new GamerManager(new KPSServiceAdapter());
        gamerManager.addGamer(gamer);
        gamerManager.addGamer(gamer2);
        
        Campaign campaign =new Campaign();
        campaign.id = 1;
        campaign.campaignName = "Bahar Kampanyasý";
        
        CampaignManager campaignManager=new CampaignManager();
        campaignManager.addCampaign(campaign);
        
        Sale sale=new Sale();
        sale.id=1;
        sale.game = game;
        sale.gamer = gamer;
        sale.campaign = campaign;
        
        SaleManager saleManager=new SaleManager();
        saleManager.addSale(sale);
        
        
	}

}
