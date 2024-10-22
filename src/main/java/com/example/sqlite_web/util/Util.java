package com.example.sqlite_web.util;

import org.hibernate.proxy.HibernateProxy;

public class Util {
    private Util() {
    }

    public static Class<?> getEffectiveClass(Object o) {
        return o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
    }
}
