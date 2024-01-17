package com.example.demo;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JsonManager {
    
    public static ListPersons readJson() throws IOException{
          System.out.println("Trying to read the file");

        // Specify the file path
        String filePath = "demo/src/people.json";
        
        // Create a Path object
        Path path = Paths.get(filePath);

        // Check if the file exists
        if (!Files.exists(path)) {
            throw new FileNotFoundException("File not found!!!");
        }else{
            System.out.println("File exists");
        }

        // Read the content of the JSON file
        String jsonContent = new String(Files.readAllBytes(path));

        
        Gson gson = new Gson();
        try {
            
            ListPersons listPersons = new ListPersons(gson.fromJson(jsonContent, new TypeToken<ArrayList<Person>>() {
            }.getType()));
            
            return listPersons;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void writeOnePersonJSON(Person person) throws IOException{
        // Specify the file path
        String filePath = "demo/src/people.json";

        // Lee el contenido actual del archivo JSON en una lista de objetos Records
        ListPersons personList = readJson();

        // Agrega el nuevo objeto Record a la lista existente
        personList.addperson(person);

        // Convierte la lista actualizada a formato JSON
        Gson gson = new Gson();
        String updatedJson = gson.toJson(personList.getpersons());

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(updatedJson);
        }
        
    }
}
