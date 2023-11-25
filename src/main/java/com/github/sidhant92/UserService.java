package com.github.sidhant92;

import org.jdbi.v3.core.Jdbi;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.transaction.Transactional;

@Singleton
public class UserService {
    @Inject
    private Jdbi jdbi;

    @Transactional
    public User create(final User user) {
        final long id = this.jdbi.withExtension(UserDao.class, dao -> dao.insert(user));
        user.setId(id);
        return user;
    }
}
