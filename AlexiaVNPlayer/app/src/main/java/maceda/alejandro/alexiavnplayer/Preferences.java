package maceda.alejandro.alexiavnplayer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Preferences extends Activity {

    private int mmthemeId;
    private int themeId;
    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = getIntent();
        mmthemeId = intent.getIntExtra("theme", android.R.style.Theme_Holo);
        getPreferencesTheme();
        setTheme(themeId);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        btnRegresar = (Button) findViewById(R.id.regresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                regresar();
            }
        });


    }

    private void regresar() {
       // Intent alexavn = new Intent(this, alexavn.class);
        //startActivity(alexavn);
        finish();

    }

    private void getPreferencesTheme () {

        if (mmthemeId == android.R.style.Theme_Holo ) {
            themeId = android.R.style.Theme_Holo_NoActionBar_Fullscreen;
        }
        if (mmthemeId == android.R.style.Theme_Holo_Light_DarkActionBar) {
            themeId = android.R.style.Theme_Holo_Light_NoActionBar_Fullscreen;
        }
        if (mmthemeId == android.R.style.Theme_Holo_Light) {
            themeId = android.R.style.Theme_Holo_Light_NoActionBar_Fullscreen;
        }
        if (mmthemeId == android.R.style.Theme_Black) {
            themeId = android.R.style.Theme_Black_NoTitleBar_Fullscreen;
        }
        if (mmthemeId == android.R.style.Theme_Light) {
            themeId = android.R.style.Theme_Light_NoTitleBar_Fullscreen;
        }

    }
}