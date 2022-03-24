package ro.ase.cts.lab02.exceptions;

public class StringMinLen extends Exception{
    @Override
    public String getMessage() {
        return "Denumirea este prea scurta.";
    }
}
