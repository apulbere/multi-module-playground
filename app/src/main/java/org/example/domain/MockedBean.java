package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.GenericBean;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class MockedBean implements GenericBean {

    private final String id;
    private final BigDecimal amount;
}
