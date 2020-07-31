package org.example.converter;

import org.example.Pet;
import org.example.PetB;
import org.example.conversion.PetMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface PetBMapper extends PetMapper {

    @Override
    PetB map(Pet source);
}
