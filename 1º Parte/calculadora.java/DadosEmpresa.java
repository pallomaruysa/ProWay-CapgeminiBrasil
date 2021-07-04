public class DadosEmpresa{
    
    private String nomeEmpresa;
    private String CNPJ;
    private String email;
    private double valorInvestido;
    
    DadosEmpresa(String nome, String cnpj, String email, double val_Invest){
        this.nomeEmpresa = nome;
        this.CNPJ = cnpj;
        this.email = email;
        this.valorInvestido = val_Invest;
    }
    DadosEmpresa(){
        
    }
    
    public String getNomeEmpresa(){
        return nomeEmpresa;
    }
    public void setNomeEmpresa(String nome){
        this.nomeEmpresa = nome;
    }
    
    public String getCNPJ(){
        return CNPJ;
    }
    public void setCNPJ(String cnpj){
        this.CNPJ = cnpj;
    }
   
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public double getValorInvestido(){
        return valorInvestido;
    }
    public void setValorInvestido(double val_Invest){
        this.valorInvestido = val_Invest;
    }

}