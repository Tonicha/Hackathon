package org.academiadecodigo.tropadelete.foxtrot.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CustomerDto {
    private Integer id;

    @NotNull(message = "You need to type a username!")
    @NotBlank(message = "You need to type a username!")
    @Size(min = 3, max = 30, message = "Invalid number of characters.")
    private String username;


    @NotNull(message = "You need to type an email!")
    @NotBlank(message = "You need to type an email!")
    @Email
    private String email;

    @NotNull(message = "Your password must not be blank.")
    @NotBlank(message = "Your password must not be blank")
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
