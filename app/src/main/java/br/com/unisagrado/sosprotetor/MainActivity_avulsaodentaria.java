package br.com.unisagrado.sosprotetor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity_avulsaodentaria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_avulsaodentaria);
    }

    public void tela_ps(View view) {
        Intent in = new Intent(MainActivity_avulsaodentaria.this, MainActivity_primeiros_socorros.class);
        startActivity(in);
    }
}