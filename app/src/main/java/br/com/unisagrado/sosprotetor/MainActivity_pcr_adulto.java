package br.com.unisagrado.sosprotetor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity_pcr_adulto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pcr_adulto);
    }

    public void tela_ps(View view) {
        Intent in = new Intent(MainActivity_pcr_adulto.this, MainActivity_pcr.class);
        startActivity(in);
    }
}