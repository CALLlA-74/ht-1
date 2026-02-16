package userapp.cmd;

import userapp.internal.controllers.cli.ConsloleInterface;
import userapp.internal.domain.usecases.User.UserUC;
import userapp.internal.domain.user.dao.postgresql.PostgreSQLStorage;
import userapp.internal.domain.user.service.UserService;
import userapp.lib.DateTime;
import userapp.lib.UUIDGenerator;

public class App 
{
    public static void main( String[] args ) {
        new App().initApp();
    }

    public void initApp() {
        new ConsloleInterface(
            new UserUC(
                new UserService(
                    new PostgreSQLStorage()
                ),
                new DateTime(),
                new UUIDGenerator()
            )
        ).runMainMenu();
    }
}
