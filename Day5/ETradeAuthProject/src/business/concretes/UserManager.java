package business.concretes;

import java.util.List;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;

import entities.concretes.User;

public class UserManager implements UserService{
    private UserDao userDao;
	public UserManager(UserDao userDao) {
		
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		
		this.userDao.add(user);
	}

	@Override
	public List<User> getAll() {
		
		return this.userDao.getAll();
	}

	@Override
	public User get(User user) {
		
	  return this.userDao.get(u->u==user);
	}

	@Override
	public User getByMail(String email) {
		
	  return this.userDao.get(u->u.email==email);	
	}

}
