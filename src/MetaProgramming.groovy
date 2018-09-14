class Relogio {
    @Override
    Object invokeMethod(String nome, Object o) {
        if(nome == 'digaAHora'){
            return "O método '${nome}' ainda não é suportado pela aplicação mas será disponibilizado em breve"
        }
        else{
            return super.invokeMethod(nome, o)
        }
    }

    @Override
    Object getProperty(String nome) {
        if(!this.hasProperty(nome)){
            return "Propriedade '${nome}' ainda não existe"
        }
        else{
            return super.getProperty(nome)
        }
    }

    @Override
    void setProperty(String nome, Object o) {
        if(this.hasProperty(nome)){
            super.setProperty(nome, o)
        }
        else {
            println "Propriedade '${nome}' ainda não existe na aplicação"
        }
    }
}

def relogio = new Relogio()

println relogio.digaAHora()

relogio.tipo = 'digital'

println relogio.tipo