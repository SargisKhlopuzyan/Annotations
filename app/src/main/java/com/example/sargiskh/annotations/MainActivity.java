package com.example.sargiskh.annotations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car car = new Car("Toyota", "Camry", "2015");
        JsonSerializer jsonSerializer = new JsonSerializer();
        try {
            String jsonString = jsonSerializer.serialize(car);
            Log.e("LOG_TAG", "jsonString: " + jsonString);
        } catch (JsonSerializeException e) {
            Log.e("LOG_TAG", "JsonSerializeException: " + e);
        }

    }
}
