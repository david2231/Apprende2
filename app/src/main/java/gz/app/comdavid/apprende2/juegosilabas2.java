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

public class juegosilabas2 extends AppCompatActivity  implements View.OnClickListener{

    ImageView err,err1,err2,err3;
    Button silba,silbas,silbe,silbi,silbis,silbo,silbos,silbu;
    MediaPlayer mp,mp2,mp3,mp4,mp5,mp6;

    RelativeLayout casss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegosilabas2);
        mp4= MediaPlayer.create(this,R.raw.seleccionadado);
        mp5= MediaPlayer.create(this,R.raw.da);
        mp6= MediaPlayer.create(this,R.raw.doo);
        mp4.start();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        silba=(Button) findViewById(R.id.juesilca9);
        silbas=(Button) findViewById(R.id.juesilca10);
        silbe=(Button) findViewById(R.id.juesilca11);
        silbi=(Button) findViewById(R.id.juesilca12);
        silbis=(Button) findViewById(R.id.juesilca13);
        silbo=(Button) findViewById(R.id.juesilca14);
        silbos=(Button) findViewById(R.id.juesilca15);
        silbu=(Button) findViewById(R.id.juesilca16);
        err=(ImageView) findViewById(R.id.errorjuego2);
        err1=(ImageView) findViewById(R.id.imagenca2);
        err2=(ImageView) findViewById(R.id.imagensa2);
        err3=(ImageView) findViewById(R.id.imagencasa2);
        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.dado);

        findViewById(R.id.juesilca9).setOnClickListener(this);
        findViewById(R.id.juesilca10).setOnClickListener(this);
        findViewById(R.id.juesilca11).setOnClickListener(this);
        findViewById(R.id.juesilca12).setOnClickListener(this);
        findViewById(R.id.juesilca13).setOnClickListener(this);
        findViewById(R.id.juesilca14).setOnClickListener(this);
        findViewById(R.id.juesilca15).setOnClickListener(this);
        findViewById(R.id.juesilca16).setOnClickListener(this);


        Button sonidoa = (Button)findViewById(R.id.sonidosilabas77);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp4.start();

            }
        });

        Button inicio= (Button) findViewById(R.id.casa_juegosil2);
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


            case R.id.juesilca9:


                err.setVisibility(View.VISIBLE);
                mp4.stop();

                mp2.start();

                break;
            case R.id.juesilca10:
                err.setVisibility(View.VISIBLE);
                mp4.stop();
                mp2.start();

                break;

            case R.id.juesilca11:
                err1.setVisibility(View.VISIBLE);
                mp4.stop();
                mp5.start();
                err.setVisibility(View.GONE);
                silbe.setVisibility(View.INVISIBLE);

                break;
            case R.id.juesilca12:
                err.setVisibility(View.VISIBLE);
                mp4.stop();
                mp2.start();


                break;

            case R.id.juesilca13:
                err.setVisibility(View.VISIBLE);
                mp4.stop();
                mp2.start();

                break;
            case R.id.juesilca14:
                err.setVisibility(View.VISIBLE);
                mp4.stop();
                mp2.start();
                break;
            case R.id.juesilca15:
                mp4.stop();
                if(err1.getVisibility()==View.VISIBLE) {


                    silbos.setVisibility(View.INVISIBLE);
                    silbe.setVisibility(View.INVISIBLE);
                    err.setVisibility(View.GONE);
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);
                    err3.setVisibility(View.VISIBLE);

                    mp3.start();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Intent intent = new Intent(juegosilabas2.this, juegosilabas3.class);

                            startActivity(intent);
                            overridePendingTransition(R.anim.left_in, R.anim.left_out);
                            finish();


                        }
                    }, 4000);
                }else{

                    mp2.start();
                }


                break;
            case R.id.juesilca16:
                mp4.stop();
                err.setVisibility(View.VISIBLE);
                mp2.start();
                break;


        }



    }
}




