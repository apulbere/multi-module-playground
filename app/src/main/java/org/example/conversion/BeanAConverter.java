package org.example.conversion;

import org.example.BeanA;
import org.example.GenericBean;
import org.example.domain.dto.DtoBean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BeanAConverter implements Converter<DtoBean, GenericBean> {

    @Override
    public GenericBean convert(DtoBean dtoBean) {
        return new BeanA();
    }
}
