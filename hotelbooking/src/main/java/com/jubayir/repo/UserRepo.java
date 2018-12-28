package com.jubayir.repo;


import com.jubayir.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByMobile(String mobile);
    User findByUserName(String userName);
    User findByUserNameAndPassword(String userName, String password);
    Optional<User> findByUserNameOrEmail(String userName, String email);
}
