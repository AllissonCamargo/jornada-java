package boxing_unboxing_wrapper;

public class Casting_Tipo_Valor_Para_Tipo_Referencia {
    public static void main(String[] args) {
        int x = 20;

        Object obj = x;

        System.out.println(obj);

        // int y = obj; - não funciona, pois não é compatível. Precisa fazer a coersão(casting) int y = (int) obj.
        // É possível utilizar Wrapper ClASS, tirando a necessidade da coesão, ficando: Integer y = obj

        int y = (int) obj;
    }
}
