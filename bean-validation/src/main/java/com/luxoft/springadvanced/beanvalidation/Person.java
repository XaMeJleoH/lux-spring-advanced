package com.luxoft.springadvanced.beanvalidation;

import com.luxoft.springadvanced.beanvalidation.error.validator.Adult;
import com.luxoft.springadvanced.beanvalidation.error.validator.Country;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message = "Please provide a name")
    private String name;

    @Country
    @NotEmpty(message = "Please provide a country")
    private String country;

    @NotNull(message = "Please provide a salary")
    @DecimalMin("1000.00")
    private BigDecimal salary;

    @Adult
    private Integer age;


    // avoid this "No default constructor for entity"
    public Person() {
    }

    public Person(Long id, String name, String country, BigDecimal salary, Integer age) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.salary = salary;
        this.age = age;
    }

    public Person(String name, String country, BigDecimal salary, Integer age) {
        this.name = name;
        this.country = country;
        this.salary = salary;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
