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

public class juegosil54 extends AppCompatActivity implements View.OnClickListener  {

    ImageView silba,silbas,silbe,err;
    MediaPlayer mp,mp2,mp3,mp4;

    RelativeLayout casss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegosil54);
        mp4= MediaPlayer.create(this,R.raw.seleccionaelobjeto);
        mp4.start();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        silba=(ImageView) findViewById(R.id.siljuegoso2);
        silbas=(ImageView) findViewById(R.id.siljuegosi4);
        silbe=(ImageView) findViewById(R.id.siljuegosi5);
        err=(ImageView) findViewById(R.id.silerror54);
        casss=(RelativeLayout) findViewById(R.id.vista54);
        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.sol);

        findViewById(R.id.siljuegoso).setOnClickListener(this);
        findViewById(R.id.siljuegoso2).setOnClickListener(this);
        findViewById(R.id.siljuegosi4).setOnClickListener(this);
        findViewById(R.id.siljuegosi5).setOnClickListener(this);

        Button sonidoa = (Button)findViewById(R.id.sonidosilabas54);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp4.start();

            }
        });

        Button inicio= (Button) findViewById(R.id.casa_sill54);
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
            case R.id.siljuegosi4:


                err.setVisibility(View.VISIBLE);
                mp4.stop();
                mp2.start();

                break;
            case R.id.siljuegosi5:
                err.setVisibility(View.VISIBLE);
                mp4.stop();
                mp2.start();

                break;

            case R.id.siljuegoso2:
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

                        Intent intent=new Intent(juegosil54.this,juegosil55.class);

                        startActivity(intent);
                        overridePendingTransition(R.anim.left_in, R.anim.left_out);
                        finish();


                    }
                },4000);




                break;

            case R.id.siljuegoso:

                break;


        }
    }
}




