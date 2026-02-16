package userapp.internal.controllers.cli;

import java.util.List;

import userapp.internal.domain.exceptions.DomainException;
import userapp.internal.domain.usecases.User.dto.CreateUserInput;
import userapp.internal.domain.usecases.User.dto.UpdateUserInput;
import userapp.internal.domain.user.model.User;

public interface IUserUC {
    public User createUser(CreateUserInput req) throws DomainException;

    public void updateUser(UpdateUserInput req) throws DomainException;

    public void removeUser(String id) throws DomainException;

    public List<User> pagination(int page, int size) throws DomainException;
}
