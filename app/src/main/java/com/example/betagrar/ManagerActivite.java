package com.example.betagrar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import static com.example.betagrar.FBref.refoffergrar;

public class ManagerActivite extends AppCompatActivity  implements AdapterView.OnItemClickListener {
    Intent t;
    ListView lv;
    boolean bo2;
    AlertDialog.Builder adb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_activite);
        lv = (ListView) findViewById(R.id.lv);
        lv.setOnItemClickListener(this);
        ValueEventListener stuListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
    }







    










    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String s = item.getTitle().toString();
        t = new Intent(this, ManagerActivite.class);
        if (s.equals("Profile")) {
            t = new Intent(this, Profile_Activity.class);
            startActivity(t);
        }
        if (s.equals("History")) {
            t = new Intent(this, CreditsActivity.class);
            startActivity(t);
        }
        if (s.equals("cridets")) {
            t = new Intent(this, CreditsActivity.class);
            startActivity(t);
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    public void onClick(View view) {
        Toast.makeText(ManagerActivite.this,"LV clicked",Toast.LENGTH_SHORT).show();
    }
}
