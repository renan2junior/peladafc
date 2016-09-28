package br.com.peladafc.apppeladafc.ws;

import java.io.IOException;
import java.util.List;

import br.com.peladafc.apppeladafc.model.Usuario;
import retrofit2.Call;

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
        try { usuarios = call.execute().body();
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

    public void deleteUsuario(String id){
        Call<Void> call = usuarioInterface.deleteUsuario(id);
        try{
            call.execute().body();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public Usuario getUsuarioByID(String id){
        Call<Usuario> call = usuarioInterface.getUsuarioByID(id);
        Usuario usuario = null;
        try {
             usuario= call.execute().body();
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
