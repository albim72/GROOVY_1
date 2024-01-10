package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {

        String jsonSource = "{\"employees\": [{\"id\": 1,\"name\": \"John Doe\",\"position\": \"Developer\"},{\"id\": 2,\"name\": \"Jane Smith\",\"position\": \"Designer\"},{\"id\": 3,\"name\": \"Tom Jones\",\"position\": \"Manager\"}]}";
        try {
            JSONObject jsonObject = new JSONObject(jsonSource);
            JSONArray employees = jsonObject.getJSONArray("employees");

            for (int i=0;i<employees.length();i++){
                JSONObject employee = employees.getJSONObject(i);
                int id = employee.getInt("id");
                String name = employee.getString("name");
                String position = employee.getString("position");
                System.out.println("ID: " +  id + ", NAME: " + name + ", POSITION: " + position);
            }
        }catch (Exception e){
            System.out.println("Błąd odczytu...");
        }
    }
}
