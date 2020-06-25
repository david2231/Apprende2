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

public class juegosilabas7 extends AppCompatActivity  implements View.OnClickListener{

    ImageView err,err1,err2,err3,err4;
    Button silba,silbas,silbe,silbi,silbis,silbo,silbos,silbu;
    MediaPlayer mp,mp2,mp3,mp4,mp5,mp6,mp7;

    RelativeLayout casss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegosilabas7);
        mp4= MediaPlayer.create(this,R.raw.seleccionatomate);
        mp5= MediaPlayer.create(this,R.raw.to);
        mp6= MediaPlayer.create(this,R.raw.ma);
        mp7= MediaPlayer.create(this,R.raw.te);
        mp4.start();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        silba=(Button) findViewById(R.id.juesilca49);
        silbas=(Button) findViewById(R.id.juesilca50);
        silbe=(Button) findViewById(R.id.juesilca51);
        silbi=(Button) findViewById(R.id.juesilca52);
        silbis=(Button) findViewById(R.id.juesilca53);
        silbo=(Button) findViewById(R.id.juesilca54);
        silbos=(Button) findViewById(R.id.juesilca55);
        silbu=(Button) findViewById(R.id.juesilca56);
        err=(ImageView) findViewById(R.id.errorjuego7);
        err1=(ImageView) findViewById(R.id.imagenca7);
        err2=(ImageView) findViewById(R.id.imagenesss7);
        err3=(ImageView) findViewById(R.id.imagencasa7);
        err4=(ImageView) findViewById(R.id.imagensa7);

        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.tomate);

        findViewById(R.id.juesilca49).setOnClickListener(this);
        findViewById(R.id.juesilca50).setOnClickListener(this);
        findViewById(R.id.juesilca51).setOnClickListener(this);
        findViewById(R.id.juesilca52).setOnClickListener(this);
        findViewById(R.id.juesilca53).setOnClickListener(this);
        findViewById(R.id.juesilca54).setOnClickListener(this);
        findViewById(R.id.juesilca55).setOnClickListener(this);
        findViewById(R.id.juesilca56).setOnClickListener(this);

        Button sonidoa = (Button)findViewById(R.id.sonidosilabas82);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp4.start();

            }
        });


        Button inicio= (Button) findViewById(R.id.casa_juegosil7);
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


            case R.id.juesilca49:
                err.setVisibility(View.INVISIBLE);
                err1.setVisibility(View.VISIBLE);
                silba.setVisibility(View.INVISIBLE);

                mp4.stop();
                mp5.start();


                break;
            case R.id.juesilca50:
                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();

                break;

            case R.id.juesilca51:

                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();

                break;
            case R.id.juesilca52:
                err.setVisibility(View.VISIBLE);
                mp2.start();

                break;

            case R.id.juesilca53:
                if(err1.getVisibility()==View.VISIBLE&&err2.getVisibility()==View.VISIBLE) {
                    mp4.stop();
                    silba.setVisibility(View.INVISIBLE);
                    silbu.setVisibility(View.INVISIBLE);
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

                            Intent intent = new Intent(juegosilabas7.this, juegosilabas8.class);
                            overridePendingTransition(R.anim.left_in, R.anim.left_out);
                            startActivity(intent);
                            finish();


                        }
                    }, 4000);
                }else{

                    mp2.start();
                    err.setVisibility(View.VISIBLE);
                }

                break;
            case R.id.juesilca54:
                err.setVisibility(View.VISIBLE);

                mp4.stop();
                mp2.start();


                break;
            case R.id.juesilca55:

                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();
                break;
            case R.id.juesilca56:


                mp4.stop();
                if(err1.getVisibility()==View.VISIBLE) {
                    mp6.start();

                    silba.setVisibility(View.INVISIBLE);
                    silbu.setVisibility(View.INVISIBLE);
                    err.setVisibility(View.INVISIBLE);
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);



                }else{

                    mp2.start();
                    err.setVisibility(View.VISIBLE);
                }
                break;



        }



    }
}




