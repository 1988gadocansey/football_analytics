package com.footballanalytics.backend.Domain.valueobjects;

import com.footballanalytics.backend.Domain.commons.ValueObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter

public class PlayerName extends ValueObject {
    private final String firstName;
    private final String lastName;
    private final String otherNames;
    public static PlayerName create(String firstName, String lastName, String otherNames) {
        return new PlayerName(firstName, lastName, otherNames);
    }
    @Override
    protected List<Object> getEqualityComponents() {
        return  null;
        //return Iterable.of(firstName, lastName, otherNames);
    }
}

