package arish99.example.activityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class secondactivty extends AppCompatActivity {
    public void tofirstActivity(View view)
    {
        Intent intent =new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivty);
        Intent intent =getIntent();
        Toast.makeText(this, intent.getStringExtra("name"), Toast.LENGTH_SHORT).show();
    }
}