//leitura de json
package projeto10;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Principal4 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("C:\\Development\\Projetos\\cursoJavaAlex\\src\\projeto10\\filjson.json");

        JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);

        List<Atleta> atletasList = new ArrayList<>();

        for (JsonElement jsonElement: jsonArray
             ) {
            Atleta atleta = new Gson().fromJson(jsonElement, Atleta.class);
            atletasList.add(atleta);
        }

        System.out.println("Leitura do arquivo JSON: " + atletasList);
    }
}
