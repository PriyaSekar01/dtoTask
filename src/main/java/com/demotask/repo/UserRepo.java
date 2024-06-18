package com.demotask.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demotask.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
