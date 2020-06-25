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

public class juegosilabas4 extends AppCompatActivity  implements View.OnClickListener{

    ImageView err,err1,err2,err3;
    Button silba,silbas,silbe,silbi,silbis,silbo,silbos,silbu;
    MediaPlayer mp,mp2,mp3,mp4,mp5,mp6;

    RelativeLayout casss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegosilabas4);
        mp4= MediaPlayer.create(this,R.raw.seleccionapera);
        mp5= MediaPlayer.create(this,R.raw.pe);
        mp6= MediaPlayer.create(this,R.raw.ra);
        mp4.start();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        silba=(Button) findViewById(R.id.juesilca25);
        silbas=(Button) findViewById(R.id.juesilca26);
        silbe=(Button) findViewById(R.id.juesilca27);
        silbi=(Button) findViewById(R.id.juesilca28);
        silbis=(Button) findViewById(R.id.juesilca29);
        silbo=(Button) findViewById(R.id.juesilca30);
        silbos=(Button) findViewById(R.id.juesilca31);
        silbu=(Button) findViewById(R.id.juesilca32);
        err=(ImageView) findViewById(R.id.errorjuego4);
        err1=(ImageView) findViewById(R.id.imagenca4);
        err2=(ImageView) findViewById(R.id.imagensa4);
        err3=(ImageView) findViewById(R.id.imagencasa4);
        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.pera);

        findViewById(R.id.juesilca25).setOnClickListener(this);
        findViewById(R.id.juesilca26).setOnClickListener(this);
        findViewById(R.id.juesilca27).setOnClickListener(this);
        findViewById(R.id.juesilca28).setOnClickListener(this);
        findViewById(R.id.juesilca29).setOnClickListener(this);
        findViewById(R.id.juesilca30).setOnClickListener(this);
        findViewById(R.id.juesilca31).setOnClickListener(this);
        findViewById(R.id.juesilca32).setOnClickListener(this);


        Button sonidoa = (Button)findViewById(R.id.sonidosilabas79);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp4.start();

            }
        });

        Button inicio= (Button) findViewById(R.id.casa_juegosil4);
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


            case R.id.juesilca25:
                mp4.stop();
                err.setVisibility(View.VISIBLE);
                mp2.start();


                break;
            case R.id.juesilca26:
                mp5.start();
                mp4.stop();
                err1.setVisibility(View.VISIBLE);
                err.setVisibility(View.GONE);
                silbas.setVisibility(View.INVISIBLE);


                break;

            case R.id.juesilca27:

                mp4.stop();

                err.setVisibility(View.VISIBLE);

                mp2.start();


                break;
            case R.id.juesilca28:
                mp4.stop();
                err.setVisibility(View.VISIBLE);
                mp2.start();


                break;

            case R.id.juesilca29:
                mp4.stop();
                if(err1.getVisibility()==View.VISIBLE) {


                    silbas.setVisibility(View.INVISIBLE);
                    silbis.setVisibility(View.INVISIBLE);
                    err.setVisibility(View.GONE);
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);
                    err3.setVisibility(View.VISIBLE);

                    mp3.start();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Intent intent = new Intent(juegosilabas4.this, juegosilabas5.class);

                            startActivity(intent);
                            overridePendingTransition(R.anim.left_in, R.anim.left_out);
                            finish();


                        }
                    }, 4000);
                }else{

                    mp2.start();
                }


                break;
            case R.id.juesilca30:
                mp4.stop();
                err.setVisibility(View.VISIBLE);
                mp2.start();
                break;
            case R.id.juesilca31:
                mp4.stop();
                err.setVisibility(View.VISIBLE);
                mp2.start();

                break;
            case R.id.juesilca32:
                mp4.stop();
                err.setVisibility(View.VISIBLE);
                mp2.start();

                break;



        }



    }
}




