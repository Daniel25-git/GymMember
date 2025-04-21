package com.GYM.members.GYMmembers.services.impl;

import com.GYM.members.GYMmembers.dtos.GymDto;
import com.GYM.members.GYMmembers.entities.Gym;
import com.GYM.members.GYMmembers.mappers.GymMapper;
import com.GYM.members.GYMmembers.repositories.GymRepository;
import com.GYM.members.GYMmembers.services.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GymServiceImpl implements GymService {
    @Autowired
    private GymRepository gymRepository;
    @Autowired
    private GymMapper gymMapper;

    @Override
    public GymDto createGym(GymDto gymDto) {
        Gym gym = gymMapper.mapToMapper(gymDto);
        Gym savedGym = gymRepository.save(gym);
        GymDto output = gymMapper.mapToGymDto(savedGym);
        return output;
    }

    @Override
    public List<GymDto> getAllGyms() {
        return List.of();
    }

    @Override
    public GymDto getGymById(int id) {
        return null;
    }

    @Override
    public GymDto updateGymById(int id) {
        return null;
    }

    @Override
    public String deleteGymById(int id) {
        return "";
    }
}
