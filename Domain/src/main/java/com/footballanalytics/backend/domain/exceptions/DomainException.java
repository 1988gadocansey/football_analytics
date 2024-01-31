package com.footballanalytics.backend.domain.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DomainException extends Throwable {
    public DomainException(String message) {

    }
}