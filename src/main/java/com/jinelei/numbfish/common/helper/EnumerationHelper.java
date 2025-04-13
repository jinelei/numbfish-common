package com.jinelei.numbfish.common.helper;

import org.springframework.util.ObjectUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class EnumerationHelper<E extends Enum<E>> {

    public static <E extends Enum<E>> Boolean isValidValue(Class<E> clazz, Object value) {
        if (ObjectUtils.isEmpty(value)) {
            return false;
        }
        for (E e : clazz.getEnumConstants()) {
            switch (value) {
                case String s -> {
                    if (e.name().equalsIgnoreCase(s)) {
                        return true;
                    }
                }
                case Byte b -> {
                    if (e.ordinal() == b) {
                        return true;
                    }
                }
                case Short i -> {
                    if (e.ordinal() == i) {
                        return true;
                    }
                }
                case Integer i -> {
                    if (e.ordinal() == i) {
                        return true;
                    }
                }
                case Long l -> {
                    if (e.ordinal() == l.intValue()) {
                        return true;
                    }
                }
                case Float v -> {
                    if (e.ordinal() == v.intValue()) {
                        return true;
                    }
                }
                case Double v -> {
                    if (e.ordinal() == v.intValue()) {
                        return true;
                    }
                }
                default -> {
                    return false;
                }
            }
        }
        return false;
    }

    public static <E extends Enum<E>> E parseFrom(Class<E> clazz, Object value) {
        if (!EnumerationHelper.isValidValue(clazz, value)) {
            throw new IllegalArgumentException("value can not be null");
        }
        for (E state : clazz.getEnumConstants()) {
            switch (value) {
                case String s -> {
                    if (state.name().equalsIgnoreCase(s)) {
                        return state;
                    }
                }
                case Byte b -> {
                    if (state.ordinal() == b) {
                        return state;
                    }
                }
                case Short i -> {
                    if (state.ordinal() == i) {
                        return state;
                    }
                }
                case Integer i -> {
                    if (state.ordinal() == i) {
                        return state;
                    }
                }
                case Long l -> {
                    if (state.ordinal() == l.intValue()) {
                        return state;
                    }
                }
                case Float v -> {
                    if (state.ordinal() == v.intValue()) {
                        return state;
                    }
                }
                case Double v -> {
                    if (state.ordinal() == v.intValue()) {
                        return state;
                    }
                }
                case null, default -> throw new IllegalArgumentException("value type error");
            }
        }
        throw new IllegalArgumentException("value type not support");
    }

    public static <E extends Enum<E>> List<String> fields(Class<E> clazz) {
        return Arrays.stream(clazz.getEnumConstants()).map(Enum::name).collect(Collectors.toList());
    }
}
