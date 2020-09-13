package gz.app.comdavid.apprende2.ABC_Drawable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import gz.app.comdavid.apprende2.ABC_Drawable.Drawable_letter_aa;
import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.paint2;

public class escribirinicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escribirinicio);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        Button inicio= (Button) findViewById(R.id.casa_escribe);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), gz.app.comdavid.apprende2.inicio.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                finish();
            }
        });

        Button juegosil1= (Button) findViewById(R.id.escribirvocales);
        juegosil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), Drawable_letter_aa.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);

            }
        });
        Button juegosil2= (Button) findViewById(R.id.paints);
        juegosil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), paint2.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);

            }
        });

    }
}