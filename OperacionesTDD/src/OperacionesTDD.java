public class OperacionesTDD {
    public int suma (String numeros) {
        int resultado = 0;
        String[] num = numeros.split(",");
        if (!numeros.isEmpty()){
            for (String s : num) {
                if (Integer.parseInt(s) < 0){
                    return -1;
                }
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
