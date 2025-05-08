package com.GYM.members.GYMmembers.services;

import com.GYM.members.GYMmembers.dtos.GymDto;

import java.util.List;

public interface GymService {
    GymDto createGym(GymDto gymDto);
    List<GymDto> getAllGyms();
    GymDto getGymById(int id);
    GymDto updateGymById(int id, GymDto gymDto);
    String deleteGymById(int id);
}
