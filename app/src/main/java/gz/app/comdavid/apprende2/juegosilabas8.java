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

public class juegosilabas8 extends AppCompatActivity  implements View.OnClickListener{

    ImageView err,err1,err2,err3,err4;
    Button silba,silbas,silbe,silbi,silbis,silbo,silbos,silbu;
    MediaPlayer mp,mp2,mp3,mp4,mp5,mp6,mp7;

    RelativeLayout casss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegosilabas8);
        mp4= MediaPlayer.create(this,R.raw.seleccionazapato);
        mp5= MediaPlayer.create(this,R.raw.sa);
        mp6= MediaPlayer.create(this,R.raw.pa);
        mp7= MediaPlayer.create(this,R.raw.to);
        mp4.start();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        silba=(Button) findViewById(R.id.juesilca57);
        silbas=(Button) findViewById(R.id.juesilca58);
        silbe=(Button) findViewById(R.id.juesilca59);
        silbi=(Button) findViewById(R.id.juesilca60);
        silbis=(Button) findViewById(R.id.juesilca61);
        silbo=(Button) findViewById(R.id.juesilca62);
        silbos=(Button) findViewById(R.id.juesilca63);
        silbu=(Button) findViewById(R.id.juesilca64);
        err=(ImageView) findViewById(R.id.errorjuego8);
        err1=(ImageView) findViewById(R.id.imagenca8);
        err2=(ImageView) findViewById(R.id.imagenesss8);
        err3=(ImageView) findViewById(R.id.imagencasa8);
        err4=(ImageView) findViewById(R.id.imagensa8);

        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.zapato);

        findViewById(R.id.juesilca57).setOnClickListener(this);
        findViewById(R.id.juesilca58).setOnClickListener(this);
        findViewById(R.id.juesilca59).setOnClickListener(this);
        findViewById(R.id.juesilca60).setOnClickListener(this);
        findViewById(R.id.juesilca61).setOnClickListener(this);
        findViewById(R.id.juesilca62).setOnClickListener(this);
        findViewById(R.id.juesilca63).setOnClickListener(this);
        findViewById(R.id.juesilca64).setOnClickListener(this);


        Button sonidoa = (Button)findViewById(R.id.sonidosilabas83);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp4.start();

            }
        });

        Button inicio= (Button) findViewById(R.id.casa_juegosil8);
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


            case R.id.juesilca57:

                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();

                break;
            case R.id.juesilca58:
                err.setVisibility(View.INVISIBLE);
                err1.setVisibility(View.VISIBLE);
                silbas.setVisibility(View.INVISIBLE);

                mp4.stop();
                mp5.start();


                break;

            case R.id.juesilca59:
                mp4.stop();
                if(err1.getVisibility()==View.VISIBLE) {
                    mp6.start();

                    silbas.setVisibility(View.INVISIBLE);
                    silbe.setVisibility(View.INVISIBLE);
                    err.setVisibility(View.INVISIBLE);
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);



                }else{

                    mp2.start();
                    err.setVisibility(View.VISIBLE);
                }


                break;
            case R.id.juesilca60:
                err.setVisibility(View.VISIBLE);
                mp2.start();

                break;

            case R.id.juesilca61:
                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();

                break;
            case R.id.juesilca62:
                err.setVisibility(View.VISIBLE);

                mp4.stop();
                mp2.start();


                break;
            case R.id.juesilca63:
                if(err1.getVisibility()==View.VISIBLE&&err2.getVisibility()==View.VISIBLE) {
                    mp4.stop();
                    silbas.setVisibility(View.INVISIBLE);
                    silbe.setVisibility(View.INVISIBLE);
                    silbos.setVisibility(View.INVISIBLE);
                    err.setVisibility(View.INVISIBLE);
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);
                    err3.setVisibility(View.VISIBLE);
                    err4.setVisibility(View.VISIBLE);
                    mp3.start();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Intent intent = new Intent(juegosilabas8.this,juegosilabas9.class);

                            startActivity(intent);
                            overridePendingTransition(R.anim.left_in, R.anim.left_out);
                            finish();


                        }
                    }, 4000);
                }else{

                    mp2.start();
                    err.setVisibility(View.VISIBLE);
                }


                break;
            case R.id.juesilca64:
                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();


                break;



        }



    }
}




