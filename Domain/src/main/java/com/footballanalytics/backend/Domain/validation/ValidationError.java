package com.footballanalytics.backend.Domain.validation;


public record ValidationError(String path, String fieldName, Object expectedValue, Object actualValue, String reason) {
}
