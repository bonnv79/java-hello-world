package stackjava.com.autoscancomponent.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service1")
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public void findUser(int id) {
        System.out.println("userService find:");
        userDAO.findUser(id);
    }

}
