package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDal implements UserDao{
	
    List<User> users=new ArrayList<User>();
	@Override
	public void add(User user) {
		System.out.println("Kullanýcý Kaydedildi : Hibernate");
	    users.add(user);
		
	}
	@Override
	public List<User> getAll() {
		
		return users;
	}
	@Override
	public User get(Predicate<? super User> predicate) {
		
		
		
		var user=  users.stream().filter(predicate).iterator().hasNext() ? users.stream().filter(predicate).iterator().next() : null;
			return user;
	}
	
	
}
