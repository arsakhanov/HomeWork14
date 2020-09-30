package com;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.Map;

/**
 * Класс для работы с REST запросами
 */
@Path("/variables")
public class VariableController {

    @Inject
    private Variables vars;

    /**
     * Метод возвращает переменные операционной системы и их параметры
     * @return возвращает JsonArray с объектами переменных и их значений
     */
    @Path("/all")
    @GET
    @Produces("application/json")
    public JsonArray getAll(){
        JsonArrayBuilder builder = Json.createArrayBuilder();
        Map<String,String> params = vars.getSystemVariables();
        for (Map.Entry<String,String> entry:params.entrySet()) {
            builder.add(Json.createObjectBuilder().add(entry.getKey(),entry.getValue()));
        }
        return builder.build();
    }

    /**
     * Метод возвращает переменную, указанную в запросе, и его значение
     * если таковые имеются в системе
     * @param name имя переменной типа String
     * @return возвращает переменную и его значение в виде JsonArray
     */
    @Path("/{name}")
    @GET
    @Produces("application/json")
    public JsonArray getName(@PathParam("name") String name){
        JsonArrayBuilder builder = Json.createArrayBuilder();
        Map<String,String> params = vars.getSystemVariables();
        for (Map.Entry<String,String> entry:params.entrySet()) {
            if(entry.getKey().equals(name)){
                builder.add(Json.createObjectBuilder().add(name,entry.getValue()));
            }
        }
        return builder.build();
    }

}


