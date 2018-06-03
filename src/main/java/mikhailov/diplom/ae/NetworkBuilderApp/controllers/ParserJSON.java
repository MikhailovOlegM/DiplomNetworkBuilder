package mikhailov.diplom.ae.NetworkBuilderApp.controllers;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.List;
import mikhailov.diplom.ae.NetworkBuilderApp.model.Lan;
import mikhailov.diplom.ae.NetworkBuilderApp.model.Router;
import mikhailov.diplom.ae.NetworkBuilderApp.model.Server;
import mikhailov.diplom.ae.NetworkBuilderApp.model.Switch;
import mikhailov.diplom.ae.NetworkBuilderApp.model.WiFi;

public class ParserJSON {

    public static String refactorString(String inputParams) {
        Gson gson = new Gson();
        String result = null;
        List<WiFi> wiFiList = new ArrayList<>();
        List<Router> routerList = new ArrayList<>();
        List<Switch> switchList = new ArrayList<>();
        List<Lan> lanList = new ArrayList<>();
        List<Server> serverList = new ArrayList<>();

        JsonParser parser = new JsonParser();
        JsonArray rootObj = parser.parse(inputParams).getAsJsonArray();
        rootObj.forEach(object -> {
            JsonObject elem = object.getAsJsonObject();
            String key = elem.getAsJsonObject().get("type").getAsString();
            switch (key) {
                case "wifi":
                    WiFi w = gson.fromJson(object, WiFi.class);
                    wiFiList.add(w);
                    break;
                case "router":
                    Router r = gson.fromJson(object, Router.class);
                    routerList.add(r);
                    break;
                case "switch":
                    Switch s = gson.fromJson(object, Switch.class);
                    switchList.add(s);
                    break;
                case "lan":
                    Lan l = gson.fromJson(object, Lan.class);
                    lanList.add(l);
                    break;
                case "server":
                    Server server = gson.fromJson(object, Server.class);
                    serverList.add(server);
                    break;

            }
        });

        List<String> resultObject = new ArrayList<>();

        resultObject.add(gson.toJson(wiFiList));
        resultObject.add(gson.toJson(routerList));
        resultObject.add(gson.toJson(switchList));
        resultObject.add(gson.toJson(lanList));
        resultObject.add(gson.toJson(serverList));

//        result = gson.toJson(resultObject);
        JsonObject job = new JsonObject();


        return result;
    }

}
