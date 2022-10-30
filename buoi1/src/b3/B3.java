package b3;

public class B3 {
    public static void main(String[] args){
        int i,j; //đứng, nằm,già
        for( i = 1; i * 5 < 100; i++)
            for( j=1; j * 3 < 100; j++){
                int k= 100 - i-j;
                if( k%3 == 0 && (i*5 + j*3 + (k/3))==100 )
                    System.out.println("số trâu đứng : "+ i + "số trâu nằm: "+j
                            +"số trâu già: "+ k);
            }


    }
}