package gz.app.comdavid.apprende2;
//Librerias
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import java.util.UUID;
import android.provider.MediaStore;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View.OnClickListener;
import android.widget.Toast;
import gz.app.comdavid.apprende2.ABC_Drawable.escribirinicio;
//Clase panit2 la cula implementa el evento OnclickListener
public class paint2 extends AppCompatActivity implements OnClickListener{
    // Vista que muestra al usuario
    private paint drawView;
    // Se declaran los botones
    private ImageButton currPaint, drawBtn, eraseBtn, newBtn, saveBtn;
    // Se declaran los tamaños del pincel
    private float smallBrush, mediumBrush, largeBrush;
    //Se establcen los sonidos que se van a utilizar
    MediaPlayer Marron,Amarillo,Azul,Azulclaro,Gris,Naranja,Negro,Rojo,Rosado,Verde,Blanco,Empezar_Dibujo,Pequeno,Grande,Mediano,Si,No,Borrador,Guardar,Pincel;

    @Override
    //Método OnCreate
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint2);
        //Color marrón
        Marron= MediaPlayer.create(this,R.raw.marron);
        //Color amarillo
        Amarillo= MediaPlayer.create(this,R.raw.amarillo);
        //Color azul
        Azul= MediaPlayer.create(this,R.raw.azul);
        //Color azulclaro
        Azulclaro= MediaPlayer.create(this,R.raw.azulclaro);
        //Color  gris
        Gris= MediaPlayer.create(this,R.raw.gris);
        //Color naranja
        Naranja= MediaPlayer.create(this,R.raw.naranja);
        //Color negro
        Negro= MediaPlayer.create(this,R.raw.negro);
        //Color rojo
        Rojo= MediaPlayer.create(this,R.raw.rojo);
        //Color rosaod
        Rosado= MediaPlayer.create(this,R.raw.rosado);
        //Color verde
        Verde= MediaPlayer.create(this,R.raw.verde);
        //Color blanco
        Blanco= MediaPlayer.create(this,R.raw.blanco);
        //Sonido del inicio
        Empezar_Dibujo= MediaPlayer.create(this,R.raw.empezar_dibujo);
        //Tamaño pequeño
        Pequeno= MediaPlayer.create(this,R.raw.pequeno);
        //Tamaño grande
        Grande= MediaPlayer.create(this,R.raw.grande);
        //Tamaño mediano
        Mediano= MediaPlayer.create(this,R.raw.mediano);
        //Sonido de guardar dibujo
        Guardar= MediaPlayer.create(this,R.raw.guardar);
        //Opción Si
        Si= MediaPlayer.create(this,R.raw.si);
        //Opción No
        No= MediaPlayer.create(this,R.raw.no);
        //Sonido Borrador
        Borrador= MediaPlayer.create(this,R.raw.borrador);

        //Botón del Inicio
        ImageButton inicio= (ImageButton) findViewById(R.id.casa_paint);
        //Evento del botón inicio
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), escribirinicio.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                //Finaliza la actividad
                finish();

            }
        });
        // Se declara el lienzo donde el usuario va dibujar
        drawView = (paint)findViewById(R.id.drawing);
        //Tamaño medio del pincel
        drawView.setBrushSize(mediumBrush);
        //Contenedor de los colores
        LinearLayout paintLayout = (LinearLayout)findViewById(R.id.paint_colors);
        currPaint = (ImageButton)paintLayout.getChildAt(0);
        currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
        //Tamaños del pincel
        smallBrush = getResources().getInteger(R.integer.small_size);
        mediumBrush = getResources().getInteger(R.integer.medium_size);
        largeBrush = getResources().getInteger(R.integer.large_size);
        //Botón del pincel
        drawBtn = (ImageButton)findViewById(R.id.draw_btn);
        drawBtn.setOnClickListener(this);
        //Botón del borrador
        eraseBtn = (ImageButton)findViewById(R.id.erase_btn);
        eraseBtn.setOnClickListener(this);
        //Botón nuevo dibujo
        newBtn = (ImageButton)findViewById(R.id.new_btn);
        newBtn.setOnClickListener(this);
        //Botón guardar
        saveBtn = (ImageButton)findViewById(R.id.save_btn);
        saveBtn.setOnClickListener(this);
    }

    //Método que contiene la ayuda por voz y obtiene los valores por defecto del lienzo
    public void paintClicked(View view)
    {

        drawView.setErase(false);
        drawView.setBrushSize(drawView.getLastBrushSize());
        //use chosen color

        if(view!=currPaint)
        {
            //Actualizar según la selección del usuario
            ImageButton imgView = (ImageButton)view;
            String color = view.getTag().toString();
            drawView.setColor(color);
            // Si el color es marron
            if(color.equals("#FF660000")){
                Marron.start();
            }
            // Si el color es Rojo
            if(color.equals("#FFFF0000")){
                Rojo.start();
            }
            // Si el color es Naranja
            if(color.equals("#FFFF6600")){
                Naranja.start();
            }
            // Si el color es Amarillo
            if(color.equals("#FFFFCC00")){
                Amarillo.start();
            }
            // Si el color es verde
            if(color.equals("#FF009900")){
                Verde.start();
            }
            // Si el color es azul claro
            if(color.equals("#FF009999")){
                Azulclaro.start();
            }
            // Si el color es azul
            if(color.equals("#FF0000FF")){
                Azul.start();
            }
            // Si el color es morado
            if(color.equals("#FF990099")){
                Azul.start();
            }
            // Si el color es rosa
            if(color.equals("#FFFF6666")){
                Rosado.start();
            }
            // Si el color es blanco
            if(color.equals("#FFFFFFFF")){
                Blanco.start();
            }
            // Si el color es gris
            if(color.equals("#FF787878")){
                Gris.start();
            }
            // Si el color es negro
            if(color.equals("#FF000000")){
                Negro.start();
            }

            Toast.makeText(this,color,Toast.LENGTH_LONG).show();


            //Se muestra en la interfaz del usuario
            imgView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
            currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint));
            currPaint = (ImageButton)view;
        }
    }

    @Override
    //Método que contiene los eventos cuando el usuario presione un botón
    public void onClick(View view)
    {
        //Si presiona el botón del pincel
        if(view.getId() == R.id.draw_btn)
        {
            //Cuadro de dialogo  que tiene el tamaño del pincel
            final Dialog brushDialog = new Dialog(this);
            brushDialog.setTitle("Tamaño del pincel:");
            //Invoca la actividad que tiene los tamaños del pincel
            brushDialog.setContentView(R.layout.activity_paint);
            //Pincel pequeño
            ImageButton smallBtn = (ImageButton)brushDialog.findViewById(R.id.small_brush);
            //Evento del botón pequeño
            smallBtn.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Inicia el sonido
                    Pequeno.start();
                    //Actualiza el tamaño del pincel
                    drawView.setBrushSize(smallBrush);
                    drawView.setLastBrushSize(smallBrush);
                    //Deja el valor de borrar en falso
                    drawView.setErase(false);
                    //Cierra el cuadro de dialogo
                    brushDialog.dismiss();
                }
            });
            //Pincel mediano
            ImageButton mediumBtn = (ImageButton)brushDialog.findViewById(R.id.medium_brush);
            //Evento del botón mediano
            mediumBtn.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Inicia el sonido
                    Mediano.start();
                    //Actualiza el tamaño del pincel
                    drawView.setBrushSize(mediumBrush);
                    drawView.setLastBrushSize(mediumBrush);
                    //Deja el valor de borrar en falso
                    drawView.setErase(false);
                    //Cierra el cuadro de dialogo
                    brushDialog.dismiss();
                }
            });
            //Pincel grande
            ImageButton largeBtn = (ImageButton)brushDialog.findViewById(R.id.large_brush);
            //Evento del botón grande
            largeBtn.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Inicia el sonido
                    Grande.start();
                    //Actualiza el tamaño del pincel
                    drawView.setBrushSize(largeBrush);
                    drawView.setLastBrushSize(largeBrush);
                    //Deja el valor de borrar en falso
                    drawView.setErase(false);
                    //Cierra el cuadro de dialogo
                    brushDialog.dismiss();
                }
            });

            brushDialog.show();

        }
        //Si es elegida la opción de borrar
        else if(view.getId() == R.id.erase_btn)
        {
            //Cuadro de dialogo  que tiene el tamaño del borrador
            final Dialog brushDialog = new Dialog(this);
            brushDialog.setTitle("Tamaño del borrador:");
            //Inicia el sonido
            Borrador.start();
            //Invoca la actividad que tiene los tamaños del borrador
            brushDialog.setContentView(R.layout.activity_paint);
            //Borrador pequeño
            ImageButton smallBtn = (ImageButton)brushDialog.findViewById(R.id.small_brush);
            //Evento del botón pequeño
            smallBtn.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Inicia el sonido
                    Pequeno.start();
                    //Cambia el valor del borrador a verdadero
                    drawView.setErase(true);
                    //Actualiza el tamaño del borrador
                    drawView.setBrushSize(smallBrush);
                    //Cierra el cuadro de dialogo
                    brushDialog.dismiss();
                }
            });
            //Borrador mediano
            ImageButton mediumBtn = (ImageButton)brushDialog.findViewById(R.id.medium_brush);
            //Evento del botón mediano
            mediumBtn.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Inicia el sonido
                    Mediano.start();
                    //Cambia el valor del borrador a verdadero
                    drawView.setErase(true);
                    //Actualiza el tamaño del borrador
                    drawView.setBrushSize(mediumBrush);
                    //Cierra el cuadro de dialogo
                    brushDialog.dismiss();
                }
            });
            //Borrador grande
            ImageButton largeBtn = (ImageButton)brushDialog.findViewById(R.id.large_brush);
            //Evento del botón mediano
            largeBtn.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Inicia el sonido
                    Grande.start();
                    //Cambia el valor del borrador a verdadero
                    drawView.setErase(true);
                    //Actualiza el tamaño del borrador
                    drawView.setBrushSize(largeBrush);
                    //Cierra el cuadro de dialogo
                    brushDialog.dismiss();
                }
            });

            brushDialog.show();

        }
        //Si es elegida la opción de nuevo dibujo
        else if(view.getId() == R.id.new_btn)
        {
            //Inicia sonido
            Empezar_Dibujo.start();
            //Alerta con la opción para crear un nuevo dibujo
            AlertDialog.Builder newDialog = new AlertDialog.Builder(this);
            newDialog.setTitle("Nuevo dibujo");
            newDialog.setMessage("Estas seguro de empezar un nuevo dibujo?");
            //Si la opción es positiva
            newDialog.setPositiveButton("SI", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //Inicia sonido
                    Si.start();
                    //Limpia la pantalla y crea un nuevo lienzo en blanco
                    drawView.startNew();
                    //Cierra el cuadro de dialogo
                    dialog.dismiss();
                }
            });
            //Si la opción es negativa
            newDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //Inicia sonido
                    No.start();
                    //Devuelve al usuario al lienzo actual
                    dialog.cancel();
                }
            });
            newDialog.show();

        }
        //Si es elegida la opción de guardar
        else if(view.getId() == R.id.save_btn)
        {
            //Alerta con la opción para guardar dibujo
            AlertDialog.Builder saveDialog = new AlertDialog.Builder(this);
            //Inicia sonido
            Guardar.start();
            saveDialog.setTitle("Guardar el dibujo");
            saveDialog.setMessage("Quieres Guardar tu dibujo en la galeria del celular?");
            //Si la opción es positiva
            saveDialog.setPositiveButton("SI", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //Inicia sonido
                    Si.start();
                    //Se habilita el caché del dibujo
                    drawView.setDrawingCacheEnabled(true);
                    //Se crea una variable para almacenar el dibujo
                    String imageSaved = MediaStore.Images.Media.insertImage(
                            //Se obtiene la imagen almacenada en el cache  y se procede a guardar como un archivo con extensión png
                            getContentResolver(), drawView.getDrawingCache(),
                            UUID.randomUUID().toString()+".png", "drawing");

                    //Si se almacena exitosamente
                    if(imageSaved != null)
                    {
                        Toast savedToast = Toast.makeText(getApplicationContext(),
                                "Guardado en la galeria exitoso!", Toast.LENGTH_SHORT);
                        savedToast.show();
                    }else
                    //Si ocurre un error al guardar
                    {
                        Toast unsavedToast = Toast.makeText(getApplicationContext(),
                                "No se pudo guaradar tu dibujo", Toast.LENGTH_SHORT);
                        unsavedToast.show();
                    }
                    drawView.destroyDrawingCache();
                }
            });
            //Si la opción es negativa
            saveDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //Inicia sonido
                    No.start();
                    dialog.cancel();
                }
            });
            saveDialog.show();
        }
    }
}