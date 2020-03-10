package com.example.betagrar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class CustomerActivite extends AppCompatActivity {
Intent t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_activite);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String s = item.getTitle().toString();
        t = new Intent(this, CustomerActivite.class);
        if (s.equals("history")) {
            t = new Intent(this, history.class);
            startActivity(t);
        }
        if (s.equals("profile")) {
            t = new Intent(this, profileCustomer.class);
            startActivity(t);
        }
        if (s.equals("cridets")) {
            t = new Intent(this, cridets.class);
            startActivity(t);
        }
        return super.onOptionsItemSelected(item);
    }

    public void order(View view) {

        t=new Intent(CustomerActivite.this , OrdersActivite.class);
        startActivity(t);

    }

}
