package com.footballanalytics.backend.Domain.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DomainException extends Throwable {
    public DomainException(String message) {

    }
}