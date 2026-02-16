package userapp.lib;

import java.util.UUID;

import userapp.internal.domain.usecases.User.IUUIDGenerator;

public class UUIDGenerator implements IUUIDGenerator {

    @Override
    public String genUUIDString() {
        return UUID.randomUUID().toString();
    }
    
}
