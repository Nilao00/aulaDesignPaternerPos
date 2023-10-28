package Carros;

public class Lamborghini implements CarrosFactory {
    public IFarol configurarFarol(){
        return new FarolXeon();
    }

    public IMotor configurarMotor(){
        return new MotorHibrido();
    }

   public ICambio configurarCambio(){
        return new CambioAutomatico();
    }

}
