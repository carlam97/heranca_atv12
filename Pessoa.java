public class Pessoa{
    private String nome;
    private String telefone;
    private String endereco;

//fazer os métodos de acesso publico
//get e set

public void setNome(String nome){
    this.nome=nome;
}
public String getNome(){
    return this.nome;
}
public void setTelefone(String telefone){
    this.telefone=telefone;
}
public String getTelefone(){
    return this.telefone;
}
public void setEndereco(String endereco){
    this.endereco=endereco;
}
public String getEndereco(){
    return this.endereco;
}

public Pessoa(){     // consultor padrão (tem o nome da classe e sem parametro) criado quando alguem instanciar a classe(new)

}
public Pessoa(String nome,){   // consultor com parametros, sendo assim somos obrigados a declarar o consultor padrão
    this.nome=nome;
}
public Pessoa(String nome, String telefone){
    this.nome=nome;
    this.telefone=telefone;
}

}