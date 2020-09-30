package com;

import javax.ejb.Stateless;
import java.util.Map;

/**
 * Класс реализует метод интерфейса Variables
 * который возвращает в мапе переменные ос и их значения
 * класс, является EJB бином
 */
@Stateless
public class VariableImpl implements Variables {

    /**
     * Метод возвращает переменные среды и их значения
     * @return возвращает Map с переменными операционной системы и их значениями
     */
    @Override
    public Map<String, String> getSystemVariables() {
        Map<String, String> map = System.getenv();
        return map;
    }
}
