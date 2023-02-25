package br.edu.unoesc.exercicio_operacoes.converter;

public class conversorNumerico {
    public static boolean ehNumerico(String strNumero) {
        if (strNumero == null) {
            return false;
        }
        try {
            Double.parseDouble(strNumero.replace(",", "."));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static Double converteParaDouble(String strNumero) {
        if (strNumero == null) {
            return 0d;
        }
        return Double.parseDouble(strNumero.replace(",", "."));
    }
}