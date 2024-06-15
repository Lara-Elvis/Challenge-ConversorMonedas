import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorArchivo {
    public void guardarElJason(Monedas monedas)throws IOException{

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(monedas.conversion_rate()+"json");
        escritura.write(gson.toJson(monedas));
        escritura.close();

    }
}
