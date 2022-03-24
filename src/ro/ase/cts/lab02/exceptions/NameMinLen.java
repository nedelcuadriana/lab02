package ro.ase.cts.lab02.exceptions;

public class NameMinLen extends Exception{
    @Override
    public String getMessage() {
        return "Numele este prea scurt.";
    }
}
