package idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema{
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println("Idioma está em: " + locale.getLanguage());
        System.out.println("País em: " + locale.getCountry());
        System.out.println("Nome completo: " + locale.getDisplayName());
    
    }
}
