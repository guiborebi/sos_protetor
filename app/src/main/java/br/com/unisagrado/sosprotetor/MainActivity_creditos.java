package br.com.unisagrado.sosprotetor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity_creditos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_creditos);
    }

    public void tela_sobre(View view) {
        Intent in = new Intent(MainActivity_creditos.this, MainActivity.class);
        startActivity(in);
    }

    public void tela_ps(View view) {
        Intent in = new Intent(MainActivity_creditos.this, MainActivity_primeiros_socorros.class);
        startActivity(in);
    }

    public void tela_lei(View view) {
        Intent in = new Intent(MainActivity_creditos.this, MainActivity_lei.class);
        startActivity(in);
    }
}