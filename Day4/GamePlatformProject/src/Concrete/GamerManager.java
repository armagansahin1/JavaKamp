package Concrete;

import Abstract.CheckPersonService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{

	private CheckPersonService checkPersonService;
	public GamerManager(CheckPersonService checkPersonService) {
		
		this.checkPersonService = checkPersonService;
	}
	@Override
	public void addGamer(Gamer gamer) {
		
		if(this.checkPersonService.checkPerson(gamer)) {
			System.out.println("Oyuncu kaydedildi : "+gamer.firstName);
		}
		else {
			System.out.println("Kiþi bulunamadý !");
		}
		
		
	}

}
