package arish99.example.activityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.friendsList);
        ArrayList<String> friends = new ArrayList<String>();
        friends.add("Anshuman");
        friends.add("Armaan");
        friends.add("Puru");
        friends.add("Neelesh");
        friends.add("Ritvik");
        friends.add("Aman");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,friends);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent =new Intent(getApplicationContext(),secondactivty.class);
                intent.putExtra("name",friends.get(i));
                startActivity(intent);
            }
        });
    }
}