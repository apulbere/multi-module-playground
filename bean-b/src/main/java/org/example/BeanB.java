package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class BeanB implements GenericBean {

    private String id;
    private BigDecimal amount;
}
