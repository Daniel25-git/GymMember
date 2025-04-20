package com.GYM.members.GYMmembers.repositories;

import com.GYM.members.GYMmembers.entities.Gym;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymRepository extends JpaRepository<Gym,Integer > {
}
