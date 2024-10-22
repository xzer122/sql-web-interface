package com.example.sqlite_web.model;


import jakarta.persistence.*;
import org.springframework.data.domain.Persistable;
import org.springframework.util.Assert;

import static com.example.sqlite_web.util.Util.getEffectiveClass;

@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractBaseEntity implements Persistable<Integer> {
    public static final int START_SEQUENCE = 100_000;

    @Id
    @SequenceGenerator(name="global_seq", sequenceName = "global_seq", allocationSize=1, initialValue = START_SEQUENCE)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq")
    private Integer id;

    public AbstractBaseEntity() {}

    public AbstractBaseEntity(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int id(){
        Assert.notNull(id, "Entity must have an id");
        return id;
    }

    @Override
    public boolean isNew() {
        return this.id == null;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [id=" + id + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getEffectiveClass(this) != getEffectiveClass(o)) return false;
        return getId() != null && getId().equals(((AbstractBaseEntity) o).getId());
    }
}
