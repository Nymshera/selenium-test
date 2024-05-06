package utils;

import java.util.HashMap;
import java.util.Map;

public class NavigationBar {
    private static final Map<String, String> SECTION_URL_MAP = new HashMap<>();

    static {
        SECTION_URL_MAP.put("Cursos", "/cursos");
        SECTION_URL_MAP.put("Recursos", "/recursos");
        SECTION_URL_MAP.put("Blog", "/blog");
        SECTION_URL_MAP.put("Programas de estudio", "/caminos-de-aprendizaje");
        SECTION_URL_MAP.put("Mentorías", "/mentoria-1-1-con-pato");
        SECTION_URL_MAP.put("Udemy", "/udemy");
    }

    public static String getUrlForSection(String section) {
        return SECTION_URL_MAP.get(section);
    }

}
