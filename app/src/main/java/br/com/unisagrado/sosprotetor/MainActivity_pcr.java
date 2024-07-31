package br.com.unisagrado.sosprotetor;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity_pcr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pcr);
    }

    public void tela_ps(View view) {
        Intent in = new Intent(MainActivity_pcr.this, MainActivity_primeiros_socorros.class);
        startActivity(in);
    }

    public void tela_bebe(View view) {
        Intent in = new Intent(MainActivity_pcr.this, MainActivity_pcr_bebe.class);
        startActivity(in);
    }

    public void tela_crianca(View view) {
        Intent in = new Intent(MainActivity_pcr.this, MainActivity_pcr_crianca.class);
        startActivity(in);
    }

    public void tela_adulto(View view) {
        Intent in = new Intent(MainActivity_pcr.this, MainActivity_pcr_adulto.class);
        startActivity(in);
    }
}