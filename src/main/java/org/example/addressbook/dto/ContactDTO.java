package org.example.addressbook.dto;

public class ContactDTO {
    private String name;
    private String phone;

    public ContactDTO() {
    }

    public ContactDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
