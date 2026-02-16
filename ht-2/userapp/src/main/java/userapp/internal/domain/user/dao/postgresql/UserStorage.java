package userapp.internal.domain.user.dao.postgresql;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import userapp.internal.domain.user.dto.CreateUser;
import userapp.internal.domain.user.dto.UpdateUser;
import userapp.internal.domain.user.model.User;

@Entity
@Table(name = "USERS")
public class UserStorage {
    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
    
    @Column(name = "age")
    private Integer age;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public UserStorage() {}

    public UserStorage(String id, String name, String email, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.createdAt = createdAt;
    }

    public UserStorage setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public UserStorage setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserStorage setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserStorage setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public UserStorage setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public User toDomain() {
        return new User(id, name, email, age, createdAt);
    }

    public static UserStorage create(CreateUser req) {
        return new UserStorage()
            .setId(req.getId())
            .setName(req.getName())
            .setEmail(req.getEmail())
            .setAge(req.getAge());
    }

    public UserStorage update(UpdateUser req) {
        this.name = req.getName();
        this.email = req.getEmail();
        this.age = req.getAge();
        return this;
    }
}