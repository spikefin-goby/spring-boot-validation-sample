package com.example.validationtest.validationtest;

import javax.validation.constraints.NotBlank;

class PersonForm {

    @NotBlank(message = "{notblank}")
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person(Name: " + this.name + ")";
    }
}
