package com.zachesov.spring.mvc;

import com.zachesov.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2, message = "must be min 2 symbols")
    private String name;
    @NotBlank(message = "surname isn't empty")
    private String surname;
    @Min(value = 500, message = "min salary is 500")
    @Max(value = 1000, message = "max salary is 1000")
    private int salary;
    private String department;
    private Map<String, String> departmentLabel;
    private Map<String, String> carBrands;
    private String carBrand;
    private String[] languages;
    private Map<String, String> languagesList;
    @Pattern(regexp = "[0-9]{3}-[0-9]{2}-[0-9]{2}", message = "no valid phone number, use pattern XXX-XX-XX")
    private String phoneNumber;

    @CheckEmail(value = "yandex.ru", message = "email must ends with yandex.ru")
    private String email;


    public Employee() {

        departmentLabel = new HashMap<>();
        departmentLabel.put("Information Technologies", "IT");
        departmentLabel.put("Human Resources", "HR");
        departmentLabel.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes-Benz", "MB");
        carBrands.put("BMW", "BMW");

        languagesList = new HashMap<>();
        languagesList.put("English", "EN");
        languagesList.put("Deutsch", "DE");
        languagesList.put("French", "FR");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartmentLabel() {
        return departmentLabel;
    }

    public void setDepartmentLabel(Map<String, String> departmentLabel) {
        this.departmentLabel = departmentLabel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
