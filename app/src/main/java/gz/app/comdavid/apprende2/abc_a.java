//Paquete
package gz.app.comdavid.apprende2;
//Librerias
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
//prueba
public class abc_a extends AppCompatActivity {
    //Declaramos las variables
    MediaPlayer mp;

    //Metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //LLamar la vista asociada
        setContentView(R.layout.activity_abc_a);
        //Llamar el boton
        Button inicio= (Button) findViewById(R.id.casa_aa);
        //Metodo OnClick
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                mp.stop();
                finish();
            }
        });
        //Llamar el boton
        Button next= (Button) findViewById(R.id.siguiente_aa);
        //Metodo OnClick
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(),abc_b.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                mp.stop();
                finish();
            }
        });
        //Llamar el boton
        Button sonidoa = (Button)findViewById(R.id.sonido_aa);
        //Llamar el audio
        mp= MediaPlayer.create(this,R.raw.sonidoa);
        //Metodo OnClick
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //Iniciar audio
                mp.start();

            }
        });
        //Llamar la imagen
        ImageView sonidoaa = (ImageView) findViewById(R.id.imageView2);
        //Llamar el audio
        mp= MediaPlayer.create(this,R.raw.sonidoa);
        sonidoaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Iniciar audio
                mp.start();

            }
        });

    }
}
