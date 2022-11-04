package br.com.etecia.foodfast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MenuAppBarTop_Activity extends AppCompatActivity {

    MaterialToolbar idToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_app_bar_top_layout);

        idToolbar = findViewById(R.id.idToolBar);


        idToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Clique no icone",
                        Toast.LENGTH_SHORT).show();

            }
        });

        idToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.mFavoritos:
                        Toast.makeText(getApplicationContext(),
                                "Clique no icone",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mSearch:
                        Toast.makeText(getApplicationContext(),
                                "Clique no Searsh",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mMore:
                        Toast.makeText(getApplicationContext(),
                                "Clique no More",
                                Toast.LENGTH_SHORT).show();
                        break;


                }


                return true;
            }
        });

    }
}