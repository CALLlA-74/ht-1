package userapp.internal.domain.user.dto;

import java.time.LocalDateTime;

public class CreateUser {
    private String id;
    private String name;
    private String email; 
    private Integer age;
    private LocalDateTime createdAt;

    public CreateUser(String id, String name, String email, Integer age, LocalDateTime createdAt){
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
