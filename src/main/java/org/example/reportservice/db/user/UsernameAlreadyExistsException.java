package org.example.reportservice.db.user;

public class UsernameAlreadyExistsException extends Exception {
    public UsernameAlreadyExistsException() {
        super();
    }
    public UsernameAlreadyExistsException(String ex) {
        super(ex);
    }
}
