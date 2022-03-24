package ro.ase.cts.lab02.exceptions;

public class InvalidPriceValue extends Exception{
    @Override
    public String getMessage() {
        return "Pretul este invalid.";
    }
}
