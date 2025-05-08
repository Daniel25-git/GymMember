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
        List<Gym> gyms = gymRepository.findAll();
        List<GymDto> gymDtos = gyms.stream().map(gymMapper::mapToGymDto).toList();
        return gymDtos;
    }

    @Override
    public GymDto getGymById(int id) {
        Gym gym = gymRepository.findById(id).orElseThrow(() -> new RuntimeException("Gym Member of this id does not exist"));
        //return null;
        return gymMapper.mapToGymDto(gym);
    }

    @Override
    public GymDto updateGymById(int id, GymDto gymDto) {
        Gym gym = gymRepository.findById(id).orElseThrow(() -> new RuntimeException("Gym Member of this id does not exist"));
        gym.setName(gymDto.getName());
        gym.setAddress(gymDto.getAddress());

        Gym savedGym = gymRepository.save(gym);

        return gymMapper.mapToGymDto(savedGym);
    }

    @Override
    public String deleteGymById(int id) {
        if(gymRepository.existsById(id)){
            gymRepository.deleteById(id);
            return "GYM with id " + id +" Successfully deleted";
        }
        else {
            return "No record of the id found";
        }
    }
}
