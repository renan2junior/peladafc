package br.com.peladafc.apppeladafc.ws;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by renanjunior on 7/22/16.
 */
public class RestClient {
    // Producao
    //private static final String BASE_URL = "https://apppeladafc.herokuapp.com";
    // Teste
    private static final String BASE_URL = "http://127.0.0.1:5000";
    public static Object getInstance(Class cl){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Object service = retrofit.create(cl);
        return service;
    }
}
