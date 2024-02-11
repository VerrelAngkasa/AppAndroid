package edu.uph.appandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Todo extends AppCompatActivity {
    private EditText name;
    private RadioGroup radioGroup;
    private CheckBox checkOlahraga, checkJalanjalan, checkMakan, checkBelajar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);

        // Inisialisasi Views
        name = findViewById(R.id.name);
        radioGroup = findViewById(R.id.radioGroup);
        checkOlahraga = findViewById(R.id.checkOlahraga);
        checkJalanjalan = findViewById(R.id.checkJalanjalan);
        checkMakan = findViewById(R.id.checkMakan);
        checkBelajar = findViewById(R.id.checkBelajar);

        // Inisialisasi ImageButton
        Button save = findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Show Toast with input views
                showToast();
            }
        });
    }
    private void showToast() {
        // Get input value
        String nama = name.getText().toString();
        String tempat = getSelectedRadioButtonText();
        String jenis = getSelectedCheckBoxesText();

        // Create message for Toast
        String message = "Nama: " + nama + " | Tempat Kegiatan: " + tempat + " | Jenis Kegiatan: " + jenis;

        // Show the horizontal Toast
        Toast toast = Toast.makeText(Todo.this, message, Toast.LENGTH_LONG);
        View toastView = toast.getView();
        // Set layout direction to right-to-left
        toastView.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
        toast.show();
    }
    private String getSelectedRadioButtonText() {
        int selectedId = radioGroup.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedId);
        return selectedRadioButton != null ? selectedRadioButton.getText().toString() : "";
    }
    private String getSelectedCheckBoxesText() {
        StringBuilder selectedHobi = new StringBuilder();

        if (checkOlahraga.isChecked()) {
            selectedHobi.append("Olahraga, ");
        }
        if (checkJalanjalan.isChecked()) {
            selectedHobi.append("Jalan-jalan, ");
        }
        if (checkMakan.isChecked()) {
            selectedHobi.append("Makan, ");
        }
        if (checkBelajar.isChecked()) {
            selectedHobi.append("Belajar");
        }
        return selectedHobi.toString();
    }

}