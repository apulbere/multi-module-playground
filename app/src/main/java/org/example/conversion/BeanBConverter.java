package org.example.conversion;

import org.example.BeanB;
import org.example.GenericBean;
import org.example.domain.dto.DtoBean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BeanBConverter implements Converter<DtoBean, GenericBean> {

    @Override
    public BeanB convert(DtoBean dtoBean) {
        return new BeanB();
    }
}
