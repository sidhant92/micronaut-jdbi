package com.github.sidhant92;

import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

public interface UserDao {
    @GetGeneratedKeys
    @SqlUpdate ("INSERT INTO users (name, age) VALUES (:u.name, :u.age)")
    long insert(@BindBean ("u") User user);
}
