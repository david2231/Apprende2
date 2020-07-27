//Paquete
package gz.app.comdavid.apprende2.abecedario;
//Librerias
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import gz.app.comdavid.apprende2.MainActivity;
import gz.app.comdavid.apprende2.R;

public class abc_n extends AppCompatActivity {
    //Declaramos las variables
    MediaPlayer mp;
    //Metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //LLamar la vista asociada
        setContentView(R.layout.activity_abc_n);
        //Llamar el boton
        Button inicio= (Button) findViewById(R.id.casa_n);
        //Metodo OnClick
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                mp.stop();
            }
        });
        //Llamar el boton
        Button next= (Button) findViewById(R.id.siguiente_n);
        //Metodo OnClick
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(),abc_nn.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                mp.stop();
            }
        });
        //Llamar el boton
        Button back= (Button) findViewById(R.id.anterioir_n);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(),abc_m.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                mp.stop();
            }
        });
        //Llamar el boton
        Button sonidoa = (Button)findViewById(R.id.sonido_n);
        //Llamar el audio
        mp= MediaPlayer.create(this,R.raw.sonidon);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Iniciar audio
                mp.start();

            }
        });
        // Llama la imagen
        ImageView sonidoaa = (ImageView) findViewById(R.id.imageView2);
        mp= MediaPlayer.create(this,R.raw.sonidon);
        sonidoaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Iniciar audio
                mp.start();

            }
        });
    }
}
