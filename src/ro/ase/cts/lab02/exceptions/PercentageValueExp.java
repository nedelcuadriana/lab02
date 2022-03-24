package ro.ase.cts.lab02.exceptions;

public class PercentageValueExp extends Exception{
    @Override
    public String getMessage() {
        return "Nu se respecta formatul de valoare.";
    }
}
