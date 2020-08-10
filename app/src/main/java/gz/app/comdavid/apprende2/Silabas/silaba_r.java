package gz.app.comdavid.apprende2.Silabas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.juegosil46;
import gz.app.comdavid.apprende2.silabas;

public class silaba_r extends AppCompatActivity  implements View.OnClickListener{

    ImageView silra,silras,silre,silres,silro,silros,silris,silri,silru,silrus;
    MediaPlayer mpra;
    MediaPlayer mpraa;
    MediaPlayer mpre;
    MediaPlayer mpree;
    MediaPlayer mpri;
    MediaPlayer mprii;
    MediaPlayer mpro;
    MediaPlayer mproo;
    MediaPlayer mpru;
    MediaPlayer mpruu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_r);

        silra=(ImageView) findViewById(R.id.ranas);
        silras=(ImageView) findViewById(R.id.ratones);
        silre=(ImageView) findViewById(R.id.recetas);
        silres=(ImageView) findViewById(R.id.remos);
        silros=(ImageView) findViewById(R.id.ropas);
        silro=(ImageView) findViewById(R.id.rosas);
        silrus=(ImageView) findViewById(R.id.rubis);
        silru=(ImageView) findViewById(R.id.ruletas);
        silris=(ImageView) findViewById(R.id.rinnons);
        silri=(ImageView) findViewById(R.id.rios);
        findViewById(R.id.ras).setOnClickListener(this);
        findViewById(R.id.res).setOnClickListener(this);
        findViewById(R.id.ros).setOnClickListener(this);
        findViewById(R.id.ris).setOnClickListener(this);
        findViewById(R.id.rus).setOnClickListener(this);

        Button sig= (Button) findViewById(R.id.sigrr);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), juegosil46.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finish();
            }
        });


        Button inicio= (Button) findViewById(R.id.sil_casar);
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
            case R.id.ras:
                if(silra.getVisibility()==View.GONE){

                    silra.setVisibility(View.VISIBLE);
                    silras.setVisibility(View.VISIBLE);
                    silre.setVisibility(View.GONE);
                    silres.setVisibility(View.GONE);
                    silro.setVisibility(View.GONE);
                    silros.setVisibility(View.GONE);
                    silri.setVisibility(View.GONE);
                    silris.setVisibility(View.GONE);
                    silru.setVisibility(View.GONE);
                    silrus.setVisibility(View.GONE);

                    ImageView sonidoba = (ImageView) findViewById(R.id.ranas);
                    mpra= MediaPlayer.create(this,R.raw.rana);
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpra.start();

                        }
                    });

                    ImageView sonidobaa = (ImageView) findViewById(R.id.ratones);
                    mpraa= MediaPlayer.create(this,R.raw.raton);
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpraa.start();

                        }
                    });









                }
                else{
                    silra.setVisibility(View.GONE);
                    silras.setVisibility(View.GONE);
                }

                break;
            case R.id.res:
                if(silre.getVisibility()==View.GONE){
                    silre.setVisibility(View.VISIBLE);
                    silres.setVisibility(View.VISIBLE);
                    silra.setVisibility(View.GONE);
                    silras.setVisibility(View.GONE);
                    silro.setVisibility(View.GONE);
                    silros.setVisibility(View.GONE);
                    silri.setVisibility(View.GONE);
                    silris.setVisibility(View.GONE);
                    silru.setVisibility(View.GONE);
                    silrus.setVisibility(View.GONE);

                    ImageView sonidobe = (ImageView) findViewById(R.id.recetas);
                    mpre= MediaPlayer.create(this,R.raw.regla);
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpre.start();

                        }
                    });

                    ImageView sonidobee = (ImageView) findViewById(R.id.remos);
                    mpree= MediaPlayer.create(this,R.raw.regalo);
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpree.start();

                        }
                    });


                }
                else{
                    silre.setVisibility(View.GONE);
                    silres.setVisibility(View.GONE);
                }

                break;

            case R.id.ros:
                if(silro.getVisibility()==View.GONE){
                    silro.setVisibility(View.VISIBLE);
                    silros.setVisibility(View.VISIBLE);
                    silra.setVisibility(View.GONE);
                    silras.setVisibility(View.GONE);
                    silre.setVisibility(View.GONE);
                    silres.setVisibility(View.GONE);
                    silri.setVisibility(View.GONE);
                    silris.setVisibility(View.GONE);
                    silru.setVisibility(View.GONE);
                    silrus.setVisibility(View.GONE);

                    ImageView sonidobo = (ImageView) findViewById(R.id.ropas);
                    mpro= MediaPlayer.create(this,R.raw.ropa);
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpro.start();

                        }
                    });

                    ImageView sonidoboo = (ImageView) findViewById(R.id.rosas);
                    mproo= MediaPlayer.create(this,R.raw.rosa);
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mproo.start();

                        }
                    });

                }
                else{
                    silro.setVisibility(View.GONE);
                    silros.setVisibility(View.GONE);
                }
                break;

            case R.id.ris:
                if(silri.getVisibility()==View.GONE){
                    silri.setVisibility(View.VISIBLE);
                    silris.setVisibility(View.VISIBLE);
                    silro.setVisibility(View.GONE);
                    silros.setVisibility(View.GONE);
                    silra.setVisibility(View.GONE);
                    silras.setVisibility(View.GONE);
                    silre.setVisibility(View.GONE);
                    silres.setVisibility(View.GONE);
                    silru.setVisibility(View.GONE);
                    silrus.setVisibility(View.GONE);

                    ImageView sonidobi = (ImageView) findViewById(R.id.rinnons);
                    mpri= MediaPlayer.create(this,R.raw.risa);
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpri.start();

                        }
                    });

                    ImageView sonidobii = (ImageView) findViewById(R.id.rios);
                    mprii= MediaPlayer.create(this,R.raw.rio);
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mprii.start();

                        }
                    });

                }
                else{
                    silri.setVisibility(View.GONE);
                    silris.setVisibility(View.GONE);
                }

                break;

            case R.id.rus:
                if(silru.getVisibility()==View.GONE){
                    silru.setVisibility(View.VISIBLE);
                    silrus.setVisibility(View.VISIBLE);
                    silri.setVisibility(View.GONE);
                    silris.setVisibility(View.GONE);
                    silro.setVisibility(View.GONE);
                    silros.setVisibility(View.GONE);
                    silra.setVisibility(View.GONE);
                    silras.setVisibility(View.GONE);
                    silre.setVisibility(View.GONE);
                    silres.setVisibility(View.GONE);

                    ImageView sonidobu = (ImageView) findViewById(R.id.rubis);
                    mpru= MediaPlayer.create(this,R.raw.rubi);
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpru.start();

                        }
                    });

                    ImageView sonidobuu = (ImageView) findViewById(R.id.ruletas);
                    mpruu= MediaPlayer.create(this,R.raw.ruleta);
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpruu.start();

                        }
                    });



                }
                else{
                    silru.setVisibility(View.GONE);
                    silrus.setVisibility(View.GONE);
                }

                break;
        }

    }
}