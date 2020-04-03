package com.example.betagrar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import static com.example.betagrar.FBref.FBDB;
import static com.example.betagrar.FBref.refcustomer;


public class CustomerActivite extends AppCompatActivity implements AdapterView.OnClickListener {
     Button btn;
     Intent t;
     boolean boo=false;
     customer c;
    offerdrag od;
     AlertDialog.Builder adb;
    offerdrag oD;
    ValueEventListener stuListener;
    ArrayList<String> stuList = new ArrayList<String>();
    ArrayList<offerdrag> stuValues = new ArrayList<offerdrag>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_activite);
        btn= (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refcustomer.addValueEventListener(stuListener);
                t=new Intent(CustomerActivite.this,OrdersActivite.class);

                startActivity(t);
                Toast.makeText(CustomerActivite.this,"circle button clicked",Toast.LENGTH_SHORT).show();


            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);


    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String s = item.getTitle().toString();
        t = new Intent(this, CustomerActivite.class);
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
    public void onClick(View v) {

    }


}
