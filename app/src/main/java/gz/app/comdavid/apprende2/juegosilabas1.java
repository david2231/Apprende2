package gz.app.comdavid.apprende2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class juegosilabas1 extends AppCompatActivity  implements View.OnClickListener{

    ImageView err,err1,err2,err3;
    Button silba,silbas,silbe,silbi,silbis,silbo,silbos,silbu;
    MediaPlayer mp,mp2,mp3,mp4,mp5,mp6;

    RelativeLayout casss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegosilabas1);
        mp4= MediaPlayer.create(this,R.raw.seleccionacasa);
        mp5= MediaPlayer.create(this,R.raw.ca);
        mp6= MediaPlayer.create(this,R.raw.sa);
        mp4.start();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        silba=(Button) findViewById(R.id.juesilca);
        silbas=(Button) findViewById(R.id.juesilca2);
        silbe=(Button) findViewById(R.id.juesilca3);
        silbi=(Button) findViewById(R.id.juesilca4);
        silbis=(Button) findViewById(R.id.juesilca5);
        silbo=(Button) findViewById(R.id.juesilca6);
        silbos=(Button) findViewById(R.id.juesilca7);
        silbu=(Button) findViewById(R.id.juesilca8);
        err=(ImageView) findViewById(R.id.errorjuego1);
        err1=(ImageView) findViewById(R.id.imagenca);
        err2=(ImageView) findViewById(R.id.imagensa);
        err3=(ImageView) findViewById(R.id.imagencasa);
        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.casa);

        findViewById(R.id.juesilca).setOnClickListener(this);
        findViewById(R.id.juesilca2).setOnClickListener(this);
        findViewById(R.id.juesilca3).setOnClickListener(this);
        findViewById(R.id.juesilca4).setOnClickListener(this);
        findViewById(R.id.juesilca5).setOnClickListener(this);
        findViewById(R.id.juesilca6).setOnClickListener(this);
        findViewById(R.id.juesilca7).setOnClickListener(this);
        findViewById(R.id.juesilca8).setOnClickListener(this);

        Button sonidoa = (Button)findViewById(R.id.sonidosilabas76);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp4.start();

            }
        });


        Button inicio= (Button) findViewById(R.id.casa_juegosil1);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),juegos.class);
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


                    case R.id.juesilca:


                        err.setVisibility(View.VISIBLE);
                        mp4.stop();
                        mp2.start();

                        break;
                    case R.id.juesilca2:
                        err.setVisibility(View.VISIBLE);
                        mp4.stop();
                        mp2.start();

                        break;

                    case R.id.juesilca3:

                        err.setVisibility(View.VISIBLE);
                        mp4.stop();
                        mp2.start();
                        break;
                    case R.id.juesilca4:

                        err1.setVisibility(View.VISIBLE);
                        mp4.stop();
                        mp5.start();
                        err.setVisibility(View.GONE);

                        break;

                    case R.id.juesilca5:
                        mp4.stop();
                        err.setVisibility(View.VISIBLE);
                        mp2.start();

                        break;
                    case R.id.juesilca6:
                        mp4.stop();
if(err1.getVisibility()==View.VISIBLE) {


    silbo.setVisibility(View.GONE);
    silbi.setVisibility(View.GONE);
    err.setVisibility(View.GONE);
    err1.setVisibility(View.VISIBLE);
    err2.setVisibility(View.VISIBLE);
    err3.setVisibility(View.VISIBLE);

    mp3.start();
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {

            Intent intent = new Intent(juegosilabas1.this,juegosilabas2.class);

            startActivity(intent);
            overridePendingTransition(R.anim.left_in, R.anim.left_out);

            finish();


        }
    }, 4000);
}else{

    mp2.start();
}

                        break;
                    case R.id.juesilca7:
                        mp4.stop();
                        err.setVisibility(View.VISIBLE);
                        mp2.start();
                        break;

                    case R.id.juesilca8:
                        mp4.stop();
                        err.setVisibility(View.VISIBLE);
                        mp2.start();
                        break;


                }



    }
}




