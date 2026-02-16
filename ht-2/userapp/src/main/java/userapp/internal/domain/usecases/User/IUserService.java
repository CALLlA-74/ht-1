package userapp.internal.domain.usecases.User;

import java.util.List;

import userapp.internal.domain.exceptions.DomainException;
import userapp.internal.domain.user.dto.CreateUser;
import userapp.internal.domain.user.dto.UpdateUser;
import userapp.internal.domain.user.model.User;

public interface IUserService {
    public User createUser(CreateUser req) throws DomainException;
    public User getUser(String id) throws DomainException;
    public void updateUser(UpdateUser req) throws DomainException;
    public void removeUser(String id) throws DomainException;
    public List<User> getList(int page, int size) throws DomainException;
}
