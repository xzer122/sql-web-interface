package com.example.sqlite_web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = 'users')
public class User extends AbstractEntity{

    private int id;

    private String email;

    private String password;

    private boolean enabled;

    private Date registrationDate;

    private Set<Role> roles;

    public User() {}

    public User(User u) {
        this(u.id, u.email, u.password, u.enabled, u.registrationDate, u.roles);
    }

    public User(Integer id, String email, String password, boolean enabled, Date registrationDate, Set<Role> roles) {
        super(id, email);
        this.password = password;
        this.enabled = enabled;
        this.registrationDate = registrationDate;
        setRoles(roles);
    }

     public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", registrationDate=" + registrationDate +
                ", roles=" + roles +
                '}';
    }
}
