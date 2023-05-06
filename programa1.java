class programa1 {
    
//variables globales
    static int [] [] mapa = {
        {1,1,1},
        {1,2,1},
        {1,1,1},
    };

//funciones
static void dibujarMapa () {

    for ( int i = 0 ; i < 3 ; i++ ) {
        for ( int j = 0 ; j < 3 ; j++ ) {
            
           if ( j != 2 ) {

                if ( mapa [i] [j] == 1 ) {

                    System.out.print("X");

                }

                if ( mapa [i] [j] == 2 ) {

                    System.out.print("■");

                }

           }

           else {

            if ( mapa [i] [j] == 1 ) {

                System.out.println("X");

            }

            if ( mapa [i] [j] == 2 ) {

                System.out.println("■");

            }

           }

        }
    }

}

//nucleo
static public void main (String args[]) {

//llamamos funcion (no estatica) para dibujar la variable global mapa...pero DA ERROR D:
    dibujarMapa();

}

}