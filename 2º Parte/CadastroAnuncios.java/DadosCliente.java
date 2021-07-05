public class DadosCliente{
    
    private String nomeCliente;
    private String CPF_CNPJ;
    private String email;
    private String telefone1;
    private String telefone2;
    
    DadosCliente(String nome, String cpf_cnpj, String email, String fone1, String fone2){
        this.nomeCliente = nome;
        this.CPF_CNPJ = cpf_cnpj;
        this.email = email;
        this.telefone1 = fone1;
        this.telefone2 = fone2;
    }
    DadosCliente(){
        
    }
    
    public String getNomeCliente(){
        return nomeCliente;
    }
    public void setNomeCliente(String nome){
        this.nomeCliente = nome;
    }
    
    public String getCPF_CNPJ(){
        return CPF_CNPJ;
    }
    public void setCPF_CNPJ(String cpf_cnpj){
        this.CPF_CNPJ = cpf_cnpj;
    }
   
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getTelefone1(){
        return telefone1;
    }
    public void setTelefone1(String fone1){
        this.telefone1 = fone1;
    }
    public String getTelefone2(){
        return telefone2;
    }
    public void setTelefone2(String fone2){
        this.telefone2 = fone2;
    }

}