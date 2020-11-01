package gz.app.comdavid.apprende2.Juegos.Vocales;
//Librerias
import android.content.ClipData;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.clases.vo.Utilidades;
import gz.app.comdavid.apprende2.Juegos.juegos;

// Clase de la actividad juego
public class juego2 extends AppCompatActivity {
    // Se realiza la declaración de los TexView de la interfaz
    TextView txta1,txta2,txta3,txta4,puntajes,incorrecta;
    // Se realiza la declaración de los sonidos
    MediaPlayer mp,mp2,sonidoavatar;
    // Se realiza la declaración de la imagen
    ImageView err;

    //Metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Super clase onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego2);
        //Llamado al sonido exitoso
        mp= MediaPlayer.create(this,R.raw.bien);
        //Llamado al sonido mal
        mp2= MediaPlayer.create(this,R.raw.mal);
        //Llamado al sonido del avatar
        sonidoavatar=MediaPlayer.create(this,R.raw.audiojuego);
        //Llamado al la imagen de error
        err=(ImageView) findViewById(R.id.errores2);
        //Llamado a las 3 opciones que se muestran en pantalla
        txta1=(TextView) findViewById(R.id.txta6);
        txta2=(TextView) findViewById(R.id.txtjb6);
        txta3=(TextView) findViewById(R.id.txtjc2);
        //Llamado a la palabra _SCUELA
        txta4=(TextView) findViewById(R.id.target2);
        //Se declara una variable local para almacenar las palabras correctas
        puntajes=(TextView) findViewById(R.id.puntaje2);
        //Se declara una variable local para almacenar las palabras incorrectas
        incorrecta=(TextView) findViewById(R.id.incorrectas2);
        //Evento setOnLongClickListener para las 3 opciones que se muestran al usuario
        txta1.setOnLongClickListener(longClickListener);
        txta2.setOnLongClickListener(longClickListener);
        txta3.setOnLongClickListener(longClickListener);
        txta4.setOnDragListener(dragListenre);
        //Se actualizan los campos de correctas  e incorrectas con las variables globales de utilidades
        puntajes.setText(Integer.toString(Utilidades.correctas));
        incorrecta.setText(Integer.toString(Utilidades.incorrectas));
        //Evento del botón inicio
        Button inicio= (Button) findViewById(R.id.casa_aa2);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), juegos.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                //Se detiene los sonidos que puedan estar reproduciéndose
                mp.stop();
                mp2.stop();
                //Finaliza la actividad
                finish();
            }
        });
        //Evento del botón avatar
        Button avatar=(Button) findViewById(R.id.sonidosilabas2);
        avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Inicia el sonido del avatar
                sonidoavatar.start();
                //Se detiene los sonidos que puedan estar reproduciéndose

            }
        });
    }

    //Evento OnLongClickListener que permite arrastar las opciones
    View.OnLongClickListener longClickListener=new View.OnLongClickListener(){

        @Override
        public boolean onLongClick(View v){
            //Parametro que tiene en la etiqueta
            ClipData data=ClipData.newPlainText("","");
            //Deja una sombra de la opción seleccionada
            View.DragShadowBuilder myShadwoBuilder=new View.DragShadowBuilder(v);
            v.startDrag(data,myShadwoBuilder,v,0);
            return true;


        }
    };
    //Evento OnDragListener que permite arrastrar y soltar
    View.OnDragListener dragListenre=new View.OnDragListener(){
        // Variable de tipo entero donde se almacena la acción seleccionada por el usuario
        @Override
        public boolean onDrag(View v, DragEvent event){
            int dragEvent=event.getAction();
            //Switch  dragEvent
            switch (dragEvent){
                //si el usuario selecciona una de las opciones
                case DragEvent.ACTION_DRAG_ENTERED:
                    final View view=(View) event.getLocalState();
                //si se selecciona la primera opción
                    if(view.getId()==R.id.txta6){
                        //Actualiza el campo incorrectas
                        Utilidades.incorrectas++;
                        //Actualiza el campo incorrectas
                        incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                        //Se muestra la imagen de error
                        err.setVisibility(View.VISIBLE);
                        //Inicia el sonido de error
                        mp2.start();
                        //Detiene el sonido del avatar
                        sonidoavatar.stop();


                    }else {
                        //Si se selecciona la opción número 2
                        if (view.getId() == R.id.txtjb6) {
                            //Si se esta mostrando el error en pantalla se oculta
                            err.setVisibility(View.GONE);
                            //Se muestra en pantalla la palabra completa
                            txta4.setText("ESCUELA");
                            //Se detiene los sonidos que puedan estar reproduciéndose
                            mp.start();
                            sonidoavatar.stop();
                            //Este método postDelayed nos permite pasar de actividad luego de un segundo
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    //Se suma un punto a la opción correcta
                                    Utilidades.correctas++;
                                    //Actualiza el campo puntaje
                                    puntajes.setText(Integer.toString(Utilidades.correctas));
                                    //Abrir una nueva actividad
                                    Intent intent = new Intent(juego2.this, juego3.class);
                                    startActivity(intent);
                                    //Transiciones
                                    overridePendingTransition(R.anim.left_in, R.anim.left_out);
                                    //Finaliza la actividad
                                    finish();


                                }
                            },1000);

                        }
                        //Si se selecciona la opción número 3
                        else if (view.getId() == R.id.txtjc2) {
                            //Se suma un punto a la opción incorrectas
                            Utilidades.incorrectas++;
                            //Actualiza el campo incorrectas
                            incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                            //Se muestra la imagen de error
                            err.setVisibility(View.VISIBLE);
                            //Inicia el sonido de error
                            mp2.start();
                            sonidoavatar.stop();
                        }
                    }

                    break;

            }
            return true;
        }
    };

}
