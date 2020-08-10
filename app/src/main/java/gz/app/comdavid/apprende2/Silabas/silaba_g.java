package gz.app.comdavid.apprende2.Silabas;


import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.juegosil21;
import gz.app.comdavid.apprende2.silabas;

public class silaba_g extends AppCompatActivity  implements View.OnClickListener{

    ImageView silga,silgas,silge,silges,silgo,silgos,silgis,silgi,silgu,silgus;
    MediaPlayer mpga;
    MediaPlayer mpgaa;
    MediaPlayer mpge;
    MediaPlayer mpgee;
    MediaPlayer mpgi;
    MediaPlayer mpgii;
    MediaPlayer mpgo;
    MediaPlayer mpgoo;
    MediaPlayer mpgu;
    MediaPlayer mpguu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_g);
        silga=(ImageView) findViewById(R.id.gasolinas);
        silgas=(ImageView) findViewById(R.id.gatos);
        silge=(ImageView) findViewById(R.id.gelatinas);
        silges=(ImageView) findViewById(R.id.genios);
        silgos=(ImageView) findViewById(R.id.gorras);
        silgo=(ImageView) findViewById(R.id.gotas);
        silgus=(ImageView) findViewById(R.id.guantes);
        silgu=(ImageView) findViewById(R.id.gusanos);
        silgis=(ImageView) findViewById(R.id.gigantes);
        silgi=(ImageView) findViewById(R.id.girasoles);
        findViewById(R.id.gas).setOnClickListener(this);
        findViewById(R.id.ges).setOnClickListener(this);
        findViewById(R.id.gos).setOnClickListener(this);
        findViewById(R.id.gis).setOnClickListener(this);
        findViewById(R.id.gus).setOnClickListener(this);

        Button inicio= (Button) findViewById(R.id.sil_casag);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), silabas.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        });

        Button sig= (Button) findViewById(R.id.sigg);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), juegosil21.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finish();
            }
        });


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.gas:
                if(silga.getVisibility()==View.GONE){

                    silga.setVisibility(View.VISIBLE);
                    silgas.setVisibility(View.VISIBLE);
                    silge.setVisibility(View.GONE);
                    silges.setVisibility(View.GONE);
                    silgo.setVisibility(View.GONE);
                    silgos.setVisibility(View.GONE);
                    silgi.setVisibility(View.GONE);
                    silgis.setVisibility(View.GONE);
                    silgu.setVisibility(View.GONE);
                    silgus.setVisibility(View.GONE);

                    ImageView sonidoga = (ImageView) findViewById(R.id.gatos);
                    mpga= MediaPlayer.create(this,R.raw.gato);
                    sonidoga.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpga.start();

                        }
                    });

                    ImageView sonidogaa = (ImageView) findViewById(R.id.gasolinas);
                    mpgaa= MediaPlayer.create(this,R.raw.gasolina);
                    sonidogaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpgaa.start();

                        }
                    });



                }
                else{
                    silga.setVisibility(View.GONE);
                    silgas.setVisibility(View.GONE);
                }

                break;
            case R.id.ges:
                if(silge.getVisibility()==View.GONE){
                    silge.setVisibility(View.VISIBLE);
                    silges.setVisibility(View.VISIBLE);
                    silga.setVisibility(View.GONE);
                    silgas.setVisibility(View.GONE);
                    silgo.setVisibility(View.GONE);
                    silgos.setVisibility(View.GONE);
                    silgi.setVisibility(View.GONE);
                    silgis.setVisibility(View.GONE);
                    silgu.setVisibility(View.GONE);
                    silgus.setVisibility(View.GONE);

                    ImageView sonidoge = (ImageView) findViewById(R.id.genios);
                    mpge= MediaPlayer.create(this,R.raw.genio);
                    sonidoge.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpge.start();

                        }
                    });

                    ImageView sonidogee = (ImageView) findViewById(R.id.gelatinas);
                    mpgee= MediaPlayer.create(this,R.raw.gelatina);
                    sonidogee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpgee.start();

                        }
                    });


                }
                else{
                    silge.setVisibility(View.GONE);
                    silges.setVisibility(View.GONE);
                }

                break;

            case R.id.gos:
                if(silgo.getVisibility()==View.GONE){
                    silgo.setVisibility(View.VISIBLE);
                    silgos.setVisibility(View.VISIBLE);
                    silga.setVisibility(View.GONE);
                    silgas.setVisibility(View.GONE);
                    silge.setVisibility(View.GONE);
                    silges.setVisibility(View.GONE);
                    silgi.setVisibility(View.GONE);
                    silgis.setVisibility(View.GONE);
                    silgu.setVisibility(View.GONE);
                    silgus.setVisibility(View.GONE);

                    ImageView sonigobo = (ImageView) findViewById(R.id.gotas);
                    mpgo= MediaPlayer.create(this,R.raw.gota);
                    sonigobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpgo.start();

                        }
                    });

                    ImageView sonigoboo = (ImageView) findViewById(R.id.gorras);
                    mpgoo= MediaPlayer.create(this,R.raw.gorro);
                    sonigoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpgoo.start();

                        }
                    });

                }
                else{
                    silgo.setVisibility(View.GONE);
                    silgos.setVisibility(View.GONE);
                }
                break;

            case R.id.gis:
                if(silgi.getVisibility()==View.GONE){
                    silgi.setVisibility(View.VISIBLE);
                    silgis.setVisibility(View.VISIBLE);
                    silgo.setVisibility(View.GONE);
                    silgos.setVisibility(View.GONE);
                    silga.setVisibility(View.GONE);
                    silgas.setVisibility(View.GONE);
                    silge.setVisibility(View.GONE);
                    silges.setVisibility(View.GONE);
                    silgu.setVisibility(View.GONE);
                    silgus.setVisibility(View.GONE);

                    ImageView sonidogi = (ImageView) findViewById(R.id.gigantes);
                    mpgi= MediaPlayer.create(this,R.raw.gigante);
                    sonidogi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpgi.start();

                        }
                    });

                    ImageView sonidogii = (ImageView) findViewById(R.id.girasoles);
                    mpgii= MediaPlayer.create(this,R.raw.girasol);
                    sonidogii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpgii.start();

                        }
                    });

                }
                else{
                    silgi.setVisibility(View.GONE);
                    silgis.setVisibility(View.GONE);
                }

                break;

            case R.id.gus:
                if(silgu.getVisibility()==View.GONE){
                    silgu.setVisibility(View.VISIBLE);
                    silgus.setVisibility(View.VISIBLE);
                    silgi.setVisibility(View.GONE);
                    silgis.setVisibility(View.GONE);
                    silgo.setVisibility(View.GONE);
                    silgos.setVisibility(View.GONE);
                    silga.setVisibility(View.GONE);
                    silgas.setVisibility(View.GONE);
                    silge.setVisibility(View.GONE);
                    silges.setVisibility(View.GONE);

                    ImageView sonigobu = (ImageView) findViewById(R.id.guantes);
                    mpgu= MediaPlayer.create(this,R.raw.guantees);
                    sonigobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpgu.start();

                        }
                    });

                    ImageView sonidoguu = (ImageView) findViewById(R.id.gusanos);
                    mpguu= MediaPlayer.create(this,R.raw.gusano);
                    sonidoguu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpguu.start();

                        }
                    });

                }
                else{
                    silgu.setVisibility(View.GONE);
                    silgus.setVisibility(View.GONE);
                }

                break;
        }

    }
}