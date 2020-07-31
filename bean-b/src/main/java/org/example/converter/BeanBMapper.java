package org.example.converter;

import org.example.BeanB;
import org.example.GenericBean;
import org.example.conversion.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface BeanBMapper extends GenericMapper {

    @Override
    BeanB map(GenericBean source);
}
