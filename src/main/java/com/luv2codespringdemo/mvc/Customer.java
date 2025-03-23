package com.luv2codespringdemo.mvc;

import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message="Is required")
    @Size(min = 1, message="Is required")
    private String lastName;

    @Min(value=0, message="Must be greater then or equal to 0")
    @Max(value=10, message="Must be lass then or equal to 10")
    private int freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 chars/digits")
    private String postalCode;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
