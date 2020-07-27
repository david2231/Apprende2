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

public class abc_b extends AppCompatActivity {
    //Declaracion de variables
    MediaPlayer mp;
    //Metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //LLamar la vista asociada
        setContentView(R.layout.activity_abc_b);
        //Llamar el boton
        Button inicio= (Button) findViewById(R.id.casa_b);
        //Metodo OnClick
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                mp.stop();
                finish();
            }
        });
        // llamar boton
        Button next= (Button) findViewById(R.id.siguiente_b);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),abc_c.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                mp.stop();
                finish();
            }
        });

        //llamar boton
        Button back= (Button) findViewById(R.id.anterioir_b);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), abc_a.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                mp.stop();
                finish();
            }
        });
        //Llamar el audio
        Button sonidoa = (Button)findViewById(R.id.sonido_b);
        mp= MediaPlayer.create(this,R.raw.sonidob);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();
            }
        });
        //Llamar la imagen
        ImageView sonidoaa = (ImageView) findViewById(R.id.imageView2);
        mp= MediaPlayer.create(this,R.raw.sonidob);
        sonidoaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

            }
        });

    }
}
