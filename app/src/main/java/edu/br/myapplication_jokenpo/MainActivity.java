package edu.br.myapplication_jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random escolheMaq = new Random();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int escolhaMaquina;
    int escolharUser;


    public void papel (View view) {
        escolharUser = 1;
        maquinaEscolhe();
        verificacao();
    }

    public void tesoura (View view) {
        escolharUser = 2;
        maquinaEscolhe();
        verificacao();
    }

    public void pedra (View view) {
        escolharUser = 3;
        maquinaEscolhe();
        verificacao();
    }

    public void verificacao () {

        TextView txtMsg = findViewById(R.id.txtMsg);

        if(escolhaMaquina == escolharUser)
        {
            txtMsg.setText("Empatamos");
        }
        else if ((escolharUser - escolhaMaquina == -1) || (escolharUser - escolhaMaquina == 2))
        {
            txtMsg.setText("Voce Venceu!");
        }
        else {
            txtMsg.setText("Maquina venceu!");
        }
    }

    public void maquinaEscolhe () {
        escolhaMaquina = escolheMaq.nextInt(3)+1;
    }
}