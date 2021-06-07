package me.user.introArrays.models

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }
    fun entraReceiver(admin: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
            autenticado()
        } else {
            println("Falha na autenticação")
        }
    }

    fun pagamento(){
        println("realizando pagamento")
    }

}