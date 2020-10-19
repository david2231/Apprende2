package gz.app.comdavid.apprende2.Paint;
//Librerias
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import android.graphics.Color;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.TypedValue;

import gz.app.comdavid.apprende2.R;

//Clase vista la cual extiende a una super clase llamada View
public class paint extends View {

    //Se coloca un trazó en el lienzo por donde vaya presionando el usuario
    private Path drawPath;
    //Dibujo y color del lienzo
    private Paint drawPaint, canvasPaint;
    //Color inicial del lienzo
    private int paintColor = 0xFF660000;
    //Se realiza el dibujo del lienzo
    private Canvas drawCanvas;
    //Se establece un objeto del lienzo
    private Bitmap canvasBitmap;
    //Tamaño del pincel
    private float brushSize, lastBrushSize;
    //Borrador
    private boolean erase = false;

    public paint(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        //Se realiza el llamado del método setupDrawing
        setupDrawing();
    }
    //
    private void setupDrawing()
    {
        //se obtiene los valores por defecto para el lienzo inicial
        drawPath = new Path();
        //Objeto Paint que controle el estilo del color de lo que se va dibujando
        drawPaint = new Paint();
        //se obtiene los valores por defecto para el lienzo inicial
        drawPaint.setColor(paintColor);
        drawPaint.setAntiAlias(true);
        //Tamaño incial del pincel
        drawPaint.setStrokeWidth(20);
        drawPaint.setStyle(Paint.Style.STROKE);
        //Estilo del trazo
        drawPaint.setStrokeJoin(Paint.Join.ROUND);
        drawPaint.setStrokeCap(Paint.Cap.ROUND);

        canvasPaint = new Paint(Paint.DITHER_FLAG);

        //Cambiar el tamaño del pincel
        brushSize = getResources().getInteger(R.integer.medium_size);
        lastBrushSize = brushSize;
        drawPaint.setStrokeWidth(brushSize);
    }
//Se utiliza el metodo cuando el tamaño de esta vista ha cambiado.
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh)
    {
        super.onSizeChanged(w, h, oldw, oldh);
        canvasBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        drawCanvas = new Canvas(canvasBitmap);
    }
    //Se utiliza cuando se va llamar al contenido
    @Override
    protected void onDraw(Canvas canvas)
    {
        //draw view
        canvas.drawBitmap(canvasBitmap, 0, 0, canvasPaint);
        canvas.drawPath(drawPath, drawPaint);
    }
    //Se utiliza cuando ocurre un evento tactil en pantalla
    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        //Detecta un evento del usuario
        float touchX = event.getX();
        float touchY = event.getY();
        // Se declara un Switch con el fin de obtener las coordenadas del usuario
        switch (event.getAction())
        {
            // Cuando el usuario se mueve hacia abajo
            case MotionEvent.ACTION_DOWN : drawPath.moveTo(touchX, touchY);
                break;
            // Cuando el usuario se mueve en la pantalla
            case MotionEvent.ACTION_MOVE : drawPath.lineTo(touchX, touchY);
                break;
            // Cuando el usuario se mueve hacia arriba
            case MotionEvent.ACTION_UP : drawCanvas.drawPath(drawPath, drawPaint);
                drawPath.reset();
                break;
            default: return false;
        }
        invalidate();
        return true;
    }

    public void setColor(String newColor)
    {
        //Se establce el color
        invalidate();
        paintColor = Color.parseColor(newColor);
        drawPaint.setColor(paintColor);
    }

    public void setBrushSize(float newsize)
    {
        //Se actualiza el tamaño del pincel
        float pixelAmount = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, newsize, getResources().getDisplayMetrics());
        brushSize = pixelAmount;
        drawPaint.setStrokeWidth(brushSize);
    }
    //Obtiene el ultimo tamaño del pincel
    public void setLastBrushSize(float lastsize)
    {
        lastBrushSize = lastsize;
    }

    public float getLastBrushSize()
    {
        return lastBrushSize;
    }

    public void setErase(boolean isErase)
    {
        //Set para el borrador verdadero o falso
        erase = isErase;
        if(erase)
        {
            drawPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }else
        {
            drawPaint.setXfermode(null);
        }
    }
    //Nuevo lienzo en blanco
    public void startNew()
    {
        drawCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        invalidate();
    }
}
