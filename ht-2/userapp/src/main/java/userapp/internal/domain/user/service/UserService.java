package userapp.internal.domain.user.service;

import java.util.List;

import userapp.internal.domain.exceptions.DomainException;
import userapp.internal.domain.usecases.User.IUserService;
import userapp.internal.domain.user.dto.CreateUser;
import userapp.internal.domain.user.dto.UpdateUser;
import userapp.internal.domain.user.model.User;

/*
    Realised User model CRUD-operations
*/

public class UserService implements IUserService {
    private IUserDAO userDAO;

    public UserService(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User createUser(CreateUser req) throws DomainException {
        userDAO.create(req);

        return new User(
            req.getId(),
            req.getName(),
            req.getEmail(),
            req.getAge(),
            req.getCreatedAt()
        );
    }

    @Override
    public User getUser(String id) throws DomainException {
        return userDAO.get(id);
    }

    @Override
    public void updateUser(UpdateUser req) throws DomainException {
        userDAO.update(req);
    }

    @Override
    public void removeUser(String id) throws DomainException {
        userDAO.removeByID(id);
    }

    @Override
    public List<User> getList(int page, int size) throws DomainException {
        return userDAO.getList(size, size*(page - 1));
    }
}
