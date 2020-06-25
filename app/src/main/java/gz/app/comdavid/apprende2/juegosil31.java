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

public class juegosil31 extends AppCompatActivity implements View.OnClickListener  {

    ImageView silba,silbas,silbe,err;
    MediaPlayer mp,mp2,mp3,mp4;

    RelativeLayout casss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegosil31);
        mp4= MediaPlayer.create(this,R.raw.seleccionama);
        mp4.start();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        silba=(ImageView) findViewById(R.id.siljuegoma2);
        silbas=(ImageView) findViewById(R.id.siljuegome);
        silbe=(ImageView) findViewById(R.id.siljuegomi);
        err=(ImageView) findViewById(R.id.silerror31);
        casss=(RelativeLayout) findViewById(R.id.vista31);
        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.mama);

        findViewById(R.id.siljuegoma2).setOnClickListener(this);
        findViewById(R.id.siljuegomi).setOnClickListener(this);
        findViewById(R.id.siljuegome).setOnClickListener(this);
        findViewById(R.id.siljuegoma).setOnClickListener(this);


        Button sonidoa = (Button)findViewById(R.id.sonidosilabas31);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp4.start();

            }
        });


        Button inicio= (Button) findViewById(R.id.casa_sill31);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),silabas.class);
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
            case R.id.siljuegoma2:


                err.setVisibility(View.VISIBLE);
                mp4.stop();
                mp2.start();

                break;
            case R.id.siljuegomi:
                err.setVisibility(View.VISIBLE);
                mp4.stop();
                mp2.start();

                break;

            case R.id.siljuegome:
                silba.setVisibility(View.GONE);
                silbas.setVisibility(View.GONE);
                silbe.setVisibility(View.GONE);
                err.setVisibility(View.GONE);
                casss.setVisibility(View.VISIBLE);
                mp4.stop();
                mp3.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent intent=new Intent(juegosil31.this,juegosil32.class);

                        startActivity(intent);
                        overridePendingTransition(R.anim.left_in, R.anim.left_out);

                        finish();

                    }
                },4000);




                break;

            case R.id.siljuegoma:

                break;


        }
    }
}







