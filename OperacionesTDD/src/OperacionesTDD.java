public class OperacionesTDD {
    public int suma (String numeros) {
        if (!numeros.isEmpty()){
            int suma = 0;
            String[] num = numeros.split(",");
            for (String s : num) {
                suma += Integer.parseInt(s);
            }
            return suma;
        }
        return 0;
    }
}
