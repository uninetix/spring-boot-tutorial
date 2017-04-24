package com.example.domain;

/**
 * Created by Rodzice on 22.04.2017.
 */
public class Department {
    private int dapartmantId;
    private String name;

    public int getDapartmantId() {
        return dapartmantId;
    }

    public void setDapartmantId(int dapartmantId) {
        this.dapartmantId = dapartmantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dapartmantId=" + dapartmantId +
                ", name='" + name + '\'' +
                '}';
    }
}
