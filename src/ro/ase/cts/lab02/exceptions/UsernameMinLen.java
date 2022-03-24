package ro.ase.cts.lab02.exceptions;

public class UsernameMinLen extends Exception{
    @Override
    public String getMessage() {
        return "Username-ul este prea scurt.";
    }
}
