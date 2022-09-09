package LoginRegistration.devtaha.LRegistration.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;
@Service
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
        //TODO: Regex to validate email
        return true;
    }
}

// TODO : UPDATE confirmation_token set expires_at = now() where id  = 1; SQL