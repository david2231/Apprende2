package gz.app.comdavid.apprende2.Silabas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.juegosil71;
import gz.app.comdavid.apprende2.silabas;


public class silaba_z extends AppCompatActivity  implements View.OnClickListener{

    ImageView silza,silzas,silze,silzes,silzo,silzos,silzis,silzi,silzu,silzus;
    MediaPlayer mpza;
    MediaPlayer mpzaa;
    MediaPlayer mpze;
    MediaPlayer mpzee;
    MediaPlayer mpzi;
    MediaPlayer mpzii;
    MediaPlayer mpzo;
    MediaPlayer mpzoo;
    MediaPlayer mpzu;
    MediaPlayer mpzuu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_z);

        silza=(ImageView) findViewById(R.id.zanahorias);
        silzas=(ImageView) findViewById(R.id.zapatos);
        silze=(ImageView) findViewById(R.id.zebras);
        silzo=(ImageView) findViewById(R.id.zorros);
        silzus=(ImageView) findViewById(R.id.zumbidos);
        silzu=(ImageView) findViewById(R.id.zumos);
        silzi=(ImageView) findViewById(R.id.zins);
        findViewById(R.id.zas).setOnClickListener(this);
        findViewById(R.id.zes).setOnClickListener(this);
        findViewById(R.id.zos).setOnClickListener(this);
        findViewById(R.id.zis).setOnClickListener(this);
        findViewById(R.id.zus).setOnClickListener(this);

        Button sig= (Button) findViewById(R.id.sigz);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), juegosil71.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finish();
            }
        });



        Button inicio= (Button) findViewById(R.id.sil_casaz);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), silabas.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        });

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.zas:
                if(silza.getVisibility()==View.GONE){

                    silza.setVisibility(View.VISIBLE);
                    silzas.setVisibility(View.VISIBLE);
                    silze.setVisibility(View.GONE);
                    silzo.setVisibility(View.GONE);
                    silzi.setVisibility(View.GONE);
                    silzu.setVisibility(View.GONE);
                    silzus.setVisibility(View.GONE);

                    ImageView sonidoba = (ImageView) findViewById(R.id.zanahorias);
                    mpza= MediaPlayer.create(this,R.raw.zanahoria);
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpza.start();

                        }
                    });

                    ImageView sonidobaa = (ImageView) findViewById(R.id.zapatos);
                    mpzaa= MediaPlayer.create(this,R.raw.zapato);
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpzaa.start();

                        }
                    });















                }
                else{
                    silza.setVisibility(View.GONE);
                    silzas.setVisibility(View.GONE);
                }

                break;
            case R.id.zes:
                if(silze.getVisibility()==View.GONE){
                    silze.setVisibility(View.VISIBLE);
                    silza.setVisibility(View.GONE);
                    silzas.setVisibility(View.GONE);
                    silzo.setVisibility(View.GONE);
                    silzi.setVisibility(View.GONE);
                    silzu.setVisibility(View.GONE);
                    silzus.setVisibility(View.GONE);

                    ImageView sonidobe = (ImageView) findViewById(R.id.zebras);
                    mpze= MediaPlayer.create(this,R.raw.zebra);
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpze.start();

                        }
                    });



                }
                else{
                    silze.setVisibility(View.GONE);

                }

                break;

            case R.id.zos:
                if(silzo.getVisibility()==View.GONE){
                    silzo.setVisibility(View.VISIBLE);

                    silza.setVisibility(View.GONE);
                    silzas.setVisibility(View.GONE);
                    silze.setVisibility(View.GONE);

                    silzi.setVisibility(View.GONE);

                    silzu.setVisibility(View.GONE);
                    silzus.setVisibility(View.GONE);

                    ImageView sonidobo = (ImageView) findViewById(R.id.zorros);
                    mpzo= MediaPlayer.create(this,R.raw.zorro);
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpzo.start();

                        }
                    });

                }
                else{
                    silzo.setVisibility(View.GONE);
                }
                break;

            case R.id.zis:
                if(silzi.getVisibility()==View.GONE){
                    silzi.setVisibility(View.VISIBLE);
                    silzo.setVisibility(View.GONE);

                    silza.setVisibility(View.GONE);
                    silzas.setVisibility(View.GONE);
                    silze.setVisibility(View.GONE);

                    silzu.setVisibility(View.GONE);
                    silzus.setVisibility(View.GONE);
                    ImageView sonidobi = (ImageView) findViewById(R.id.zins);
                    mpzi= MediaPlayer.create(this,R.raw.zinc);
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpzi.start();

                        }
                    });



                }
                else{
                    silzi.setVisibility(View.GONE);

                }

                break;

            case R.id.zus:
                if(silzu.getVisibility()==View.GONE){
                    silzu.setVisibility(View.VISIBLE);
                    silzus.setVisibility(View.VISIBLE);
                    silzi.setVisibility(View.GONE);

                    silzo.setVisibility(View.GONE);
                    silza.setVisibility(View.GONE);
                    silzas.setVisibility(View.GONE);
                    silze.setVisibility(View.GONE);

                    ImageView sonidobu = (ImageView) findViewById(R.id.zumbidos);
                    mpzu= MediaPlayer.create(this,R.raw.zumbido);
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpzu.start();

                        }
                    });

                    ImageView sonidobuu = (ImageView) findViewById(R.id.zumos);
                    mpzuu= MediaPlayer.create(this,R.raw.zumo);
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpzuu.start();

                        }
                    });

                }
                else{
                    silzu.setVisibility(View.GONE);
                    silzus.setVisibility(View.GONE);
                }

                break;
        }

    }
}
