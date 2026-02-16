package userapp.internal.domain.user.service;

import java.util.List;

import userapp.internal.domain.exceptions.DomainException;
import userapp.internal.domain.user.dto.CreateUser;
import userapp.internal.domain.user.dto.UpdateUser;
import userapp.internal.domain.user.model.User;

public interface IUserDAO {
    public void create(CreateUser req) throws DomainException;
    public User get(String id) throws DomainException;
    public void update(UpdateUser req) throws DomainException;
    public void removeByID(String id) throws DomainException;
    public List<User> getList(int limit, int offset) throws DomainException;
}
