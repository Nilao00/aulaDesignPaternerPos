package Carros;

public class MainCarros {
    public static void main(String[] args){

		CarrosFactory lamborghini = new Lamborghini();

		CarrosFactory fusca = new Fusca();

        lamborghini.configurarCambio();
        lamborghini.configurarFarol();
        lamborghini.configurarMotor();

	}

}
