package br.com.unisagrado.sosprotetor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity_convulsao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_convulsao);
    }

    public void tela_ps(View view) {
        Intent in = new Intent(MainActivity_convulsao.this, MainActivity_primeiros_socorros.class);
        startActivity(in);
    }
}