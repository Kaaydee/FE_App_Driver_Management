package project.api.drivers.ultis.validation;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.checkerframework.common.value.qual.StringVal;

public class CreateDriver{

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "CCCD is required")
    @Pattern(regexp = "\\d{12}", message = "CCCD must be exactly 12 digits")
    private String cccd;

    @NotBlank(message = "License is required")
    @Pattern(regexp = "^(A1|A2|B1|B2|C1|C2|C|D|E|F|)$", message = "License must be one of the following: A1, A2, B1, B2, C1, C2")
    private String license;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Phone number is invalid")
    private String phone_number;

    @NotBlank(message = "Email is required")
    @Email(message = "Email is invalid")
    private String email;

    @NotBlank(message = "Year Of Birth is required")
    @Pattern(regexp = "^\\d{4}$", message = "Year of Birth must be exactly 4 digits")
    private String yearOfBirth;

    @NotBlank(message = "Gender is required")
    @Pattern(regexp = "^(Nam|Nu)$")
    private String gender;

    public CreateDriver() {
    }

    public CreateDriver(String yearOfBirth,String gender,String address, String cccd, String license, String name, String phone_number, String email) {
        this.address = address;
        this.cccd = cccd;
        this.license = license;
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
