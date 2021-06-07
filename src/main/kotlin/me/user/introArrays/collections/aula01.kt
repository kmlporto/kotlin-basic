package me.user.introArrays.collections

fun main(){
    val banco = BancoDeNomes()
    banco.salva("Alex")

//  Com dados sendo sem o .toList() os nomes ficam como collections, dessa forma
//  conseguimos fazer um cast para uma lista mutável, então nomes ficam acessiveis
//  para alteração:
//    val nomesSalvos: MutableList<String> = banco.nomes as MutableList<String>
//    nomesSalvos.add("Julia")

//    Agora com dados.toList(), quando tentamos adicionar algum elemento, dá UnsupportedOperation
//    val nomesSalvos: MutableList<String> = banco.nomes as MutableList<String>
//    nomesSalvos.add("Julia")
    println(banco.nomes)

//    Para uma nova instância de BancoDeNomes ter os mesmos nomes, precisamos usar um
//    companion object
    println(BancoDeNomes().nomes)

}

class BancoDeNomes{
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome:String){
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}