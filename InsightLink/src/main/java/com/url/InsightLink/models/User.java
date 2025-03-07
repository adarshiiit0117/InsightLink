package com.url.InsightLink.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String username;
    private String password;
    private String role = "ROLE_USER";

    // ✅ Explicit Getters (Lombok sometimes fails)
 /* //  public Long getId() {
       // return id;
   // }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }*/
}
