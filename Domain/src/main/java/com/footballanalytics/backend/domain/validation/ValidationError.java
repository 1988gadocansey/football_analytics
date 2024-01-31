package com.footballanalytics.backend.domain.validation;
import lombok.EqualsAndHashCode;
import lombok.Value;



public record ValidationError(String path, String fieldName, Object expectedValue, Object actualValue, String reason) {
}
