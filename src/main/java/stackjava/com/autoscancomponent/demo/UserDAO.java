package stackjava.com.autoscancomponent.demo;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

    public void findUser(int id) {
        System.out.println("find user by id = " + id);
    }

}
