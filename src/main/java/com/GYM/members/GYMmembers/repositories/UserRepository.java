package com.GYM.members.GYMmembers.repositories;

import com.GYM.members.GYMmembers.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
