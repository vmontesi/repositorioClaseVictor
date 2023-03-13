public class OperacionesTDD {
    public int suma (String numeros) {
        int resultado = 0;
        String[] num = numeros.split(",");
        if (!numeros.isEmpty()){
            for (String s : num) {
                if (!s.equals(" ") && Integer.parseInt(s) < 0){
                    System.out.println("No se admiten números negativos");
                    return -1;
                }
                if (s.equals(" ")){
                    return -1;
                }
                if (Integer.parseInt(s) < 1000){

                    resultado += Integer.parseInt(s);
                } else System.out.println("numero mayor de 1000 omitido");
            }
            return resultado;
        }
        return 0;
    }
}
