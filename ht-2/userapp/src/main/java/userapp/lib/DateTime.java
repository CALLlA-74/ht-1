package userapp.lib;

import java.time.LocalDateTime;

import userapp.internal.domain.usecases.User.IDateTime;

public class DateTime implements IDateTime{

    @Override
    public LocalDateTime now() {
        return LocalDateTime.now();
    }
}
