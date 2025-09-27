package org.example.reportservice.db.user;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void save(User user) throws UsernameAlreadyExistsException {
        if(isUsernameExist(user.getUsername())) throw new UsernameAlreadyExistsException();
    }

    @Transactional
    public Optional<User> getUserById(String username) {
        try {
            User user = entityManager.createQuery("SELECT u FROM users u WHERE u.username =: username", User.class)
                    .setParameter("username", username)
                    .getSingleResult();
            return Optional.of(user);
        } catch (Exception ex) {
            return Optional.empty();
        }
    }

    private boolean isUsernameExist(String username) {
        Long count = entityManager.createQuery("SELECT COUNT(u) FROM users u WHERE u.username =: username", Long.class)
                .setParameter("username", username)
                .getSingleResult();
        return count > 0;
    }
}
