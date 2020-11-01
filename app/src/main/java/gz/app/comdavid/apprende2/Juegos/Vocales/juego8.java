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
public class juego8 extends AppCompatActivity {
    // Se realiza la declaración de los TexView
    TextView txta11,txta22,txta33,txta44,puntajes,incorrecta;
    // Se realiza la declaración de los sonidos
    MediaPlayer mp,mp2,sonidoavatar;
    // Se realiza la declaración de la imagen
    ImageView err;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Super clase onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego8);
        //Llamado al sonido bien
        mp= MediaPlayer.create(this,R.raw.bien);
        //Llamado al sonido mal
        mp2= MediaPlayer.create(this,R.raw.mal);
        //Llamado al sonido del avatar
        sonidoavatar=MediaPlayer.create(this,R.raw.audiojuego);
        //Llamado a la imagen de error
        err=(ImageView) findViewById(R.id.errores8);
        //Llamado a las 3 opciones que se muestran en pantalla
        txta11=(TextView) findViewById(R.id.txta6);
        txta22=(TextView) findViewById(R.id.txtjb6);
        txta33=(TextView) findViewById(R.id.txtjc8);
        //Llamado a la palabra _RBOL
        txta44=(TextView) findViewById(R.id.target8);
        //Se declara una variable local para almacenar las palabras correctas
        puntajes=(TextView) findViewById(R.id.puntaje8);
        //Se declara una variable local para almacenar las palabras incorrectas
        incorrecta=(TextView) findViewById(R.id.incorrectas8);
        //Evento setOnLongClickListener para las 3 opciones que se muestran al usuario
        txta11.setOnLongClickListener(longClickListener);
        txta22.setOnLongClickListener(longClickListener);
        txta33.setOnLongClickListener(longClickListener);
        txta44.setOnDragListener(dragListenre);
        //Se actualizan los campos de correctas  e incorrectas con las variables globales de utilidades
        puntajes.setText(Integer.toString(Utilidades.correctas));
        incorrecta.setText(Integer.toString(Utilidades.incorrectas));
        //Evento del botón inicio
        Button inicio= (Button) findViewById(R.id.casa_aa8);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), juegos.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                //Se detiene los sonidos que puedan estar reproduciéndose
                sonidoavatar.stop();
                mp.stop();
                mp2.stop();
                //Finaliza la actividad
                finish();
            }
        });

        //Evento del botón avatar
        Button avatar=(Button) findViewById(R.id.sonidosilabas8);
        avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Inicia el sonido del avatar
                sonidoavatar.start();
                //Se detiene los sonidos que puedan estar reproduciéndose
                mp.stop();
                mp2.stop();
            }
        });

    }
    //Evento OnLongClickListener que permite arrastar las opciones
    View.OnLongClickListener longClickListener=new View.OnLongClickListener(){

        @Override
        public boolean onLongClick(View v){
            //Parametro que tiene en la etiqueta
            ClipData data=ClipData.newPlainText("","");
            View.DragShadowBuilder myShadwoBuilder=new View.DragShadowBuilder(v);
            v.startDrag(data,myShadwoBuilder,v,0);
            return true;


        }
    };
    //Evento OnDragListener que permite arrastrar y soltar
    View.OnDragListener dragListenre=new View.OnDragListener(){

        @Override
        public boolean onDrag(View v, DragEvent event){
            // Variable de tipo entero donde se almacena la acción seleccionada por el usuario
            int dragEvent=event.getAction();
            //Switch  dragEvent
            switch (dragEvent){
                //si el usuario selecciona una de las opciones
                case DragEvent.ACTION_DRAG_ENTERED:
                    final View view=(View) event.getLocalState();
                    //si se selecciona la primera opción
                    if(view.getId()==R.id.txta6){
                        //Suma un punto al  campo incorrectas
                        Utilidades.incorrectas++;
                        //Se actualiza el campo incorrectas
                        incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                        //Se muestra la imagen de error
                        err.setVisibility(View.VISIBLE);
                        //Inicia el sonido de error
                        mp2.start();

                    }

                    //Si se selecciona la opción número 2
                    else {
                        //Suma un punto al  campo incorrectas
                        if (view.getId() == R.id.txtjb6) {
                            //Suma un punto al  campo incorrectas
                            Utilidades.incorrectas++;
                            //Actualiza el campo incorrectas
                            incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                            //Se muestra la imagen de error
                            err.setVisibility(View.VISIBLE);
                            //Inicia el sonido de error
                            mp2.start();


                        }

                        //si se selecciona la opción número 3
                        else if (view.getId() == R.id.txtjc8) {
                            //Suma un punto al  campo correctas
                            Utilidades.correctas++;
                            //Se actualiza el campo correctas
                            puntajes.setText(Integer.toString(Utilidades.correctas));
                            //Si se esta mostrando el error en pantalla se oculta
                            err.setVisibility(View.GONE);
                            //Se muestra en pantalla la palabra completa
                            txta44.setText("ÁRBOL");
                            //Inicia el sonido bien
                            mp.start();
                            //Este método postDelayed nos permite pasar de actividad luego de un segundo
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    //Abrir una nueva actividad
                                    Intent intent=new Intent(juego8.this,juego9.class);
                                    startActivity(intent);
                                    //Transiciones
                                    overridePendingTransition(R.anim.left_in, R.anim.left_out);
                                    //Finaliza la actividad
                                    finish();

                                }
                            },1000);
                        }
                    }


                    break;

            }
            return true;


        }
    };

}



