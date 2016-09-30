package br.com.peladafc.apppeladafc.ws;

import java.io.IOException;
import java.util.List;

import br.com.peladafc.apppeladafc.model.Usuario;
import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by renanjunior on 9/12/16.
 */
public class UsuarioService {


    UsuarioInterface usuarioInterface;


    public UsuarioService(){ usuarioInterface = ((UsuarioInterface)RestClient.getInstance(UsuarioInterface.class));
    }

    public List<Usuario> listaUsuarios(){
        Call<List<Usuario>> call = usuarioInterface.getUsuario();
        List<Usuario> usuarios = null;
        try {
            Response<List<Usuario>> response = call.execute();
            usuarios = response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i =0 ; i < usuarios.size(); i++) {
            System.out.print("Usuario : " + usuarios.get(i).toString() );
        }
        return usuarios;
    }

    public Usuario createUsuario(Usuario usuario){
        Call<Usuario> call = usuarioInterface.createUsuario(usuario);
        try {
             usuario= call.execute().body();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.print("Usuario : " + usuario.getNome());
        return usuario;
    }

    public void deleteUsuario(Integer id){
        Call<Void> call = usuarioInterface.deleteUsuario(id);
        try{
            call.execute().body();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public Usuario getUsuarioByID(Integer id){
        Call<Usuario> call = usuarioInterface.getUsuarioByID(id);
        Usuario usuario = null;
        try {
             usuario= call.execute().body();
        }catch (IOException e){
            e.printStackTrace();
        }
        return usuario;
    }

    public Usuario getUsuarioByLogin(String email){
        Call<Usuario> call = usuarioInterface.getUsuarioByLogin(email);
        Usuario usuario = null;
        Response<Usuario> response;
        try {
            response = call.execute();
            usuario = response.body();
        }catch (IOException e){
            e.printStackTrace();
        }
        return usuario;
    }

    public Usuario updateUsuario(Usuario usuario){
        Call<Usuario> call = usuarioInterface.updateUsuario(usuario);
        Usuario usuario_retorno = null;
        try{ usuario_retorno = call.execute().body();
        }catch (IOException e){
            e.printStackTrace();
        }
        return usuario_retorno;
    }



}
