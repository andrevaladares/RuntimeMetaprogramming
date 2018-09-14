Expando expandoClass = new Expando()

expandoClass.nomeCriador ='Valada'
println "O criador dessa classe é: ${expandoClass.nomeCriador}"

expandoClass.digaAFrase =  {
   String frase -> println frase
}

expandoClass.digaAFrase("Oi! Frase nova")
expandoClass.digaAFrase("Oi! Frase velha")

expandoClass.dataCriacao = new Date()
expandoClass.localCriacao = 'Rio de Janeiro'
println "expando foi criado por ${expandoClass.nomeCriador} em ${expandoClass.localCriacao} na data ${expandoClass.dataCriacao}"

class Impressora{

}

Impressora impressora = new Impressora()

impressora.metaClass.nome = 'Empson x21'
impressora.metaClass.numSerie = 'f123456789'
impressora.metaClass.imprimir = {
    String autor, String texto ->
        println "${autor} solicitou a impressão de: ${texto}"
}

impressora.imprimir('Valada', 'Esse é meu nome')
println "Nome Impressora: ${impressora.nome}"
println "Num. série: ${impressora.numSerie}"