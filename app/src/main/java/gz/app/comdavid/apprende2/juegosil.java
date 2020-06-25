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
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.io.IOException;

public class juegosil extends  AppCompatActivity implements View.OnClickListener  {

    ImageView silba,silbas,silbe,err,silbps,silencio;
    MediaPlayer mp,mp2,mp3,mp4;

    RelativeLayout casss;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegosil);
        mp4= MediaPlayer.create(this,R.raw.seleccionacaa);
        mp4.start();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        silba=(ImageView) findViewById(R.id.siljuegocar);
        silbas=(ImageView) findViewById(R.id.siljuegobal);
        silbe=(ImageView) findViewById(R.id.siljuegocuc);
        err=(ImageView) findViewById(R.id.silerror);
        casss=(RelativeLayout) findViewById(R.id.huj);
        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.casa);
        findViewById(R.id.siljuegocar).setOnClickListener(this);
        findViewById(R.id.siljuegocuc).setOnClickListener(this);
        findViewById(R.id.siljuegobal).setOnClickListener(this);
        findViewById(R.id.siljuegoca).setOnClickListener(this);

        Button sonidoa = (Button)findViewById(R.id.sonidosilabas1);
        mp= MediaPlayer.create(this,R.raw.sonidos);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp4.start();

            }
        });


        Button inicio= (Button) findViewById(R.id.casa_sil1);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),silabas.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                mp4.stop();
                finish();
            }
        });



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.siljuegobal:


                    err.setVisibility(View.VISIBLE);

                    mp2.start();
                mp4.stop();

                break;
            case R.id.siljuegocar:
                silba.setVisibility(View.GONE);
                silbas.setVisibility(View.GONE);
                silbe.setVisibility(View.GONE);
                err.setVisibility(View.GONE);
                casss.setVisibility(View.VISIBLE);
                mp3.start();
                mp4.stop();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent intent=new Intent(juegosil.this,juegosil2.class);

                        startActivity(intent);
                        overridePendingTransition(R.anim.left_in, R.anim.left_out);
                        finish();


                    }
                },4000);


                break;

            case R.id.siljuegocuc:

                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();

                break;

            case R.id.siljuegoca:
                mp4.stop();
                break;


        }
    }
}
