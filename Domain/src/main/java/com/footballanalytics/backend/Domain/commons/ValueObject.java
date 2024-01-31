package com.footballanalytics.backend.Domain.commons;

import java.util.List;
import java.util.Objects;

public abstract class ValueObject {

    protected abstract List<Object> getEqualityComponents();

    public static boolean equalOperator(ValueObject left, ValueObject right) {
        if (left == null ^ right == null) {
            return false;
        }

        return left == null || left.equals(right);
    }

    protected static boolean notEqualOperator(ValueObject left, ValueObject right) {
        return !equalOperator(left, right);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        ValueObject that = (ValueObject) obj;

        List<Object> leftEqualityComponents = getEqualityComponents();
        List<Object> rightEqualityComponents = that.getEqualityComponents();

        if (leftEqualityComponents.size() != rightEqualityComponents.size()) {
            return false;
        }

        for (int i = 0; i < leftEqualityComponents.size(); i++) {
            if (!Objects.equals(leftEqualityComponents.get(i), rightEqualityComponents.get(i))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(getEqualityComponents().toArray());
    }
}
