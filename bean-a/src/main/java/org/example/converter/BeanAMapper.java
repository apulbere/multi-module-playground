package org.example.converter;

import org.example.BeanA;
import org.example.GenericBean;
import org.example.conversion.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface BeanAMapper extends GenericMapper {

    @Override
    BeanA map(GenericBean genericBean);
}
