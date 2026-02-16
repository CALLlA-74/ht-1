package userapp.internal.domain.usecases.User.dto;

public class CreateUserInput {
    private String name;
    private String email; 
    private Integer age;

    public CreateUserInput(String name, String email, Integer age){
        this.name = name;
        this.email = email;
        this.age = age;
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
