package edu.uph.appandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Pertemuan3 extends AppCompatActivity {

    TextView namaMahasiswa, idMahasiswa, jurusanMahasiswa, hobiMahasiswa;

    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertemuan3);

        namaMahasiswa = (TextView) findViewById(R.id.namaMahasiswa);
        namaMahasiswa.setText("Verrel Angkasa");

        idMahasiswa = (TextView) findViewById(R.id.idMahasiswa);
        idMahasiswa.setText("03081220031");

        jurusanMahasiswa = (TextView) findViewById(R.id.jurusanMahasiswa);
        jurusanMahasiswa.setText("Sistem Informasi");

        hobiMahasiswa = (TextView) findViewById(R.id.hobiMahasiswa);
        hobiMahasiswa.setText("Olahraga");

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}