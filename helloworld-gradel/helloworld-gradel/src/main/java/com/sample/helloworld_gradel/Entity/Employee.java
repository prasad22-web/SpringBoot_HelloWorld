package com.Helloworld.spring.Entity;

import jakarta.persistence.*;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
    private int empId;
    @Column(name="name")
    private String empName;

    public Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}


