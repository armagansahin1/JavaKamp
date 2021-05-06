package dataAccess.abstracts;

import java.util.List;
import java.util.function.Predicate;

import entities.concretes.User;

public interface UserDao {

	void add(User user);
	List<User> getAll();
	User get(Predicate<? super User> predicate);
}
