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

public class juegosilabas9 extends AppCompatActivity  implements View.OnClickListener{

    ImageView err,err1,err2,err3,err4;
    Button silba,silbas,silbe,silbi,silbis,silbo,silbos,silbu;
    MediaPlayer mp,mp2,mp3,mp4,mp5,mp6,mp7;

    RelativeLayout casss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegosilabas9);
        mp4= MediaPlayer.create(this,R.raw.seleccionaveneno);
        mp5= MediaPlayer.create(this,R.raw.ve);
        mp6= MediaPlayer.create(this,R.raw.ne);
        mp7= MediaPlayer.create(this,R.raw.no);
        mp4.start();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        silba=(Button) findViewById(R.id.juesilca65);
        silbas=(Button) findViewById(R.id.juesilca66);
        silbe=(Button) findViewById(R.id.juesilca67);
        silbi=(Button) findViewById(R.id.juesilca68);
        silbis=(Button) findViewById(R.id.juesilca69);
        silbo=(Button) findViewById(R.id.juesilca70);
        silbos=(Button) findViewById(R.id.juesilca71);
        silbu=(Button) findViewById(R.id.juesilca72);
        err=(ImageView) findViewById(R.id.errorjuego9);
        err1=(ImageView) findViewById(R.id.imagenca9);
        err2=(ImageView) findViewById(R.id.imagenesss9);
        err3=(ImageView) findViewById(R.id.imagencasa9);
        err4=(ImageView) findViewById(R.id.imagensa9);

        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.veneno);

        findViewById(R.id.juesilca65).setOnClickListener(this);
        findViewById(R.id.juesilca66).setOnClickListener(this);
        findViewById(R.id.juesilca67).setOnClickListener(this);
        findViewById(R.id.juesilca68).setOnClickListener(this);
        findViewById(R.id.juesilca69).setOnClickListener(this);
        findViewById(R.id.juesilca70).setOnClickListener(this);
        findViewById(R.id.juesilca71).setOnClickListener(this);
        findViewById(R.id.juesilca72).setOnClickListener(this);

        Button sonidoa = (Button)findViewById(R.id.sonidosilabas84);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp4.start();

            }
        });


        Button inicio= (Button) findViewById(R.id.casa_juegosil9);
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


            case R.id.juesilca65:

                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();

                break;
            case R.id.juesilca66:
                err.setVisibility(View.VISIBLE);
                mp2.start();


                break;

            case R.id.juesilca67:
                err.setVisibility(View.VISIBLE);

                mp4.stop();
                mp2.start();

                break;
            case R.id.juesilca68:
                err.setVisibility(View.INVISIBLE);
                err1.setVisibility(View.VISIBLE);
                silbi.setVisibility(View.INVISIBLE);

                mp4.stop();
                mp5.start();


                break;

            case R.id.juesilca69:
                if(err1.getVisibility()==View.VISIBLE&&err2.getVisibility()==View.VISIBLE) {
                    mp4.stop();
                    silbi.setVisibility(View.INVISIBLE);
                    silbo.setVisibility(View.INVISIBLE);
                    silbis.setVisibility(View.INVISIBLE);
                    err.setVisibility(View.INVISIBLE);
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);
                    err3.setVisibility(View.VISIBLE);
                    err4.setVisibility(View.VISIBLE);
                    mp3.start();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Intent intent = new Intent(juegosilabas9.this, juegosilabas10.class);

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
            case R.id.juesilca70:
                mp4.stop();
                if(err1.getVisibility()==View.VISIBLE) {
                    mp6.start();

                    silbi.setVisibility(View.INVISIBLE);
                    silbo.setVisibility(View.INVISIBLE);
                    err.setVisibility(View.INVISIBLE);
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);



                }else{

                    mp2.start();
                    err.setVisibility(View.VISIBLE);
                }




                break;
            case R.id.juesilca71:
                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();

                break;
            case R.id.juesilca72:
                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();


                break;



        }



    }
}




