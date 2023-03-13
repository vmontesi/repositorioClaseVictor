public class OperacionesTDD {
    public int suma (String numeros) {
        int resultado = 0;
        if (!numeros.isEmpty()){
            String[] num = numeros.split(",");
            for (String s : num) {
                if (s.equals(" ")){
                    return -1;
                }
                resultado += Integer.parseInt(s);
            }
            return resultado;
        }
        return 0;
    }
}
