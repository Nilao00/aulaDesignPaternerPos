package Imposto;

import java.text.DecimalFormat;

public class MainImposto {
    public static void main(String[] args){
        ImpostoFactory factory = new ImpostoFactory();
        IImposto ipi = factory.getImposto("IPTU");
        double valor = ipi.calculo(34);
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        System.out.println(numberFormat.format(valor));
    }        
}
