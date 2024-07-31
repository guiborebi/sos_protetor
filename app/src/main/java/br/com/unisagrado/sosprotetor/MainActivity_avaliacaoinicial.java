package br.com.unisagrado.sosprotetor;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity_avaliacaoinicial extends AppCompatActivity {

    private final Timer timer = new Timer();
    TimerTask timerTask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_avaliacaoinicial);

        timerTask = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        aberturaMainActivity();
                    }
                });
            }
        };
        timer.schedule(timerTask, 7000);
    }

    private void aberturaMainActivity() {
        Intent intent = new Intent(getApplicationContext(), MainActivity_primeiros_socorros.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void tela_ps(View view) {
        timerTask.cancel();
        timer.purge();
        Intent intent = new Intent(MainActivity_avaliacaoinicial.this, MainActivity_primeiros_socorros.class);
        startActivity(intent);
        finish();
    }
}