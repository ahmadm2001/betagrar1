package com.example.betagrar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import static com.example.betagrar.FBref.refImages;
import static com.example.betagrar.FBref.refImages;
import java.io.File;
import java.io.IOException;


public class Profile_Activity extends AppCompatActivity implements  AdapterView.OnItemClickListener {
    Intent t;
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;
    ImageView iV;
    AlertDialog.Builder adb;
    LinearLayout mydialog;
    EditText ed1;
    String name,phone,typeCar,NumberCAr,NumberDrivinigLicense,MaxWm,Im;


    int Gallery=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_);

        tv1 = (TextView) findViewById(R.id.ed1);
        tv2 = (TextView) findViewById(R.id.ed2);
        tv3 = (TextView) findViewById(R.id.ed3);
        tv4 = (TextView) findViewById(R.id.ed4);
        tv5 = (TextView) findViewById(R.id.ed5);
        tv6 = (TextView) findViewById(R.id.ed6);
        tv7=(TextView)findViewById(R.id.ed7);
        iV = (ImageView) findViewById(R.id.iV);


        ValueEventListener stuListener = new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };



    }
    public void chake(){

    }


    DialogInterface.OnClickListener myclick= new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (which == DialogInterface.BUTTON_POSITIVE) {
                    name = ed1.getText().toString();
                    tv1= (TextView) ed1.getText();
                    tv1.setText(ed1.getText());
                    dialog.cancel();
                    Toast.makeText(Profile_Activity.this,"Successful",Toast.LENGTH_SHORT).show();
                }
                if (which == DialogInterface.BUTTON_NEGATIVE) {
                    dialog.cancel();

                }
            }

        };

            public void start(View view) {
                mydialog = (LinearLayout) getLayoutInflater().inflate(R.layout.my_dialog, null);
                ed1 = (EditText) findViewById(R.id.ed11);
                adb = new AlertDialog.Builder(this);
                adb.setView(mydialog);
                adb.setTitle("please enter your name  ");
                adb.setPositiveButton("enter", (DialogInterface.OnClickListener) myclick);
                adb.setNegativeButton("cancel", (DialogInterface.OnClickListener) myclick);
                adb.show();

            }


        public void upload(View view) {
            Intent si = new Intent(Intent.ACTION_PICK,
                    android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(si, Gallery);
        }




        /**
         * Uploading selected image file to Firebase Storage
         * <p>
         *
         * @param requestCode   The call sign of the intent that requested the result
         * @param resultCode    A code that symbols the status of the result of the activity
         * @param data          The data returned
         */
        public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
            super.onActivityResult(requestCode, resultCode, data);

            if (resultCode == Activity.RESULT_OK) {
                if (requestCode == Gallery) {
                    Uri file = data.getData();
                    if (file != null) {
                        final ProgressDialog pd=ProgressDialog.show(this,"Upload image","Uploading...",true);
                        StorageReference refImg = refImages.child("aaa.jpg");
                        refImg.putFile(file)
                                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                                    @Override
                                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                                        pd.dismiss();
                                        Toast.makeText(Profile_Activity.this, "Image Uploaded", Toast.LENGTH_LONG).show();
                                    }
                                })
                                .addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception exception) {
                                        pd.dismiss();
                                        Toast.makeText(Profile_Activity.this, "Upload failed", Toast.LENGTH_LONG).show();
                                    }
                                });
                    } else {
                        Toast.makeText(this, "No Image was selected", Toast.LENGTH_LONG).show();
                    }
                }
            }
        }

        /**
         * Downloading selected image file from Firebase Storage
         * <p>
         *
         * @param view
         */
        public void download(View view) throws  IOException {
            final ProgressDialog pd=ProgressDialog.show(this,"Image download","downloading...",true);

            StorageReference refImg = refImages.child("aaa.jpg");

            final File localFile = File.createTempFile("aaa","jpg");
            refImg.getFile(localFile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                    pd.dismiss();
                    Toast.makeText(Profile_Activity.this, "Image download success", Toast.LENGTH_LONG).show();
                    String filePath = localFile.getPath();
                    Bitmap bitmap = BitmapFactory.decodeFile(filePath);
                    iV.setImageBitmap(bitmap);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {
                    pd.dismiss();
                    Toast.makeText(Profile_Activity.this, "Image download failed", Toast.LENGTH_LONG).show();
                }
            });
        }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

}
