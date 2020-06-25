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

public class juegosilabas10 extends AppCompatActivity  implements View.OnClickListener{

    ImageView err,err1,err2,err3,err4,err5;
    Button silba,silbas,silbe,silbi,silbis,silbo,silbos,silbu;
    MediaPlayer mp,mp2,mp3,mp4,mp5,mp6,mp7;

    RelativeLayout casss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegosilabas10);
        mp4= MediaPlayer.create(this,R.raw.seleccionagasolina);
        mp5= MediaPlayer.create(this,R.raw.ga);
        mp6= MediaPlayer.create(this,R.raw.so);
        mp7= MediaPlayer.create(this,R.raw.li);
        mp4.start();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        silba=(Button) findViewById(R.id.juesilca73);
        silbas=(Button) findViewById(R.id.juesilca74);
        silbe=(Button) findViewById(R.id.juesilca75);
        silbi=(Button) findViewById(R.id.juesilca76);
        silbis=(Button) findViewById(R.id.juesilca77);
        silbo=(Button) findViewById(R.id.juesilca78);
        silbos=(Button) findViewById(R.id.juesilca79);
        silbu=(Button) findViewById(R.id.juesilca80);
        err=(ImageView) findViewById(R.id.errorjuego10);
        err1=(ImageView) findViewById(R.id.imagenca10);
        err2=(ImageView) findViewById(R.id.imagenesss10);
        err3=(ImageView) findViewById(R.id.imagencasa10);
        err4=(ImageView) findViewById(R.id.imagensa10);
        err5=(ImageView) findViewById(R.id.imageneses10);

        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.gasolina);

        findViewById(R.id.juesilca73).setOnClickListener(this);
        findViewById(R.id.juesilca74).setOnClickListener(this);
        findViewById(R.id.juesilca75).setOnClickListener(this);
        findViewById(R.id.juesilca76).setOnClickListener(this);
        findViewById(R.id.juesilca77).setOnClickListener(this);
        findViewById(R.id.juesilca78).setOnClickListener(this);
        findViewById(R.id.juesilca79).setOnClickListener(this);
        findViewById(R.id.juesilca80).setOnClickListener(this);


        Button sonidoa = (Button)findViewById(R.id.sonidosilabas85);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp4.start();

            }
        });

        Button inicio= (Button) findViewById(R.id.casa_juegosil10);
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


            case R.id.juesilca73:
                err.setVisibility(View.INVISIBLE);
                err1.setVisibility(View.VISIBLE);
                silba.setVisibility(View.INVISIBLE);

                mp4.stop();
                mp5.start();


                break;
            case R.id.juesilca74:
                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();
                break;

            case R.id.juesilca75:
                err.setVisibility(View.VISIBLE);

                mp4.stop();
                mp2.start();

                break;
            case R.id.juesilca76:

                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();

                break;

            case R.id.juesilca77:
                mp4.stop();
                if(err1.getVisibility()==View.VISIBLE) {
                    mp6.start();

                    silbis.setVisibility(View.INVISIBLE);
                    silba.setVisibility(View.INVISIBLE);
                    err.setVisibility(View.INVISIBLE);
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);



                }else{

                    mp2.start();
                    err.setVisibility(View.VISIBLE);
                }




                break;
            case R.id.juesilca78:
                if(err1.getVisibility()==View.VISIBLE&&err2.getVisibility()==View.VISIBLE) {
                    mp4.stop();
                    silba.setVisibility(View.INVISIBLE);
                    silbo.setVisibility(View.INVISIBLE);
                    silbis.setVisibility(View.INVISIBLE);
                    err.setVisibility(View.INVISIBLE);
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);

                    err4.setVisibility(View.VISIBLE);
                    mp7.start();

                }else{

                    mp2.start();
                    err.setVisibility(View.VISIBLE);
                }



                break;
            case R.id.juesilca79:
                if(err1.getVisibility()==View.VISIBLE&&err2.getVisibility()==View.VISIBLE&&err4.getVisibility()==View.VISIBLE) {
                    mp4.stop();
                    silba.setVisibility(View.INVISIBLE);
                    silbo.setVisibility(View.INVISIBLE);
                    silbis.setVisibility(View.INVISIBLE);
                    silbos.setVisibility(View.INVISIBLE);
                    err.setVisibility(View.INVISIBLE);
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);
                    err3.setVisibility(View.VISIBLE);
                    err4.setVisibility(View.VISIBLE);
                    err5.setVisibility(View.VISIBLE);
                    mp3.start();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Intent intent = new Intent(juegosilabas10.this, juegos.class);

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
            case R.id.juesilca80:
                err.setVisibility(View.VISIBLE);
                mp2.start();
                mp4.stop();


                break;



        }



    }
}





