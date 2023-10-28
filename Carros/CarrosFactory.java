package Carros;

public interface CarrosFactory {

    IFarol configurarFarol();

	IMotor configurarMotor();

	ICambio configurarCambio();
}
