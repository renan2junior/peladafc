package br.com.peladafc.apppeladafc.ws;

import java.io.IOException;
import java.util.List;
import br.com.peladafc.apppeladafc.model.Time;
import br.com.peladafc.apppeladafc.util.UtilJson;
import retrofit2.Call;

/**
 * Created by renanjunior on 7/22/16.
 */
public class TimeService {

    TimeInterface timeInterface;


    public TimeService(){
        timeInterface = ((TimeInterface)RestClient.getInstance(TimeInterface.class));
    }

    public List<Time> listaTimes(){
        Call<List<Time>> call = timeInterface.getTime();
        List<Time> times = null;
        try {
            times = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i =0 ; i < times.size(); i++) {
            System.out.print("Time : " + UtilJson.toJson(times.get(i)));
        }
        return times;
    }

    public Time createTime(Time time){
        Call<Time> call = timeInterface.createTime(time);
        try {
            time = call.execute().body();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.print("Time : " + time.getNome());
        return time;
    }

    public void deleteTime(String id){
        Call<Void> call = timeInterface.deleteTime(id);
        try{
            call.execute().body();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public Time getTimeByID(String id){
        Call<Time> call = timeInterface.getTimeByID(id);
        Time time = null;
        try {
            time = call.execute().body();
        }catch (IOException e){
            e.printStackTrace();
        }
        return time;
    }

    public Time updateTime(Time time){
        Call<Time> call = timeInterface.updateTime(time);
        Time time_retorno = null;
        try{
            time_retorno = call.execute().body();
        }catch (IOException e){
            e.printStackTrace();
        }
        return time_retorno;
    }

}
