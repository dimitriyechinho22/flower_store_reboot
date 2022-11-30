package ua.edu.ucu.apps.l4.users;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    private UserRepository userRepository;
    public List<MyUser> getUsers() {
        return userRepository.findAll();
    }

    public void addUser(MyUser user) {
        if (userRepository.findByEmail(user.getEmail()).isEmpty()) {
            userRepository.save(user);
        }
    }
}
