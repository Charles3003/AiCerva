package com.uiresource.cookit.Negocio;



public class Usuario_NG {

    public void Inserir(){

  }

  public void  Validar_Cadastro(Autenticar_Usuario_Grid_BD pAutenticar_Usuario_Grid_BD) throws Exception {
        if(pAutenticar_Usuario_Grid_BD.getNome_Razao_Social().isEmpty()){
            throw new Exception("O nome é obrigátorio");
        }
      if(pAutenticar_Usuario_Grid_BD.getEmail().isEmpty()){
          throw new Exception("O e-mail é obrigátorio");
      }
      if(pAutenticar_Usuario_Grid_BD.getSenha().isEmpty()){
          throw new Exception("A senha é obrigátorio");
      }
  }
}
