package balldeath;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	 private final AtomicInteger counter = new AtomicInteger(0);

	 private final AtomicReferenceArray<User> users= new AtomicReferenceArray<User>(new User[50]);
	 
	    @RequestMapping("/enter")
	    public User createUser() {
	        
			Random rand = new Random();
			User user = new User(rand.nextInt(), rand.nextInt(), 1, counter.getAndIncrement());
			users.set(counter.get(), user);
			
	        return user;
	    }
	    
	    @RequestMapping("/users")
	    public ArrayList<User> getUsers(){
	    	ArrayList<User> returnedUsers = new ArrayList<User>();
	    	for (int i = 0; i<users.length(); i++) {
				returnedUsers.add(users.get(i));
			};
			return returnedUsers;
	    }

}
