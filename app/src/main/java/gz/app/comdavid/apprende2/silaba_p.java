package gz.app.comdavid.apprende2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class silaba_p extends AppCompatActivity  implements View.OnClickListener{

    ImageView silpa,silpas,silpe,silpes,silpo,silpos,silpis,silpi,silpu,silpus;
    MediaPlayer mppa;
    MediaPlayer mppaa;
    MediaPlayer mppe;
    MediaPlayer mppee;
    MediaPlayer mppi;
    MediaPlayer mppii;
    MediaPlayer mppo;
    MediaPlayer mppoo;
    MediaPlayer mppu;
    MediaPlayer mppuu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_p);

        silpa=(ImageView) findViewById(R.id.papas);
        silpas=(ImageView) findViewById(R.id.payasos);
        silpe=(ImageView) findViewById(R.id.peras);
        silpes=(ImageView) findViewById(R.id.perros);
        silpos=(ImageView) findViewById(R.id.policias);
        silpo=(ImageView) findViewById(R.id.pollos);
        silpus=(ImageView) findViewById(R.id.puertas);
        silpu=(ImageView) findViewById(R.id.pulgas);
        silpis=(ImageView) findViewById(R.id.pianos);
        silpi=(ImageView) findViewById(R.id.pinnas);
        findViewById(R.id.pas).setOnClickListener(this);
        findViewById(R.id.pes).setOnClickListener(this);
        findViewById(R.id.pos).setOnClickListener(this);
        findViewById(R.id.pis).setOnClickListener(this);
        findViewById(R.id.pus).setOnClickListener(this);

        Button sig= (Button) findViewById(R.id.sigp);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),juegosil41.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finish();
            }
        });


        Button inicio= (Button) findViewById(R.id.sil_casap);
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
            case R.id.pas:
                if(silpa.getVisibility()==View.GONE){

                    silpa.setVisibility(View.VISIBLE);
                    silpas.setVisibility(View.VISIBLE);
                    silpe.setVisibility(View.GONE);
                    silpes.setVisibility(View.GONE);
                    silpo.setVisibility(View.GONE);
                    silpos.setVisibility(View.GONE);
                    silpi.setVisibility(View.GONE);
                    silpis.setVisibility(View.GONE);
                    silpu.setVisibility(View.GONE);
                    silpus.setVisibility(View.GONE);

                    ImageView sonidoba = (ImageView) findViewById(R.id.papas);
                    mppa= MediaPlayer.create(this,R.raw.papa);
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mppa.start();

                        }
                    });

                    ImageView sonidobaa = (ImageView) findViewById(R.id.payasos);
                    mppaa= MediaPlayer.create(this,R.raw.payaso);
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mppaa.start();

                        }
                    });










                }
                else{
                    silpa.setVisibility(View.GONE);
                    silpas.setVisibility(View.GONE);
                }

                break;
            case R.id.pes:
                if(silpe.getVisibility()==View.GONE){
                    silpe.setVisibility(View.VISIBLE);
                    silpes.setVisibility(View.VISIBLE);
                    silpa.setVisibility(View.GONE);
                    silpas.setVisibility(View.GONE);
                    silpo.setVisibility(View.GONE);
                    silpos.setVisibility(View.GONE);
                    silpi.setVisibility(View.GONE);
                    silpis.setVisibility(View.GONE);
                    silpu.setVisibility(View.GONE);
                    silpus.setVisibility(View.GONE);

                    ImageView sonidobe = (ImageView) findViewById(R.id.peras);
                    mppe= MediaPlayer.create(this,R.raw.pera);
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mppe.start();

                        }
                    });

                    ImageView sonidobee = (ImageView) findViewById(R.id.perros);
                    mppee= MediaPlayer.create(this,R.raw.perro);
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mppee.start();

                        }
                    });


                }
                else{
                    silpe.setVisibility(View.GONE);
                    silpes.setVisibility(View.GONE);
                }

                break;

            case R.id.pos:
                if(silpo.getVisibility()==View.GONE){
                    silpo.setVisibility(View.VISIBLE);
                    silpos.setVisibility(View.VISIBLE);
                    silpa.setVisibility(View.GONE);
                    silpas.setVisibility(View.GONE);
                    silpe.setVisibility(View.GONE);
                    silpes.setVisibility(View.GONE);
                    silpi.setVisibility(View.GONE);
                    silpis.setVisibility(View.GONE);
                    silpu.setVisibility(View.GONE);
                    silpus.setVisibility(View.GONE);

                    ImageView sonidobo = (ImageView) findViewById(R.id.policias);
                    mppo= MediaPlayer.create(this,R.raw.policia);
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mppo.start();

                        }
                    });

                    ImageView sonidoboo = (ImageView) findViewById(R.id.pollos);
                    mppoo= MediaPlayer.create(this,R.raw.pollo);
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mppoo.start();

                        }
                    });

                }
                else{
                    silpo.setVisibility(View.GONE);
                    silpos.setVisibility(View.GONE);
                }
                break;

            case R.id.pis:
                if(silpi.getVisibility()==View.GONE){
                    silpi.setVisibility(View.VISIBLE);
                    silpis.setVisibility(View.VISIBLE);
                    silpo.setVisibility(View.GONE);
                    silpos.setVisibility(View.GONE);
                    silpa.setVisibility(View.GONE);
                    silpas.setVisibility(View.GONE);
                    silpe.setVisibility(View.GONE);
                    silpes.setVisibility(View.GONE);
                    silpu.setVisibility(View.GONE);
                    silpus.setVisibility(View.GONE);

                    ImageView sonidobi = (ImageView) findViewById(R.id.pinnas);
                    mppi= MediaPlayer.create(this,R.raw.pinna);
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mppi.start();

                        }
                    });

                    ImageView sonidobii = (ImageView) findViewById(R.id.pianos);
                    mppii= MediaPlayer.create(this,R.raw.piano);
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mppii.start();

                        }
                    });

                }
                else{
                    silpi.setVisibility(View.GONE);
                    silpis.setVisibility(View.GONE);
                }

                break;

            case R.id.pus:
                if(silpu.getVisibility()==View.GONE){
                    silpu.setVisibility(View.VISIBLE);
                    silpus.setVisibility(View.VISIBLE);
                    silpi.setVisibility(View.GONE);
                    silpis.setVisibility(View.GONE);
                    silpo.setVisibility(View.GONE);
                    silpos.setVisibility(View.GONE);
                    silpa.setVisibility(View.GONE);
                    silpas.setVisibility(View.GONE);
                    silpe.setVisibility(View.GONE);
                    silpes.setVisibility(View.GONE);

                    ImageView sonidobu = (ImageView) findViewById(R.id.puertas);
                    mppu= MediaPlayer.create(this,R.raw.puerta);
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mppu.start();

                        }
                    });

                    ImageView sonidobuu = (ImageView) findViewById(R.id.pulgas);
                    mppuu= MediaPlayer.create(this,R.raw.pulga);
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mppuu.start();

                        }
                    });


                }
                else{
                    silpu.setVisibility(View.GONE);
                    silpus.setVisibility(View.GONE);
                }

                break;
        }

    }
}