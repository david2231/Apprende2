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

public class abc_z extends AppCompatActivity {
    //Declaramos las variables
    MediaPlayer mp;
    //Metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //LLamar la vista asociada
        setContentView(R.layout.activity_abc_z);
        //Llamar el boton
        Button inicio= (Button) findViewById(R.id.casa_z);
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
        Button back= (Button) findViewById(R.id.anterioir_z);
        //Metodo OnClick
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(),abc_y.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                mp.stop();
                finish();
            }
        });
        //Llamar el boton
        Button sonidoa = (Button)findViewById(R.id.sonido_z);
        //Llamar el audio
        mp= MediaPlayer.create(this,R.raw.sonidoz);
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
        mp= MediaPlayer.create(this,R.raw.sonidoz);
        sonidoaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Iniciar audio
                mp.start();

            }
        });
    }
}
