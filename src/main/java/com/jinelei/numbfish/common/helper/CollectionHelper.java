package com.jinelei.numbfish.common.helper;

import com.jinelei.numbfish.common.exception.InvalidArgsException;
import org.springframework.util.ObjectUtils;

@SuppressWarnings("unused")
public class CollectionHelper {

    public static Class<?> resolveComponentClass(Object k) {
        Class<?> componentType;
        if (ObjectUtils.isEmpty(k)) {
            throw new InvalidArgsException("The type cannot be empty");
        } else if (k.getClass().isArray()) {
            componentType = k.getClass().getComponentType();
        } else {
            componentType = k.getClass();
        }
        return componentType;
    }

}
