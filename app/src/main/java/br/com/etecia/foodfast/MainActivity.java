package br.com.etecia.foodfast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // inserindo o menu na barra de aplicativos
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);


        return super.onCreateOptionsMenu(menu);
    }


    //Criando o método para clicar nos itens do menu


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mFavoritos:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Favoritos",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mBuscar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Buscar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mConfiguracoes:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Configurações",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mHistorico:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Histórico",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSobre:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Sobre",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mCompartilhar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Compartilhar",
                        Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}