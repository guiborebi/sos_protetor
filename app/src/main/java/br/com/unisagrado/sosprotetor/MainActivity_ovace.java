package br.com.unisagrado.sosprotetor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity_ovace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ovace);
    }

    public void tela_ovace_bebe(View view) {
        Intent in = new Intent(MainActivity_ovace.this, MainActivity_ovace_bebe.class);
        startActivity(in);
    }

    public void tela_ovace_criadult(View view) {
        Intent in = new Intent(MainActivity_ovace.this, MainActivity_ovace_criadult.class);
        startActivity(in);
    }

    public void tela_ps(View view) {
        Intent in = new Intent(MainActivity_ovace.this, MainActivity_primeiros_socorros.class);
        startActivity(in);
    }
}