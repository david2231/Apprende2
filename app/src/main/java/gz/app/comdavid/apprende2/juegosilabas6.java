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

public class juegosilabas6 extends AppCompatActivity  implements View.OnClickListener{

    ImageView err,err1,err2,err3,err4;
    Button silba,silbas,silbe,silbi,silbis,silbo,silbos,silbu;
    MediaPlayer mp,mp2,mp3,mp4,mp5,mp6,mp7;

    RelativeLayout casss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegosilabas6);
        mp4= MediaPlayer.create(this,R.raw.seleccionapayaso);
        mp5= MediaPlayer.create(this,R.raw.pa);
        mp6= MediaPlayer.create(this,R.raw.ya);
        mp7= MediaPlayer.create(this,R.raw.so);
        mp4.start();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        silba=(Button) findViewById(R.id.juesilca41);
        silbas=(Button) findViewById(R.id.juesilca42);
        silbe=(Button) findViewById(R.id.juesilca43);
        silbi=(Button) findViewById(R.id.juesilca44);
        silbis=(Button) findViewById(R.id.juesilca45);
        silbo=(Button) findViewById(R.id.juesilca46);
        silbos=(Button) findViewById(R.id.juesilca47);
        silbu=(Button) findViewById(R.id.juesilca48);
        err=(ImageView) findViewById(R.id.errorjuego6);
        err1=(ImageView) findViewById(R.id.imagenca6);
        err2=(ImageView) findViewById(R.id.imagenesss6);
        err3=(ImageView) findViewById(R.id.imagencasa6);
        err4=(ImageView) findViewById(R.id.imagensa6);

        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.payaso);

        findViewById(R.id.juesilca41).setOnClickListener(this);
        findViewById(R.id.juesilca42).setOnClickListener(this);
        findViewById(R.id.juesilca43).setOnClickListener(this);
        findViewById(R.id.juesilca44).setOnClickListener(this);
        findViewById(R.id.juesilca45).setOnClickListener(this);
        findViewById(R.id.juesilca46).setOnClickListener(this);
        findViewById(R.id.juesilca47).setOnClickListener(this);
        findViewById(R.id.juesilca48).setOnClickListener(this);

        Button sonidoa = (Button)findViewById(R.id.sonidosilabas81);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp4.start();

            }
        });


        Button inicio= (Button) findViewById(R.id.casa_juegosil6);
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


            case R.id.juesilca41:
                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();

                break;
            case R.id.juesilca42:

                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();


                break;

            case R.id.juesilca43:

                err1.setVisibility(View.VISIBLE);
                silbe.setVisibility(View.INVISIBLE);
                err.setVisibility(View.GONE);
                mp4.stop();
                mp5.start();


                break;
            case R.id.juesilca44:
                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();

                break;

            case R.id.juesilca45:
                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();
                break;
            case R.id.juesilca46:

                if(err1.getVisibility()==View.VISIBLE) {
                    mp4.stop();

                    silbe.setVisibility(View.INVISIBLE);
                    silbo.setVisibility(View.INVISIBLE);
                    err.setVisibility(View.INVISIBLE);
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);

                    mp6.start();

                }else{
                    err.setVisibility(View.VISIBLE);
                    mp2.start();
                }


                break;
            case R.id.juesilca47:
                if(err1.getVisibility()==View.VISIBLE&&err2.getVisibility()==View.VISIBLE) {
                    mp4.stop();
                    silbe.setVisibility(View.INVISIBLE);
                    silbo.setVisibility(View.INVISIBLE);
                    err.setVisibility(View.INVISIBLE);
                    silbos.setVisibility(View.INVISIBLE);
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);
                    err3.setVisibility(View.VISIBLE);
                    err4.setVisibility(View.VISIBLE);
                    mp3.start();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Intent intent = new Intent(juegosilabas6.this,juegosilabas7.class);

                            startActivity(intent);
                            overridePendingTransition(R.anim.left_in, R.anim.left_out);

                            finish();


                        }
                    }, 4000);
                }else{
                    err.setVisibility(View.VISIBLE);
                    mp2.start();
                }

                break;
            case R.id.juesilca48:

                err.setVisibility(View.VISIBLE);
                mp2.start();

                break;



        }



    }
}




