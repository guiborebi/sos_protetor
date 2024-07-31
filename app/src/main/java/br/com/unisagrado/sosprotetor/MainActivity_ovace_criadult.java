package br.com.unisagrado.sosprotetor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity_ovace_criadult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ovace_criadult);
    }

    public void tela_ps(View view) {
        Intent in = new Intent(MainActivity_ovace_criadult.this, MainActivity_ovace.class);
        startActivity(in);
    }

    public void tela_pcr(View view) {
        Intent in = new Intent(MainActivity_ovace_criadult.this, MainActivity_pcr.class);
        startActivity(in);
    }
}