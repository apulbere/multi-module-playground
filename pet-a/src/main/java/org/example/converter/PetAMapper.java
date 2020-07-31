package org.example.converter;

import org.example.Pet;
import org.example.PetA;
import org.example.conversion.PetMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface PetAMapper extends PetMapper {

    @Override
    PetA map(Pet genericBean);
}
