package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.Pet;

@Getter
@AllArgsConstructor
public class MockedPet implements Pet {

    private final String id;
    private final String name;
}
