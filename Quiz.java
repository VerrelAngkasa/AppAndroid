package edu.uph.appandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class Quiz extends AppCompatActivity {

    LinearLayout profil, todo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        profil = (LinearLayout) findViewById(R.id.profil);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //catat di log
                Log.d("PROFIL", "Masuk ke profil");
                //pindah dari quizactivity ke pertemuan3activity
                Intent intent = new Intent(Quiz.this, Pertemuan3.class);
                startActivity(intent);
            }
        });

        todo = (LinearLayout) findViewById(R.id.todo);
        todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //catat di log
                Log.d("TODO", "Masuk ke todo");
                //pindah dari quizactivity ke todoactivity
                Intent intent = new Intent(Quiz.this, Todo.class);
                startActivity(intent);
            }
        });
    }
}