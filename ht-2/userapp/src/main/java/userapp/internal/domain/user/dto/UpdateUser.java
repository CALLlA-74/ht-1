package userapp.internal.domain.user.dto;

public class UpdateUser {
    private String id;
    private String name;
    private String email; 
    private Integer age;

    public UpdateUser(String id, String name, String email, Integer age){
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
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
}
