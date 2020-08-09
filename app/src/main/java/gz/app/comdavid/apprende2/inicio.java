package gz.app.comdavid.apprende2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.IOException;

public class inicio extends AppCompatActivity {

    Button imageButton4;
    ImageButton silbos,silencio;
    MediaPlayer mp,mp2,mp3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        silbos=(ImageButton) findViewById(R.id.imageButton4);
        silencio=(ImageButton) findViewById(R.id.imageButton5);
        mp2= MediaPlayer.create(this,R.raw.bienvenido);
        mp2.start();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);


        ImageButton btn=(ImageButton) findViewById(R.id.imageButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

                mp2.stop();
                finish();


            }
        });
        ImageButton btnn2=(ImageButton) findViewById(R.id.imageButton2);
        btnn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),gz.app.comdavid.apprende2.escribirinicio.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

                mp2.stop();
                finish();


            }
        });

        Button credito=(Button) findViewById(R.id.button18);
        credito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),GestionActivity.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

                mp2.stop();
                finish();


            }
        });

        ImageButton boton = (ImageButton)findViewById(R.id.imageButton4);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mp2.stop();
                    mp2.prepare();
                    mp2.seekTo(0);
                    silbos.setVisibility(View.INVISIBLE);
                    silencio.setVisibility(View.VISIBLE);
                }
                catch(IOException e){

                    e.printStackTrace();
                }

            }
        });

        ImageButton botonsil = (ImageButton)findViewById(R.id.imageButton5);

        botonsil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();

                silbos.setVisibility(View.VISIBLE);
                silencio.setVisibility(View.INVISIBLE);
            }
        });

        ImageButton salir =(ImageButton) findViewById(R.id.imageButton3);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //finish();
                //System.exit(0);

                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

                mp2.stop();

            }
        });






    }
}
