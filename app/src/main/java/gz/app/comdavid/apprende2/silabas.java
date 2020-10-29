
package gz.app.comdavid.apprende2;
//Librerias
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import gz.app.comdavid.apprende2.Silabas.silaba_b;
import gz.app.comdavid.apprende2.Silabas.silaba_c;
import gz.app.comdavid.apprende2.Silabas.silaba_d;
import gz.app.comdavid.apprende2.Silabas.silaba_f;
import gz.app.comdavid.apprende2.Silabas.silaba_g;
import gz.app.comdavid.apprende2.Silabas.silaba_l;
import gz.app.comdavid.apprende2.Silabas.silaba_m;
import gz.app.comdavid.apprende2.Silabas.silaba_n;
import gz.app.comdavid.apprende2.Silabas.silaba_p;
import gz.app.comdavid.apprende2.Silabas.silaba_r;
import gz.app.comdavid.apprende2.Silabas.silaba_s;
import gz.app.comdavid.apprende2.Silabas.silaba_v;
import gz.app.comdavid.apprende2.Silabas.silaba_y;
import gz.app.comdavid.apprende2.Silabas.silaba_z;
import gz.app.comdavid.apprende2.Silabas.silabas_t;

//Clase silabas
public class silabas extends AppCompatActivity {

    //Se declaran los audio
    MediaPlayer mp;

    //Método onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_silabas);

        // Evento botón inicio
        Button inicio= (Button) findViewById(R.id.sil_casa);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Sonido Avatar
        Button sonidoa = (Button)findViewById(R.id.sil_sonido);
        mp= MediaPlayer.create(this,R.raw.modulosil);
        // Evento del botón avatar
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inicia el sonido
                mp.start();
                finish();

            }
        });
        //Silaba B
        Button ba= (Button) findViewById(R.id.button);
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_b.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba C
        Button ca= (Button) findViewById(R.id.button2);
        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_c.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba D
        Button da= (Button) findViewById(R.id.button3);
        da.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_d.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba F
        Button fa= (Button) findViewById(R.id.button4);
        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_f.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba G
        Button ga= (Button) findViewById(R.id.button5);
        ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_g.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });

        //Silaba L
        Button la= (Button) findViewById(R.id.button7);
        la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_l.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba M
        Button ma= (Button) findViewById(R.id.button8);
        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_m.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });

        //Silaba N
        Button na= (Button) findViewById(R.id.button17);
        na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_n.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });

        //Silaba P
        Button pa= (Button) findViewById(R.id.button9);
        pa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_p.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });

        //Silaba R
        Button ra= (Button) findViewById(R.id.button10);
        ra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_r.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba S
        Button sa= (Button) findViewById(R.id.button11);
        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_s.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba T
        Button ta= (Button) findViewById(R.id.button12);
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silabas_t.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba V
        Button va= (Button) findViewById(R.id.button13);
        va.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_v.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba Y
        Button ya= (Button) findViewById(R.id.button14);
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_y.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });
        //Silaba Z
        Button za= (Button) findViewById(R.id.button15);
        za.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), silaba_z.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //Detiene los sonidos  que puedan estar reproduciendose
                mp.stop();
                finish();
            }
        });

    }
}
