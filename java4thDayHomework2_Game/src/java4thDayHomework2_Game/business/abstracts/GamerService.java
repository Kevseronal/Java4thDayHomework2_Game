package java4thDayHomework2_Game.business.abstracts;

import java4thDayHomework2_Game.entities.concretes.Gamer;

public interface GamerService {

	void signUp(Gamer gamer);
	void update(Gamer gamer);
	void deleteAccount(Gamer gamer);
}
