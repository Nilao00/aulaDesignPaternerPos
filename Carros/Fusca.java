package Carros;

public class Fusca implements CarrosFactory {
		public IFarol configurarFarol(){
			return new FarolNormal();
		}

		public IMotor configurarMotor(){
			return new MotorCombustao();
		}

		public ICambio configurarCambio(){
			return new CambioManual();
		}
    
}

