package com.example.sqlite_web.model;


import jakarta.persistence.*;
import org.springframework.data.domain.Persistable;
import org.springframework.util.Assert;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import static com.example.sqlite_web.util.Util.getEffectiveClass;
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractEntity implements Persistable<Integer> {
    public static final int START_SEQUENCE = 100_000;

    @Id
    @SequenceGenerator(name="global_seq", sequenceName = "global_seq", allocationSize=1, initialValue = START_SEQUENCE)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq")
    private Integer id;

    @NotBlank
    @Size(min = 2, max = 128)
    @Column(name = "name", nullable = false)
    private String name;

    public AbstractEntity() {}

    public AbstractEntity(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return getClass().getSimpleName() + " [id=" + id + " name=" + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getEffectiveClass(this) != getEffectiveClass(o)) return false;
        return getId() != null && getId().equals(((AbstractEntity) o).getId());
    }
}
