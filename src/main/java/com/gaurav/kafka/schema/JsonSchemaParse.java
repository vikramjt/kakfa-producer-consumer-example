package com.gaurav.kafka.schema;

import org.everit.json.schema.ObjectSchema;
import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;

public class JsonSchemaParse {

    public static void main(String[] args) {
        JsonSchemaParse jsonSchemaParse = new JsonSchemaParse();
        jsonSchemaParse.givenValidInput_whenValidating_thenValid();
    }

    public void givenValidInput_whenValidating_thenValid() throws ValidationException {
        File schemaFile = new File("schema.json");

        JSONObject jsonSchema = new JSONObject(
                new JSONTokener(JsonSchemaParse.class.getResourceAsStream("/schema.json")));
        JSONObject jsonSubject = new JSONObject(
                new JSONTokener(JsonSchemaParse.class.getResourceAsStream("/product.json")));


        Schema schema = SchemaLoader.load(jsonSchema);
        ObjectSchema objectSchema = (ObjectSchema)schema;
        System.out.println(objectSchema.getPropertySchemas().keySet());
        schema.validate(jsonSubject);
    }
}
