package gz.app.comdavid.apprende2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    ImageButton silencio;
    Button silbos;
    Switch switchingles,switchespannol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        silbos=(Button) findViewById(R.id.sonido);
        silencio=(ImageButton) findViewById(R.id.sonidoo);
        mp= MediaPlayer.create(this,R.raw.lectura);

        Button sonidoa = (Button)findViewById(R.id.sonido);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    mp.stop();
                    mp.prepare();
                    mp.seekTo(0);
                    silbos.setVisibility(View.INVISIBLE);
                    silencio.setVisibility(View.VISIBLE);
                }
                catch(IOException e){

                    e.printStackTrace();
                }


            }
        });
        ImageButton sonidob = (ImageButton)findViewById(R.id.sonidoo);
        sonidob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

                silbos.setVisibility(View.VISIBLE);
                silencio.setVisibility(View.INVISIBLE);


            }
        });
        Button regresar= (Button) findViewById(R.id.back);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, inicio.class);
                startActivity(i);
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                mp.stop();
            }
        });

        Button voc= (Button) findViewById(R.id.vocal);
        voc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),vocales.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                mp.stop();
            }
        });

        Button abce= (Button) findViewById(R.id.abc);
        abce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),abc_a.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.zoom_back_in, R.anim.zoom_back_out);
                mp.stop();
            }
        });

        Button jue= (Button) findViewById(R.id.juego);
        jue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),juegos.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
                mp.stop();
            }
        });

        Button sil= (Button) findViewById(R.id.silabas);
        sil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),silabas.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.left_out);
                mp.stop();
                finish();
            }
        });

        Button pal= (Button) findViewById(R.id.palabra);
        pal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),escribir.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.left_out);
                mp.stop();
                finish();
            }
        });

        switchingles =(Switch) findViewById(R.id.switch1);
        switchingles.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){


if(switchingles.isChecked()){



            Intent intent=new Intent(v.getContext(),mainactivity2.class);
            startActivityForResult(intent,0);

            mp.stop();
            finish();

        }


}
    });
    }

}

