package dis.ufv.pokemonRestAPI.pokemonAPI;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LectorJson {
    public ArrayList <Pokemon> leeFicheroJson()
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream("pokemonConId.json")));
            ArrayList<Pokemon> listaPokemon = new Gson().fromJson(reader, new TypeToken<ArrayList<Pokemon>>(){}.getType());
            reader.close();
            return listaPokemon;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return new ArrayList<>();
        }
    }
}
