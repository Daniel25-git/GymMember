package com.GYM.members.GYMmembers.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="first_name", nullable = false, length= 50)
    private String firstName;
    @Column(name="last_name" , nullable = false,length = 50)
    private String lastName;
    @Column(name="email", nullable = false, length = 100)
    private String email;
    @Column(name="username", nullable = false, length = 100)
    private String username;
    @Column(name="password", nullable = false)
    private String password;
    @Column(name="profile_pic_url", length = 500)
    private String profilePictureUrl;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
