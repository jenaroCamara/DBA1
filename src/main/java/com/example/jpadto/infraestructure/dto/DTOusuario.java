package com.example.jpadto.infraestructure.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


public record DTOusuario(int id, String usuario, String password, String name, String surname, String company_email, String personal_email,
                        String city, boolean active, Date created_date, String imagen_url, Date termination_date) {
    @Override
    public int id() {
        return id;
    }

    @Override
    public String usuario() {
        return usuario;
    }

    @Override
    public String password() {
        return password;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String surname() {
        return surname;
    }

    @Override
    public String company_email() {
        return company_email;
    }

    @Override
    public String personal_email() {
        return personal_email;
    }

    @Override
    public String city() {
        return city;
    }

    @Override
    public boolean active() {
        return active;
    }

    @Override
    public Date created_date() {
        return created_date;
    }

    @Override
    public String imagen_url() {
        return imagen_url;
    }

    @Override
    public Date termination_date() {
        return termination_date;
    }
}
