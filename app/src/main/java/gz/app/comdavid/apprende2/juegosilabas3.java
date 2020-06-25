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

public class juegosilabas3 extends AppCompatActivity  implements View.OnClickListener{

    ImageView err,err1,err2,err3;
    Button silba,silbas,silbe,silbi,silbis,silbo,silbos,silbu;
    MediaPlayer mp,mp2,mp3,mp4,mp5,mp6;

    RelativeLayout casss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mp4= MediaPlayer.create(this,R.raw.seleccionagota);
        mp5= MediaPlayer.create(this,R.raw.go);
        mp6= MediaPlayer.create(this,R.raw.ta);
        mp4.start();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_juegosilabas3);
        silba=(Button) findViewById(R.id.juesilca17);
        silbas=(Button) findViewById(R.id.juesilca18);
        silbe=(Button) findViewById(R.id.juesilca19);
        silbi=(Button) findViewById(R.id.juesilca20);
        silbis=(Button) findViewById(R.id.juesilca21);
        silbo=(Button) findViewById(R.id.juesilca22);
        silbos=(Button) findViewById(R.id.juesilca23);
        silbu=(Button) findViewById(R.id.juesilca24);
        err=(ImageView) findViewById(R.id.errorjuego3);
        err1=(ImageView) findViewById(R.id.imagenca3);
        err2=(ImageView) findViewById(R.id.imagensa3);
        err3=(ImageView) findViewById(R.id.imagencasa3);
        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.gota);

        findViewById(R.id.juesilca17).setOnClickListener(this);
        findViewById(R.id.juesilca18).setOnClickListener(this);
        findViewById(R.id.juesilca19).setOnClickListener(this);
        findViewById(R.id.juesilca20).setOnClickListener(this);
        findViewById(R.id.juesilca21).setOnClickListener(this);
        findViewById(R.id.juesilca22).setOnClickListener(this);
        findViewById(R.id.juesilca23).setOnClickListener(this);
        findViewById(R.id.juesilca24).setOnClickListener(this);


        Button sonidoa = (Button)findViewById(R.id.sonidosilabas78);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp4.start();

            }
        });

        Button inicio= (Button) findViewById(R.id.casa_juegosil3);
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


            case R.id.juesilca17:
                mp4.stop();
                mp5.start();
                err1.setVisibility(View.VISIBLE);
                err.setVisibility(View.GONE);
                silba.setVisibility(View.INVISIBLE);


                break;
            case R.id.juesilca18:
                mp4.stop();
                err.setVisibility(View.VISIBLE);
                mp2.start();

                break;

            case R.id.juesilca19:
                mp4.stop();
                err.setVisibility(View.VISIBLE);

                mp2.start();


                break;
            case R.id.juesilca20:
                mp4.stop();
                err.setVisibility(View.VISIBLE);
                mp2.start();


                break;

            case R.id.juesilca21:
                mp4.stop();
                err.setVisibility(View.VISIBLE);
                mp2.start();

                break;
            case R.id.juesilca22:
                mp4.stop();
                err.setVisibility(View.VISIBLE);
                mp2.start();
                break;
            case R.id.juesilca23:
                mp4.stop();
                err.setVisibility(View.VISIBLE);
                mp2.start();

                break;
            case R.id.juesilca24:

                mp4.stop();
                if(err1.getVisibility()==View.VISIBLE) {


                    silba.setVisibility(View.INVISIBLE);
                    silbu.setVisibility(View.INVISIBLE);
                    err.setVisibility(View.GONE);
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);
                    err3.setVisibility(View.VISIBLE);

                    mp3.start();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Intent intent = new Intent(juegosilabas3.this, juegosilabas4.class);

                            startActivity(intent);
                            overridePendingTransition(R.anim.left_in, R.anim.left_out);
                            finish();


                        }
                    }, 4000);
                }else{

                    mp2.start();
                }

                break;



        }



    }
}




