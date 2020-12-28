package chitra.helloworld.addpropertyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText name,type,area,bedroom,bathroom,balcony,parking,kitchen,floor,furnishing,address,amenities,room;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        type = findViewById(R.id.type);
        area = findViewById(R.id.area);
        bedroom = findViewById(R.id.bedroom);
        bathroom = findViewById(R.id.bathroom);
        balcony= findViewById(R.id.balcony);
        kitchen = findViewById(R.id.kitchen);
        parking = findViewById(R.id.parking);
        floor = findViewById(R.id.floor);
        furnishing = findViewById(R.id.furnishing);
        address = findViewById(R.id.address);
        amenities = findViewById(R.id.amenities);
       room = findViewById(R.id.room);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
    }
    public void onClick(View view) {

        Toast.makeText(this,"Property Uploaded",Toast.LENGTH_SHORT).show();

    }
}