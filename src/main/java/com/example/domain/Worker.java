package com.example.domain;

import javax.persistence.*;

/**
 * Created by Rodzice on 22.04.2017.
 */

@Entity
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "worker_id")
    private int workerId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "salary")
    private float salary;
    @Column(name = "department_id")
    private int departmentID;
    @Column(name = "role")
    private int role;

    public Worker() {
        //this.workerId = -1;
        this.firstName = "";
        this.lastName = "";
        this.salary = 0;
        this.departmentID = -1;
        this.role = -1;
    }

    public Worker(int workerId, String firstName, String lastName, float salary, int departmentID, int role) {
        this.workerId = workerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.departmentID = departmentID;
        this.role = role;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workerId=" + workerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", departmentID=" + departmentID +
                ", role=" + role +
                '}';
    }
}
