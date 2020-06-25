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

public class juegosilabas5 extends AppCompatActivity  implements View.OnClickListener{

    ImageView err,err1,err2,err3;
    Button silba,silbas,silbe,silbi,silbis,silbo,silbos,silbu;
    MediaPlayer mp,mp2,mp3,mp4,mp5,mp6;

    RelativeLayout casss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegosilabas5);
        mp4= MediaPlayer.create(this,R.raw.seleccionarana);
        mp5= MediaPlayer.create(this,R.raw.ra);
        mp6= MediaPlayer.create(this,R.raw.na);
        mp4.start();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        silba=(Button) findViewById(R.id.juesilca33);
        silbas=(Button) findViewById(R.id.juesilca34);
        silbe=(Button) findViewById(R.id.juesilca35);
        silbi=(Button) findViewById(R.id.juesilca36);
        silbis=(Button) findViewById(R.id.juesilca37);
        silbo=(Button) findViewById(R.id.juesilca38);
        silbos=(Button) findViewById(R.id.juesilca39);
        silbu=(Button) findViewById(R.id.juesilca30);
        err=(ImageView) findViewById(R.id.errorjuego5);
        err1=(ImageView) findViewById(R.id.imagenca5);
        err2=(ImageView) findViewById(R.id.imagensa5);
        err3=(ImageView) findViewById(R.id.imagencasa5);
        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.rana);

        findViewById(R.id.juesilca33).setOnClickListener(this);
        findViewById(R.id.juesilca34).setOnClickListener(this);
        findViewById(R.id.juesilca35).setOnClickListener(this);
        findViewById(R.id.juesilca36).setOnClickListener(this);
        findViewById(R.id.juesilca37).setOnClickListener(this);
        findViewById(R.id.juesilca38).setOnClickListener(this);
        findViewById(R.id.juesilca39).setOnClickListener(this);
        findViewById(R.id.juesilca40).setOnClickListener(this);


        Button sonidoa = (Button)findViewById(R.id.sonidosilabas80);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp4.start();

            }
        });

        Button inicio= (Button) findViewById(R.id.casa_juegosil5);
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


            case R.id.juesilca33:
                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();

                break;
            case R.id.juesilca34:

                err.setVisibility(View.VISIBLE);
                mp4.stop();
                mp2.start();

                break;

            case R.id.juesilca35:

                err1.setVisibility(View.VISIBLE);
                err.setVisibility(View.GONE);
                mp4.stop();
                mp5.start();
                silbe.setVisibility(View.INVISIBLE);

                break;
            case R.id.juesilca36:
                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();

                break;

            case R.id.juesilca37:
                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();
                break;
            case R.id.juesilca38:

                if(err1.getVisibility()==View.VISIBLE) {
                    mp4.stop();

                    silbe.setVisibility(View.INVISIBLE);
                    silbo.setVisibility(View.INVISIBLE);
                    err.setVisibility(View.GONE);
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);
                    err3.setVisibility(View.VISIBLE);

                    mp3.start();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Intent intent = new Intent(juegosilabas5.this, juegos.class);

                            startActivity(intent);
                            overridePendingTransition(R.anim.left_in, R.anim.left_out);
                            finish();


                        }
                    }, 4000);
                }else{

                    mp2.start();
                }


                break;
            case R.id.juesilca39:
                err.setVisibility(View.VISIBLE);
                mp2.start();

                break;
            case R.id.juesilca40:

                err.setVisibility(View.VISIBLE);
                mp2.start();

                break;



        }



    }
}




