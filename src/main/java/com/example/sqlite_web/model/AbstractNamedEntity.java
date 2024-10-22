package com.example.sqlite_web.model;


import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@MappedSuperclass
public abstract class AbstractNamedEntity extends AbstractBaseEntity{

    @NotBlank
    @Size(min = 2, max = 128)
    @Column(name = "name", nullable = false)
    private String name;

    public AbstractNamedEntity(Integer id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + '(' + name + ')';
    }
}
