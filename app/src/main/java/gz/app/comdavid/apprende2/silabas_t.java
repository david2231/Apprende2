package gz.app.comdavid.apprende2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class silabas_t extends AppCompatActivity  implements View.OnClickListener{

    ImageView silta,siltas,silte,siltes,silto,siltos,siltis,silti,siltu,siltus;
    MediaPlayer mpta;
    MediaPlayer mptaa;
    MediaPlayer mpte;
    MediaPlayer mptee;
    MediaPlayer mpti;
    MediaPlayer mptii;
    MediaPlayer mpto;
    MediaPlayer mptoo;
    MediaPlayer mptu;
    MediaPlayer mptuu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silabas_t);

        silta=(ImageView) findViewById(R.id.tablas);
        siltas=(ImageView) findViewById(R.id.tarjetas);
        silte=(ImageView) findViewById(R.id.teteros);
        siltes=(ImageView) findViewById(R.id.telefonos);
        siltos=(ImageView) findViewById(R.id.tomates);
        silto=(ImageView) findViewById(R.id.toros);
        siltus=(ImageView) findViewById(R.id.tubos);
        siltu=(ImageView) findViewById(R.id.tucanes);
        siltis=(ImageView) findViewById(R.id.tiburones);
        silti=(ImageView) findViewById(R.id.tigres);
        findViewById(R.id.tas).setOnClickListener(this);
        findViewById(R.id.tes).setOnClickListener(this);
        findViewById(R.id.tos).setOnClickListener(this);
        findViewById(R.id.tis).setOnClickListener(this);
        findViewById(R.id.tus).setOnClickListener(this);

        Button sig= (Button) findViewById(R.id.sigrt);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),juegosil56.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finish();
            }
        });

        Button inicio= (Button) findViewById(R.id.sil_casat);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),silabas.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        });

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.tas:
                if(silta.getVisibility()==View.GONE){

                    silta.setVisibility(View.VISIBLE);
                    siltas.setVisibility(View.VISIBLE);
                    silte.setVisibility(View.GONE);
                    siltes.setVisibility(View.GONE);
                    silto.setVisibility(View.GONE);
                    siltos.setVisibility(View.GONE);
                    silti.setVisibility(View.GONE);
                    siltis.setVisibility(View.GONE);
                    siltu.setVisibility(View.GONE);
                    siltus.setVisibility(View.GONE);

                    ImageView sonidoba = (ImageView) findViewById(R.id.tablas);
                    mpta= MediaPlayer.create(this,R.raw.tabla);
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpta.start();

                        }
                    });

                    ImageView sonidobaa = (ImageView) findViewById(R.id.tarjetas);
                    mptaa= MediaPlayer.create(this,R.raw.tarjeta);
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mptaa.start();

                        }
                    });










                }
                else{
                    silta.setVisibility(View.GONE);
                    siltas.setVisibility(View.GONE);
                }

                break;
            case R.id.tes:
                if(silte.getVisibility()==View.GONE){
                    silte.setVisibility(View.VISIBLE);
                    siltes.setVisibility(View.VISIBLE);
                    silta.setVisibility(View.GONE);
                    siltas.setVisibility(View.GONE);
                    silto.setVisibility(View.GONE);
                    siltos.setVisibility(View.GONE);
                    silti.setVisibility(View.GONE);
                    siltis.setVisibility(View.GONE);
                    siltu.setVisibility(View.GONE);
                    siltus.setVisibility(View.GONE);

                    ImageView sonidobe = (ImageView) findViewById(R.id.teteros);
                    mpte= MediaPlayer.create(this,R.raw.tetero);
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpte.start();

                        }
                    });

                    ImageView sonidobee = (ImageView) findViewById(R.id.telefonos);
                    mptee= MediaPlayer.create(this,R.raw.telefono);
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mptee.start();

                        }
                    });


                }
                else{
                    silte.setVisibility(View.GONE);
                    siltes.setVisibility(View.GONE);
                }

                break;

            case R.id.tos:
                if(silto.getVisibility()==View.GONE){
                    silto.setVisibility(View.VISIBLE);
                    siltos.setVisibility(View.VISIBLE);
                    silta.setVisibility(View.GONE);
                    siltas.setVisibility(View.GONE);
                    silte.setVisibility(View.GONE);
                    siltes.setVisibility(View.GONE);
                    silti.setVisibility(View.GONE);
                    siltis.setVisibility(View.GONE);
                    siltu.setVisibility(View.GONE);
                    siltus.setVisibility(View.GONE);

                    ImageView sonidobo = (ImageView) findViewById(R.id.tomates);
                    mpto= MediaPlayer.create(this,R.raw.tomate);
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpto.start();

                        }
                    });

                    ImageView sonidoboo = (ImageView) findViewById(R.id.toros);
                    mptoo= MediaPlayer.create(this,R.raw.toro);
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mptoo.start();

                        }
                    });


                }
                else{
                    silto.setVisibility(View.GONE);
                    siltos.setVisibility(View.GONE);
                }
                break;

            case R.id.tis:
                if(silti.getVisibility()==View.GONE){
                    silti.setVisibility(View.VISIBLE);
                    siltis.setVisibility(View.VISIBLE);
                    silto.setVisibility(View.GONE);
                    siltos.setVisibility(View.GONE);
                    silta.setVisibility(View.GONE);
                    siltas.setVisibility(View.GONE);
                    silte.setVisibility(View.GONE);
                    siltes.setVisibility(View.GONE);
                    siltu.setVisibility(View.GONE);
                    siltus.setVisibility(View.GONE);

                    ImageView sonidobi = (ImageView) findViewById(R.id.tiburones);
                    mpti= MediaPlayer.create(this,R.raw.tiburon);
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpti.start();

                        }
                    });

                    ImageView sonidobii = (ImageView) findViewById(R.id.tigres);
                    mptii= MediaPlayer.create(this,R.raw.tigre);
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mptii.start();

                        }
                    });

                }
                else{
                    silti.setVisibility(View.GONE);
                    siltis.setVisibility(View.GONE);
                }

                break;

            case R.id.tus:
                if(siltu.getVisibility()==View.GONE){
                    siltu.setVisibility(View.VISIBLE);
                    siltus.setVisibility(View.VISIBLE);
                    silti.setVisibility(View.GONE);
                    siltis.setVisibility(View.GONE);
                    silto.setVisibility(View.GONE);
                    siltos.setVisibility(View.GONE);
                    silta.setVisibility(View.GONE);
                    siltas.setVisibility(View.GONE);
                    silte.setVisibility(View.GONE);
                    siltes.setVisibility(View.GONE);

                    ImageView sonidobu = (ImageView) findViewById(R.id.tubos);
                    mptu= MediaPlayer.create(this,R.raw.tubo);
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mptu.start();

                        }
                    });

                    ImageView sonidobuu = (ImageView) findViewById(R.id.tucanes);
                    mptuu= MediaPlayer.create(this,R.raw.tucan);
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mptuu.start();

                        }
                    });

                }
                else{
                    siltu.setVisibility(View.GONE);
                    siltus.setVisibility(View.GONE);
                }

                break;
        }

    }
}