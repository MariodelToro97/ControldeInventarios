package com.inventariostap.mario.controldeinventarios;

import android.view.View;

/**
 * Created by miguel on 5/11/17.
 */

public interface ItemClickListener {//INTERFAZ LA REALIZAR ACCIONES AL PRECIONAR SOBRE UN ELEMENTOS...UTILIZADO EN EL RECYCLEVIEW

    void onIntentClick(View view, int posicion);

}
