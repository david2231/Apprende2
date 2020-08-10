package gz.app.comdavid.apprende2.Silabas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.juegosil;
import gz.app.comdavid.apprende2.silabas;

public class silaba_c extends AppCompatActivity implements View.OnClickListener {
    ImageView silca,silcas,silce,silces,silco,silcos,silcis,silci,silcu,silcus;
    MediaPlayer mpca;
    MediaPlayer mpcaa;
    MediaPlayer mpce;
    MediaPlayer mpcee;
    MediaPlayer mpci;
    MediaPlayer mpcii;
    MediaPlayer mpco;
    MediaPlayer mpcoo;
    MediaPlayer mpcu;
    MediaPlayer mpcuu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_c);
        silca=(ImageView) findViewById(R.id.casas);
        silcas=(ImageView) findViewById(R.id.carro);
        silce=(ImageView) findViewById(R.id.cepillo);
        silces=(ImageView) findViewById(R.id.cerebro);
        silcos=(ImageView) findViewById(R.id.coco);
        silco=(ImageView) findViewById(R.id.cocodrilo);
        silcus=(ImageView) findViewById(R.id.cuaderno);
        silcu=(ImageView) findViewById(R.id.cucaracha);
        silcis=(ImageView) findViewById(R.id.ciervo);
        silci=(ImageView) findViewById(R.id.circo);
    findViewById(R.id.ca).setOnClickListener(this);
        findViewById(R.id.ce).setOnClickListener(this);
        findViewById(R.id.co).setOnClickListener(this);
        findViewById(R.id.ci).setOnClickListener(this);
        findViewById(R.id.cu).setOnClickListener(this);

        Button sig= (Button) findViewById(R.id.sigc);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), juegosil.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finish();
            }
        });

        Button inicio= (Button) findViewById(R.id.sil_casad);
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
            case R.id.ca:
                if(silca.getVisibility()==View.GONE){

                    silca.setVisibility(View.VISIBLE);
                    silcas.setVisibility(View.VISIBLE);
                    silce.setVisibility(View.GONE);
                    silces.setVisibility(View.GONE);
                    silco.setVisibility(View.GONE);
                    silcos.setVisibility(View.GONE);
                    silci.setVisibility(View.GONE);
                    silcis.setVisibility(View.GONE);
                    silcu.setVisibility(View.GONE);
                    silcus.setVisibility(View.GONE);

                    ImageView sonidoba = (ImageView) findViewById(R.id.carro);
                    mpca= MediaPlayer.create(this,R.raw.carroo);
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpca.start();

                        }
                    });

                    ImageView sonidobaa = (ImageView) findViewById(R.id.casas);
                    mpcaa= MediaPlayer.create(this,R.raw.casa);
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpcaa.start();

                        }
                    });












                }
                else{
                    silca.setVisibility(View.GONE);
                    silcas.setVisibility(View.GONE);
                }

                break;
            case R.id.ce:
                if(silce.getVisibility()==View.GONE){
                    silce.setVisibility(View.VISIBLE);
                    silces.setVisibility(View.VISIBLE);
                    silca.setVisibility(View.GONE);
                    silcas.setVisibility(View.GONE);
                    silco.setVisibility(View.GONE);
                    silcos.setVisibility(View.GONE);
                    silci.setVisibility(View.GONE);
                    silcis.setVisibility(View.GONE);
                    silcu.setVisibility(View.GONE);
                    silcus.setVisibility(View.GONE);

                    ImageView sonidobe = (ImageView) findViewById(R.id.cepillo);
                    mpce= MediaPlayer.create(this,R.raw.cepillo);
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpce.start();

                        }
                    });

                    ImageView sonidobee = (ImageView) findViewById(R.id.cerebro);
                    mpcee= MediaPlayer.create(this,R.raw.cerebro);
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpcee.start();

                        }
                    });

                }
                else{
                    silce.setVisibility(View.GONE);
                    silces.setVisibility(View.GONE);
                }

                break;

            case R.id.co:
                if(silco.getVisibility()==View.GONE){
                    silco.setVisibility(View.VISIBLE);
                    silcos.setVisibility(View.VISIBLE);
                    silca.setVisibility(View.GONE);
                    silcas.setVisibility(View.GONE);
                    silce.setVisibility(View.GONE);
                    silces.setVisibility(View.GONE);
                    silci.setVisibility(View.GONE);
                    silcis.setVisibility(View.GONE);
                    silcu.setVisibility(View.GONE);
                    silcus.setVisibility(View.GONE);

                    ImageView sonidobo = (ImageView) findViewById(R.id.coco);
                    mpco= MediaPlayer.create(this,R.raw.coco);
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpco.start();

                        }
                    });

                    ImageView sonidoboo = (ImageView) findViewById(R.id.cocodrilo);
                    mpcoo= MediaPlayer.create(this,R.raw.cocodrilo);
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpcoo.start();

                        }
                    });

                }
                else{
                    silco.setVisibility(View.GONE);
                    silcos.setVisibility(View.GONE);
                }
                break;

            case R.id.ci:
                if(silci.getVisibility()==View.GONE){
                    silci.setVisibility(View.VISIBLE);
                    silcis.setVisibility(View.VISIBLE);
                    silco.setVisibility(View.GONE);
                    silcos.setVisibility(View.GONE);
                    silca.setVisibility(View.GONE);
                    silcas.setVisibility(View.GONE);
                    silce.setVisibility(View.GONE);
                    silces.setVisibility(View.GONE);
                    silcu.setVisibility(View.GONE);
                    silcus.setVisibility(View.GONE);

                    ImageView sonidobi = (ImageView) findViewById(R.id.ciervo);
                    mpci= MediaPlayer.create(this,R.raw.ciervo);
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpci.start();

                        }
                    });

                    ImageView sonidobii = (ImageView) findViewById(R.id.circo);
                    mpcii= MediaPlayer.create(this,R.raw.circo);
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpcii.start();

                        }
                    });

                }
                else{
                    silci.setVisibility(View.GONE);
                    silcis.setVisibility(View.GONE);
                }

                break;

            case R.id.cu:
                if(silcu.getVisibility()==View.GONE){
                    silcu.setVisibility(View.VISIBLE);
                    silcus.setVisibility(View.VISIBLE);
                    silci.setVisibility(View.GONE);
                    silcis.setVisibility(View.GONE);
                    silco.setVisibility(View.GONE);
                    silcos.setVisibility(View.GONE);
                    silca.setVisibility(View.GONE);
                    silcas.setVisibility(View.GONE);
                    silce.setVisibility(View.GONE);
                    silces.setVisibility(View.GONE);

                    ImageView sonidobu = (ImageView) findViewById(R.id.cuaderno);
                    mpcu= MediaPlayer.create(this,R.raw.cuaderno);
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpcu.start();

                        }
                    });

                    ImageView sonidobuu = (ImageView) findViewById(R.id.cucaracha);
                    mpcuu= MediaPlayer.create(this,R.raw.cucaracha);
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpcuu.start();

                        }
                    });

                }
                else{
                    silcu.setVisibility(View.GONE);
                    silcus.setVisibility(View.GONE);
                }

                break;
        }
    }
}
