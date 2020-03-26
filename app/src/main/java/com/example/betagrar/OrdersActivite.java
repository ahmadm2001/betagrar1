package com.example.betagrar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;

public class OrdersActivite extends AppCompatActivity {
    AlertDialog.Builder asb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders_activite);
        asb=new AlertDialog.Builder(this);
    }

    public void dialog(View view) {
        AlertDialog ad= asb.create();
        ad.setTitle("customer");


        ad.show();
    }
}
