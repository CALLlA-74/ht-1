package userapp.internal.domain.usecases.User.dto;

public class UpdateUserInput {
    private String id;
    private String name;
    private String email; 
    private Integer age;

    public UpdateUserInput(String id, String name, String email, Integer age){
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
