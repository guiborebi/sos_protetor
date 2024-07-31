package br.com.unisagrado.sosprotetor;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity_primeiros_socorros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_primeiros_socorros);

        findViewById(R.id.botao_bombeiros).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                confirmacao_bombeiro();
            }
        });

        findViewById(R.id.botao_samu).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                confirmacao_samu();
            }
        });

        findViewById(R.id.botao_policia).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                confirmacao_policia();
            }
        });
    }

    public void confirmacao_bombeiro()
    {
        AlertDialog.Builder msgBox = new AlertDialog.Builder(this);
        msgBox.setTitle("LIGAR PARA BOMBEIROS");
        msgBox.setIcon(android.R.drawable.ic_menu_call);
        msgBox.setMessage("TEM CERTEZA DA LIGAÇÃO?\n\nSe sim, atente-se às informações:\n\n- RUA\n- NÚMERO\n- BAIRRO\n- PONTO DE REFERÊNCIA");
        msgBox.setPositiveButton("LIGAR", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(MainActivity_primeiros_socorros.this, "LIGANDO...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:193"));
                startActivity(intent);
            }
        });
        msgBox.setNegativeButton("CANCELAR", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(MainActivity_primeiros_socorros.this, "LIGAÇÃO CANCELADA", Toast.LENGTH_SHORT).show();
            }
        });
        msgBox.show();
    }

    public void confirmacao_samu()
    {
        AlertDialog.Builder msgBox = new AlertDialog.Builder(this);
        msgBox.setTitle("LIGAR PARA O SAMU");
        msgBox.setIcon(android.R.drawable.ic_menu_call);
        msgBox.setMessage("TEM CERTEZA DA LIGAÇÃO?\n\nSe sim, atente-se às informações:\n\n- RUA\n- NÚMERO\n- BAIRRO\n- PONTO DE REFERÊNCIA");
        msgBox.setPositiveButton("LIGAR", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(MainActivity_primeiros_socorros.this, "LIGANDO...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:192"));
                startActivity(intent);
            }
        });
        msgBox.setNegativeButton("CANCELAR", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(MainActivity_primeiros_socorros.this, "LIGAÇÃO CANCELADA", Toast.LENGTH_SHORT).show();
            }
        });
        msgBox.show();
    }

    public void confirmacao_policia()
    {
        AlertDialog.Builder msgBox = new AlertDialog.Builder(this);
        msgBox.setTitle("LIGAR PARA A POLÍCIA");
        msgBox.setIcon(android.R.drawable.ic_menu_call);
        msgBox.setMessage("TEM CERTEZA DA LIGAÇÃO?\n\nSe sim, atente-se às informações:\n\n- RUA\n- NÚMERO\n- BAIRRO\n- PONTO DE REFERÊNCIA");
        msgBox.setPositiveButton("LIGAR", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(MainActivity_primeiros_socorros.this, "LIGANDO...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:190"));
                startActivity(intent);
            }
        });
        msgBox.setNegativeButton("CANCELAR", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(MainActivity_primeiros_socorros.this, "LIGAÇÃO CANCELADA", Toast.LENGTH_SHORT).show();
            }
        });
        msgBox.show();
    }

    public void tela_sobre(View view) {
        Intent in = new Intent(MainActivity_primeiros_socorros.this, MainActivity.class);
        startActivity(in);
    }

    public void tela_creditos(View view) {
        Intent in = new Intent(MainActivity_primeiros_socorros.this, MainActivity_creditos.class);
        startActivity(in);
    }

    public void tela_lei(View view) {
        Intent in = new Intent(MainActivity_primeiros_socorros.this, MainActivity_lei.class);
        startActivity(in);
    }

    public void tela_avaliacaoinicial(View view) {
        Intent in = new Intent(MainActivity_primeiros_socorros.this, MainActivity_avaliacaoinicial.class);
        startActivity(in);
    }

    public void tela_pcr(View view) {
        Intent in = new Intent(MainActivity_primeiros_socorros.this, MainActivity_pcr.class);
        startActivity(in);
    }

    public void tela_ferimentos(View view) {
        Intent in = new Intent(MainActivity_primeiros_socorros.this, MainActivity_ferimentos.class);
        startActivity(in);
    }

    public void tela_fratura(View view) {
        Intent in = new Intent(MainActivity_primeiros_socorros.this, MainActivity_fratura.class);
        startActivity(in);
    }

    public void tela_desmaio(View view) {
        Intent in = new Intent(MainActivity_primeiros_socorros.this, MainActivity_desmaio.class);
        startActivity(in);
    }

    public void tela_convulsao(View view) {
        Intent in = new Intent(MainActivity_primeiros_socorros.this, MainActivity_convulsao.class);
        startActivity(in);
    }

    public void tela_ovace(View view) {
        Intent in = new Intent(MainActivity_primeiros_socorros.this, MainActivity_ovace.class);
        startActivity(in);
    }

    public void tela_avulsaodentaria(View view) {
        Intent in = new Intent(MainActivity_primeiros_socorros.this, MainActivity_avulsaodentaria.class);
        startActivity(in);
    }
}