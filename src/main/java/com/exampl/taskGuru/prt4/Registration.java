package com.exampl.taskGuru.prt4;

import javax.security.auth.login.LoginException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    private String login;
    private String password;
    private String confirmPassword;

    public void validateRegistration(String login, String password, String confirmPassword)
            throws EmptyLoginException, InvalidLoginException, PasswordConfirmationException, LengthException {
        if (login == null || login.trim().length() == 0 ||
            password == null || password.length() == 0 ||
            confirmPassword == null || confirmPassword.length() == 0) {
            throw new EmptyLoginException("Все поля должны быть заполнены");
        }

        if (login.length() > 20 || password.length() > 20 || confirmPassword.length() > 20) {
            throw new LengthException("Длина поля не должнабыть больше 20");
        }

        Pattern p = Pattern.compile("^[a-zA-Z0-1]");
        Matcher m = p.matcher(login);
        Matcher m1 = p.matcher(password);
        Matcher m2 = p.matcher(confirmPassword);
        if (m.find() || m1.find() || m2.find()) {
            throw new InvalidLoginException("Введены недопустимые символы");
        }

        if (!password.equals(confirmPassword)) {
            throw new PasswordConfirmationException("Пароли и его подверждение должны совпадать");
        }
    }
}

class TestRegistration {
    public static void main(String[] args) {
        Registration registration = new Registration();
        try {
            registration.validateRegistration(null, "xdfg", "fdcgh");
        } catch (EmptyLoginException e) {
            e.printStackTrace();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        } catch (PasswordConfirmationException e) {
            e.printStackTrace();
        } catch (LengthException e) {
            e.printStackTrace();
        }
    }
}

class EmptyLoginException extends Exception {
    private String msg;

    public EmptyLoginException(String msg) {
        super(msg);
        this.msg = msg;
    }
}

class InvalidLoginException extends Exception {
    private String msg;

    public InvalidLoginException(String msg) {
        super(msg);
        this.msg = msg;
    }
}

class PasswordConfirmationException extends Exception {
    private String msg;

    public PasswordConfirmationException(String msg) {
        super(msg);
        this.msg = msg;
    }

}

class LengthException extends Exception {
    private String msg;

    public LengthException(String msg) {
        super(msg);
        this.msg = msg;
    }

}