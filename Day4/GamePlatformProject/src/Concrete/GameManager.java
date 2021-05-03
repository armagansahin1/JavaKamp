package Concrete;
import Abstract.GameService;
import Entities.Game;
public class GameManager implements GameService{

	@Override
	public void addGame(Game game) {
		
		System.out.println("Oyun eklendi : " + game.Name);
		
	}

}
