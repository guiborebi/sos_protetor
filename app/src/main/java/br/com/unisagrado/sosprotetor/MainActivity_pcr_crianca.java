package br.com.unisagrado.sosprotetor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity_pcr_crianca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pcr_crianca);
    }

    public void tela_ps(View view) {
        Intent in = new Intent(MainActivity_pcr_crianca.this, MainActivity_pcr.class);
        startActivity(in);
    }
}